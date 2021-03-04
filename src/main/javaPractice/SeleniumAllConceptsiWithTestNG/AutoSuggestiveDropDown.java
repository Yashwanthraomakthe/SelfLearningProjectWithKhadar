// This part is not executed due to xpath issue

package SeleniumAllConceptsiWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoSuggestiveDropDown {
public WebDriver driver;
	@Test(groups="Failed")
	public  void AutoSuggestiveDropDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		
		
		WebElement source =driver.findElement(By.xpath("//input[@type='text' and @placeholder='From']"));
		//WebElement source =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		
		//Below 2 lines are correct one but commented as part of testng Listeners practice
		//WebDriverWait wait = new WebDriverWait(driver, 5000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text' and @placeholder='From']")));
		
		source.click();
		source.sendKeys("mum");
		source.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		WebElement destination =driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		destination.click();
		destination.sendKeys("che");
		destination.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		System.out.println("Source and destination selected");
		driver.close();
		
		

	}

}
