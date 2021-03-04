package TestCases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TravelocitySearchHotel {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\SDET\\test2\\DriverNew\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.travelocity.com/");

		// Entering Hyderabad in Going to Text field and selecting one option
		driver.findElement(By.xpath("//input[@id='location-field-destination-input']//following-sibling::button"))
				.click();
		driver.findElement(By.xpath("//input[@id='location-field-destination']")).sendKeys("Chicago", Keys.ENTER);
		Thread.sleep(3000);

		// Clicking on Checkin and
		driver.findElement(By.xpath("//button[@id='d1-btn']")).click();
		Thread.sleep(3000);

		// Navigate to Oct month
		int i = 0;
		while (i < 7) {
			driver.findElement(By.xpath(
					"//div[contains(@class,'uitk-flex uitk-flex-justify-content-space-between uitk-date-picker-menu-pagination-container')]//button[2]"))
					.click();
			i++;
			Thread.sleep(2000);
		}

		// selecting oct1 2021 to oct 10 dates

		driver.findElement(By.xpath(
				"//button[contains(@class,'uitk-date-picker-day uitk-new-date-picker-day') and @aria-label='Oct 1, 2021.']"))
				.click();
		driver.findElement(By.xpath(
				"//button[contains(@class,'uitk-date-picker-day uitk-new-date-picker-day') and @aria-label='Oct 10, 2021.']"))
				.click();

		driver.findElement(By.xpath("//span[text()='Done']")).click();

		// selecting number of travelers
		driver.findElement(By.xpath("//div[@id='adaptive-menu']")).click();

		// Selecting adults
		int j = 0;
		while (j < 3) {
			driver.findElement(By.xpath(
					"//button[contains(@class,'uitk-button uitk-button-small uitk-flex-item uitk-step-input-button')][2]"))
					.click();
			Thread.sleep(2000);
			j++;
		}

		driver.findElement(By.xpath("//button[text()='Done']")).click();

		// Click on Search button
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(7000);

		// Search second hote
		List<WebElement> ListofHotelNames = driver
				.findElements(By.xpath("//a[contains(@class,'listing__link uitk-card-link')]"));
		ListofHotelNames.get(1).click();

		System.out.println(driver.getTitle());

		Set<String> handler = driver.getWindowHandles();
		Iterator<String> itr = handler.iterator();
		String ParentWindow = itr.next();
		String ChildWindow = itr.next();

		driver.switchTo().window(ChildWindow);

		Thread.sleep(5000);
		System.out.println(driver.getTitle());

		System.out.println("Values enterd");
		//driver.quit();
	}

}
