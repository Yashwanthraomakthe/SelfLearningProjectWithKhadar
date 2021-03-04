package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Travelocity_SearchFunctionality extends BaseClass_Travelocity {

	// Going to Chicago
	// Checkin Date Oct1 and Checkout Date is Oct 10
	// Travelers must be 3 adults and 4 childers

	@Test()
	public void searchHotels() throws InterruptedException {
		
		//Entering Hyderabad in Going to Text field and selecting one option
		driver.findElement(By.xpath("//input[@id='location-field-destination-input']//following-sibling::button"))
				.click();
		driver.findElement(By.xpath("//input[@id='location-field-destination']")).sendKeys("Chicago",Keys.ENTER);
		Thread.sleep(3000);

		//Clicking on Checkin and 
		driver.findElement(By.xpath("//button[@id='d1-btn']")).click();
		Thread.sleep(3000);
		
		//Navigate to Oct month
		int i=0;
		while(i<7) {
		driver.findElement(By.xpath("//div[contains(@class,'uitk-flex uitk-flex-justify-content-space-between uitk-date-picker-menu-pagination-container')]//button[2]")).click();
		i++;
		Thread.sleep(2000);
		}
		
		//selecting oct1 2021 to oct 10 dates
		
		driver.findElement(By.xpath("//button[contains(@class,'uitk-date-picker-day uitk-new-date-picker-day') and @aria-label='Oct 1, 2021.']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'uitk-date-picker-day uitk-new-date-picker-day') and @aria-label='Oct 10, 2021.']")).click();
		
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		
		
		//selecting number of travelers
		driver.findElement(By.xpath("//div[@id='adaptive-menu']")).click();
		
		//Selecting adults
		int j=0;
		while(j<3) {
			driver.findElement(By.xpath("//button[contains(@class,'uitk-button uitk-button-small uitk-flex-item uitk-step-input-button')][2]")).click();
			j++;
		}
		
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		
		//Click on Search button
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(7000);
		
		
		//Search second hote
		List<WebElement> ListofHotelNames = driver.findElements(By.xpath("//a[contains(@class,'listing__link uitk-card-link')]"));
		ListofHotelNames.get(2).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		

		System.out.println("Values enterd");
		driver.close();
	}

}
