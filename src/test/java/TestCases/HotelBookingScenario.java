package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HotelBookingScenario extends BaseClass{
	
	
	public static void main(String[] args) throws InterruptedException {
	
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com/");
		
		driver.manage().window().maximize();
		
		//Entering Where you are going
		driver.findElement(By.xpath("//input[@id='ss']")).sendKeys("india");
		Thread.sleep(5000);
		
		//Selecting Check-in time and Check-out time
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[1]/table/tbody/tr[4]/td[6]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[4]/td[4]/span/span")).click();
		Thread.sleep(5000);
		
		
		//Selecting adults and children and rooms
		
		driver.findElement(By.xpath("//label[@id='xp__guests__toggle']")).click();
		Thread.sleep(5000);
		//Click on Search button
		
		driver.findElement(By.xpath("//button[@class='sb-searchbox__button ']")).click();
		System.out.println("Search button clicked successfully");
		Thread.sleep(5000);
		
		//Select the hotel
		//driver.findElement(By.xpath("//div[@id='hotellist_inner']//div[2]//div")).click();
		List<WebElement> hotelnames =driver.findElements(By.xpath("//a[@class='js-sr-hotel-link hotel_name_link url']//span"));
		int noOfHotels = hotelnames.size();
		for(int i =0;i<noOfHotels;i++) {
			
			String hotelname = hotelnames.get(i).getText();
			System.out.println(hotelname);
		}
		Thread.sleep(5000);
		
		
		System.out.println("Hotel clicked");
		driver.close();
	}

}
