package SeleniumAllConceptsiWithTestNG;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandilingMultipleWindows {

	@Test(groups="Failed")
	public  void HandilingMultipleWindows(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=AddSession&cid=0&navigationDirection=forward");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it= handler.iterator();
		
		String Parentwindow = it.next();
		String childwindow =  it.next();

		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		
		
		
		driver.switchTo().window(Parentwindow);
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		// below line given org.openqa.selenium.ElementNotInteractableException: check once
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test");
		
		
		driver.quit();
		
	}

}
