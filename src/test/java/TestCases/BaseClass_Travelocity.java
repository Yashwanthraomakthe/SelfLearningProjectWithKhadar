package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass_Travelocity {

	public WebDriver driver;

	@BeforeMethod()
	public void setUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.travelocity.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
