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
		
		List<WebElement>  checkboxs= driver.findElements(By.xpath("//div[@id='discount-checkbox']/div/label"));
		for(WebElement option:checkboxs) {
			String Checkboxnames =option.getText();
			if(Checkboxnames.equalsIgnoreCase("Student")) {
				option.click();
				Thread.sleep(3000);
			}
			System.out.println("Check Box name:" +Checkboxnames );
			
		}
		
		
		
		System.out.println("check box selected");
		
		
		//Number of checkbox in given page
		List<WebElement> checkboxcount = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of Checkboxs " +checkboxcount.size());
		
		driver.close();

	}

}
