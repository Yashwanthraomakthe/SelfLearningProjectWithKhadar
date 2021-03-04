package SeleniumAllConceptsiWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FramesDemo {

	@Test
	public  void FramesDemo() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); //tagname.classname  gives css selector
		
		driver.findElements(By.tagName("iframe"));
		
		Actions action = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(source, target).build().perform();;
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		driver.close();
	}

}
