package SeleniumAllConceptsiWithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {

	@Test
	public static void Checkbox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		System.out.println("check box selected");
		
		
		//Number of checkbox in given page
		List<WebElement> checkboxcount = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkboxcount.size());
		
		driver.close();

	}

}
