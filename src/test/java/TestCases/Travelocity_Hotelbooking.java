package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travelocity_Hotelbooking {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.travelocity.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		//Entering Going to value
		//driver.findElement(By.xpath("//button[contains(@Class,'uitk-faux-input')]")).click();
		driver.findElement(By.xpath("//button[@class='uitk-faux-input']")).sendKeys("Chicago");
		//Click on Checkin button
		driver.findElement(By.xpath("//button[@id='d1-btn']")).click();
		//Select the Oct1 to Oct 14 dates
		
		int i =0;
		while(i<7) {
		driver.findElement(By.xpath("//div[contains(@class,'uitk-calendar')]//div//button[2]")).click();
		i++;
		Thread.sleep(3000);
		}
		System.out.println("Navigate to oct month successfully");
		
		
		driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[3]/td[1]/button")).click();
		driver.findElement(By.xpath("//button[contains(@class,'uitk-button uitk-button-small uitk-button-has-text uitk-button-primary uitk-flex-align-self-flex-end uitk-flex-item uitk-flex-shrink-0 dialog-done')]")).click();
		
		//click on Travelers button
		
		driver.findElement(By.xpath("//button[contains(@class,'uitk-fake-input uitk-form-field-trigger')]")).click();
		
		int j=0;
		while(j<3) {
			driver.findElement(By.xpath("//button[contains(@class,'uitk-button uitk-button-small uitk-flex-item uitk-step-input-button')][2]")).click();
			j++;
		}
		System.out.println("3 adutls section successfully");
		
		
		//click on done button
		driver.findElement(By.xpath("//button[contains(@class,'uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary uitk-button-floating')]")).click();
		Thread.sleep(2000);
		System.out.println("Click on Done button successfully");
		
		//Click  on search burron
		driver.findElement(By.xpath("//button[text()=\"Search\"]")).click();
		Thread.sleep(2000);
		System.out.println("Click on  Search successfully");
		//click on first avialable hotel
		
		driver.findElement(By.xpath("//div[contains(@class,'uitk-card-content uitk-grid uitk-cell all-y-padding-three all-x-padding-three listing-content')]")).click();
		Thread.sleep(2000);
		System.out.println("First Hotel Search successfully");
		driver.close();
	}

}
