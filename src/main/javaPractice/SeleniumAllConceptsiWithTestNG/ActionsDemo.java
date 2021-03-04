package SeleniumAllConceptsiWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo {
	@Test
	public  void ActionsDemo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.manage().deleteCookieNamed("test");
		//driver.manage().addCookie(null);
		
		
		
		Actions a =new Actions(driver);
		//move to certain element
		a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-tools']/ a[2]/span"))).build().perform();
		Thread.sleep(3000);
		
		//Write something in capital letter
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		Thread.sleep(3000);
		
		//rightclick
		a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-tools']/ a[2]/span"))).contextClick().build().perform();
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		driver.close();
		
		
		

	}

}
