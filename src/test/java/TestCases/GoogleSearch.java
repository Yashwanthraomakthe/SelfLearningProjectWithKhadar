package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		Wishwork();

	}

	public static void Wishwork() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]")).sendKeys("Time in ");
		Thread.sleep(3000);
		
		//List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"input\"]"));
		//System.out.println("Number of suggestions " + list.size());
		//Thread.sleep(3000);

		System.out.println("success");
		
		driver.close();
	}

}
