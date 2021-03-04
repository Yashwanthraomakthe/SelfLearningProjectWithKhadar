package SeleniumAllConceptsiWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class XpathSession {

	@Test
	public  void XpathSession() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v1/");
		driver.manage().window().maximize();
		
		/* absolute xpath
		 * driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("test");
		*driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("test");
		*driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		 */
		
		
		/*
		 * Relative Xpath
		 */
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Yashwanth");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Yashwnath");
		
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
