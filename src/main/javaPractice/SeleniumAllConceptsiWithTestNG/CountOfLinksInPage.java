package SeleniumAllConceptsiWithTestNG;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountOfLinksInPage {

	@Test
	public  void CountOfLinksInPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		// get the number of links in whole page
		System.out.println("Number of links in whole page");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// get the number of links in footer section --- limiting webdriver scope
		System.out.println("Number of links in footer section");
		WebElement footerlocator = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerlocator.findElements(By.tagName("a")).size());

		// get the number of links in one column of footer body
		// print the title for each page title
		WebElement footerfirstcolumn = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td"));
		System.out.println("Number of links in one column of footer body");
		System.out.println(footerfirstcolumn.findElements(By.tagName("a")).size());

		for (int i = 1; i < footerfirstcolumn.findElements(By.tagName("a")).size(); i++) {
			footerfirstcolumn.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
			Thread.sleep(2000);

		}
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

		driver.quit();

	}

}
