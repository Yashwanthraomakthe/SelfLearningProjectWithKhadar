package SeleniumAllConceptsiWithTestNG;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AddToCartMultipleVegitables {
	
	@Test
	public  void AddToCartMultipleVegitables() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		int iteamselectedcount=0;
		
		String[] NeededIteamsNames = {"Cucumber","Brocolli","Beetroot"};
		int lenthofArray=NeededIteamsNames.length;
		
		List<WebElement> retrivedIteam =driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		//Convert array to array list
		List ListofNeededIteamsNames = Arrays.asList(NeededIteamsNames);
		
		for(int i=0; i<retrivedIteam.size();i++) {
			String[] RetrivedIteamName=retrivedIteam.get(i).getText().split("-");
			String FormatedRerquiredname =RetrivedIteamName[0].trim();
			System.out.println(FormatedRerquiredname);
			Thread.sleep(3000);
			
			
			if(ListofNeededIteamsNames.contains(FormatedRerquiredname)) {
				iteamselectedcount++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				Thread.sleep(3000);
				if(iteamselectedcount==lenthofArray) {
					break;
				}
				
			}
		}
		
		System.out.println(driver.getTitle());
		driver.close();

	}
	
	
	

}
