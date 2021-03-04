package SeleniumAllConceptsiWithTestNG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import sun.jvm.hotspot.utilities.Assert;

//import com.sun.tools.javac.util.Assert;





public class TableColumnSorting {

	@Test
	public  void TableColumnSorting() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("***********************");
		List<WebElement> itemsnames = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr/td[2]"));
		ArrayList retrivedlist = new ArrayList();
		for (int i = 0; i < itemsnames.size(); i++) {
			String itemname = itemsnames.get(i).getText();
			retrivedlist.add(itemname);

		}
		System.out.print(retrivedlist);

		System.out.println("***********************");
		ArrayList copyretrivedlist = (ArrayList) retrivedlist.clone();
		
		Collections.sort(copyretrivedlist);
		System.out.print(copyretrivedlist);
		
		System.out.println("***********************");
		System.out.println(retrivedlist.equals(copyretrivedlist));

		System.out.println();
		driver.close();
	}

}
