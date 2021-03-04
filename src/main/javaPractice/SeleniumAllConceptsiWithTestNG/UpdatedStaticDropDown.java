package SeleniumAllConceptsiWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdatedStaticDropDown {

	@Test(groups="Failed")
	public  void UpdatedStaticDropDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Select selectadult = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		selectadult.selectByVisibleText("2");
		Thread.sleep(3000);
		
		Select selectchild = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
		selectchild.selectByVisibleText("2");
		Thread.sleep(3000);
		
		Select selectinfact = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']")));
		selectinfact.selectByVisibleText("2");
		Thread.sleep(3000);
		
		
		driver.close();

	}

}
