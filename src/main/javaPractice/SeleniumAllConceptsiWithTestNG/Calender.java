package SeleniumAllConceptsiWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {

	@Test(groups="Failed")
	public  void Calender() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		
		System.out.println("Current Date selected");
		
	}

}
