package SeleniumAllConceptsiWithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableSumOfOneRow {

	
	@Test
	public  void TableSumOfOneRow() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23912/saur-vs-ben-final-ranji-trophy-2019-20");
		driver.manage().window().maximize();
		
		WebElement table =driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		List<WebElement> row =table.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']"));
		int numberofrows = row.size();
		
		int sumofPlyerscores =0;
		for(int i=1;i<numberofrows;i++) {
			String sumofscore = row.get(i).getText();
			int scorescount = Integer.valueOf(sumofscore);
			sumofPlyerscores = sumofPlyerscores +scorescount;
					
		}
		System.out.println(sumofPlyerscores);
		
		String extra = driver.findElement(By.xpath("//div[@class='cb-col cb-col-60']/following-sibling::div")).getText();
		//int extrascore = Integer.valueOf(extra);
		int extrascore = Integer.parseInt(extra);
		System.out.println(extrascore);
		
		int totalinnigsscore = sumofPlyerscores +extrascore;
		System.out.println(totalinnigsscore);
		
		System.out.println(driver.getTitle());
		driver.close();

	}

}
