package SeleniumAllConceptsiWithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableSumOfOneRow {

	@Test
	public void TableSumOfOneRow() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Opening Site
		driver.get("https://www.cricbuzz.com/");
		// Select the third match under Featured Matches
		driver.findElement(By.xpath("//div[@id='hm-scag-mtch-blk']//ul//li[3]/a")).click();
		Thread.sleep(3000);
		// Click on Scorcard for specific match
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();

		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		List<WebElement> runs = table.findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']"));
		int numberofruns = runs.size();
		System.out.println("Number of runs rows" + numberofruns);

		List<WebElement> batsmanname = table
				.findElements(By.cssSelector("div[class='cb-col cb-col-27 ']"));
		int numberofbatmans = batsmanname.size();
		System.out.println("Number of batmens rows" + numberofbatmans);

		//Printing one batsman score
		for (int i = 0; i < numberofbatmans; i++) {
			if (batsmanname.get(i).getText().equalsIgnoreCase("Maxwell")) {
				String score = runs.get(i).getText();
				System.out.println("Batsman name " + batsmanname.get(i).getText() + score);
			}
		}

		int sumofPlyerscores = 0;
		for (int i = 1; i < numberofruns; i++) {
			String sumofscore = runs.get(i).getText();
			int scorescount = Integer.valueOf(sumofscore);
			sumofPlyerscores = sumofPlyerscores + scorescount;

		}
		System.out.println(sumofPlyerscores);

		String extra = driver.findElement(By.xpath("//div[@class='cb-col cb-col-60']/following-sibling::div"))
				.getText();
		// int extrascore = Integer.valueOf(extra);
		int extrascore = Integer.parseInt(extra);
		System.out.println(extrascore);

		int totalinnigsscore = sumofPlyerscores + extrascore;
		System.out.println(totalinnigsscore);

		System.out.println(driver.getTitle());
		// driver.close();

	}

}
