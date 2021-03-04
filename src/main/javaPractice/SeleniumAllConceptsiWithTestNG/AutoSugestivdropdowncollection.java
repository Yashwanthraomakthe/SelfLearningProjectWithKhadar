package SeleniumAllConceptsiWithTestNG;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AutoSugestivdropdowncollection {

	@Test
	public  void AutoSugestivdropdowncollection() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		
		//ChromeOptions options = new ChromeOptions();
		//WebDriver driver = new ChromeDriver(options);
		
		WebDriver driver = new ChromeDriver();
		
		
		
		Thread.sleep(2000);
		driver.get("https://www.tsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		
		// THe below block of code wont work for hidden element so using Java script executor concept
		/*driver.findElement(By.id("fromPlaceName")).sendKeys("Hyd");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText()); */
		
		Thread.sleep(3000);
		driver.findElement(By.id("fromPlaceName")).sendKeys("Hyd");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		//System.out.println(text);
		
		while(!text.equalsIgnoreCase("HYDERABAD AIRPORT-RGIA"))
		{
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			Thread.sleep(3000);
			text = (String) js.executeScript(script);
			System.out.println(text);
			
			int i=0;
			if(i>5) {
				break;//break the loop of you wont find required verification name
			}
			
		}
		driver.close();
	}

}
