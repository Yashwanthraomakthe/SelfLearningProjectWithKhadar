package SeleniumAllConceptsiWithTestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandilingMultipleWindows {

	@Test()
	public  void HandilingMultipleWindowsConcept() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it= handler.iterator();
		
		String Parentwindow = it.next();
		String childwindow =  it.next();

		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		
		
		driver.switchTo().window(Parentwindow);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		// below line given org.openqa.selenium.ElementNotInteractableException: check once
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test");
		
		
		//driver.quit();
		
	}

}
