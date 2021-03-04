//calender concept is not fully completed
package SeleniumAllConceptsiWithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalenderDynamicDateSelection {

	@Test(groups="Failed")
	public  void CalenderDynamicDateSelection() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// inputDate -31st March
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();

		String month = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
		System.out.println(month);

		while (!month.equalsIgnoreCase("May 2020")) {
			//String month = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			driver.findElement(By.xpath("//span[contains(@class,'next')]")).click();
			// driver.findElement(By.xpath("//div[@class='DayPicker-NavButton
			// DayPicker-NavButton--next")).click();
			Thread.sleep(2000);

		}

		List<WebElement> datenum = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
		for (int i = 0; i < datenum.size(); i++) {
			String dataname = datenum.get(i).getText();

			if (dataname.equals(25)) {
				datenum.get(i).click();
				Thread.sleep(2000);
				break;
			}

		}

		Thread.sleep(2000);

		System.out.println(driver.getTitle());
		driver.close();

	}

}
