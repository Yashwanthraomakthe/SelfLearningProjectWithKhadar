package SeleniumAllConceptsiWithTestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class ScreenshotsDemo {

	@Test
	public  void ScreenshotsDemo() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		File src = (File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("F://Screenshot.png"));
		
		System.out.println(driver.getTitle());
		driver.close();

	}

}
