package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearch extends BaseClass{
	
	
	@Test()
	public void Wishwork() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]")).sendKeys("Wishworks");			
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		
	}
	
	

}
