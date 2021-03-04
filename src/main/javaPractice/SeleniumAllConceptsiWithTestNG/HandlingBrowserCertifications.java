package SeleniumAllConceptsiWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HandlingBrowserCertifications {

	@Test
	public  void HandlingBrowserCertifications() {
		
		
		
		// Desiredcapabilities used for general chrome profile
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts(); -->Below 2 lines can be used
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Chromeoptions to your local browser
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
		
		
	}

}
