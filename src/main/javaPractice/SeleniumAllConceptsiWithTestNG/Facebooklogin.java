package SeleniumAllConceptsiWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Facebooklogin {

	@Test
	public  void Facebooklogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//java.util.List<WebElement> NumberOfLinks =driver.findElements(By.tagName("a"));
		//System.out.println(NumberOfLinks);
		
		driver.findElement(By.id("email")).sendKeys("yashwanthrao425@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("kamalabai");
		driver.findElement(By.id("u_0_b")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.id("userNavigationLabel")).click();
		
		driver.close();

	}

}
