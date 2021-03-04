package TestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travelocity_HotelPrice_Validation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.travelocity.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@class='uitk-faux-input']")).sendKeys("Chicago", Keys.ENTER);

		driver.findElement(By.xpath("//button[text()=\"Search\"]")).click();
		Thread.sleep(15000);
		System.out.println("Click on  Search successfully");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		ArrayList keyList = new ArrayList();
		ArrayList valueList = new ArrayList();
		List<WebElement> Hotels = driver.findElements(By.xpath("//a[contains(@class,'listing__link uitk-card-link')]"));
		int noOfHotels = Hotels.size();
		System.out.println("Hotels Count" + noOfHotels);
		for (int i = 0; i < noOfHotels; i++) {
			String HotelName = Hotels.get(i).getText();
			String splitHotelname = HotelName.substring(23);
			String[] ActualHotelName = splitHotelname.split(",");
			String name = ActualHotelName[0];
			keyList.add(name);
			System.out.println(name);
		}

		List<WebElement> prices = driver
				.findElements(By.xpath("//span[contains(@class,'uitk-cell loyalty-display-price all-cell-shrink')]//span[contains(@data-stid,'content-hotel-lead-price')]"));
		int pricescount = prices.size();
		System.out.println("Priceses count" + pricescount);

		for (int i = 0; i < pricescount; i++) {
			String HotelPrice = prices.get(i).getText();
			valueList.add(HotelPrice);
			System.out.println(HotelPrice);
		}

		System.out.println("--------------------------------------------------");
		for(int i=0;i<pricescount;i++) {
			System.out.println(keyList.get(i).toString()+"----" +prices.get(i).getText());
		}
		
		
		System.out.println("--------------------------------------------------");
		
		if (noOfHotels == pricescount) {
			System.out.println("Hotel names name prices count matching");
		} else
			System.out.println("Hotel names name prices count not matching");
	
		
		

	}

}