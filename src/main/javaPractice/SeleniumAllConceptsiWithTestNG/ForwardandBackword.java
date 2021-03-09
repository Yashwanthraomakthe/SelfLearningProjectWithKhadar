package SeleniumAllConceptsiWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ForwardandBackword {

	@Test
	public void Demo() {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String siteName=driver.getTitle();
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Current URl is " + currentUrl);
		
		System.out.println("Site name is "+ siteName);
		
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);
		
		driver.get("https://gaana.com/browse");
		String currentUrlgaana=driver.getCurrentUrl();
		String siteNamegaana=driver.getTitle();
		System.out.println("Current URl is " + currentUrlgaana);
		
		System.out.println("Site name is "+ siteNamegaana);
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		driver.close();
	
	}

}
