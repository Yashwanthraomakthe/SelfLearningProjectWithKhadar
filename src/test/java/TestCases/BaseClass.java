package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.beust.jcommander.Parameter;

import Utilities.ReadConfig;

public class BaseClass {

	public WebDriver driver;
	public ExtentReports extent;

	@BeforeClass()
	public void setUp(String b) throws InterruptedException {

		ReadConfig rc = new ReadConfig();

		System.setProperty("webdriver.chrome.driver", rc.getChromeDriverPath());
		
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("incognito");
	    DesiredCapabilities cap = DesiredCapabilities.chrome();
	    cap.setCapability(ChromeOptions.CAPABILITY, options);
	    driver = new ChromeDriver(cap);
	    
//		driver = new ChromeDriver();
	driver.get(rc.getApplicationURL());
		
		
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterClass()
	public void tearDown() {
		driver.quit();
	}

	public int generateRandomNum() {
		Random random = new Random();
		int randromnum = random.nextInt(9999);
		System.out.println("Generated Radom number " + randromnum);
		return randromnum;
	}

	public String getScreenshotpath(String testMethodName, WebDriver driver) throws IOException {
		System.out.println("Driver in Screenshot method " + driver);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\Screenshots\\" + testMethodName + ".png";
		FileUtils.copyFile(Source, new File(destinationFile));
		return destinationFile;
	}

	public WebDriver getDriver() {
		return driver;

	}

}
