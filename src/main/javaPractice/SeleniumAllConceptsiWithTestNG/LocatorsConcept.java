package SeleniumAllConceptsiWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorsConcept {

	
	@Test(groups="Failed")
	public  void LocatorsConcept() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YashPooja\\SelfLearningProjectWithKhadar\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v1/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//UserId and Password xpath -->Basic Xpath
		driver.findElement(By.xpath("//input[@name='uid']")).click();;
		driver.findElement(By.xpath("//input[@name='password']")).click();
		
		
		
		//Contains Functions - used to identified elements with same xpath
		System.out.println(driver.findElement(By.xpath("//label[contains(@id,'message')]")).getText());
		
		driver.findElement(By.xpath("//input[contains(@name,'btn')] [1]")).click(); //Click on Login button
		driver.findElement(By.xpath("//input[contains(@name,'btn')] [2]")).click(); // Click on reset button
		
		
		
		//OR Function
		driver.findElement(By.xpath("//input[@type='submit' or @name='btnLogin']")).click();
		
		//AND Function
		driver.findElement(By.xpath("//input[@type='submit' and @name='btnLogin']")).click();
		
		//Starts with Function
		System.out.println(driver.findElement(By.xpath("//label[starts-with(@id,'message')]")).getText());
		
		//Text()
		driver.findElement(By.xpath("//td[text()='UserID']"));
		
		//Xpath axes methods 
		//Following --Selects all elements in the document of the current node( )
		driver.findElement(By.xpath("//*[@type='text']//following::input[1]")).click();
		
		//Ancestor -selects all ancestors element (grandparent, parent, etc.) of the current node
		driver.findElement(By.xpath("//*[text()='Enterprise Testing']//ancestor::div[1]")).click();
		
		//Child --Selects all children elements of the current node
		driver.findElement(By.xpath("//*[@id='java_technologies']/child::li[1]")).click();
		
				
		// Preceding --Select all nodes that come before the current node 
		driver.findElement(By.xpath("//*[@type='submit']//preceding::input[1]")).click();
		
		//Following-sibling: --Select the following siblings of the context node. Siblings are at the same level of the current node
		driver.findElement(By.xpath("//*[@type='submit']//following-sibling::input")).click();
		
		//Parent --Selects the parent of the current node 
		driver.findElement(By.xpath("//*[@id='rt-feature']//parent::div[1]")).click();
		
		//Self --Selects the current node or 'self' means it indicates the node itself 
		driver.findElement(By.xpath("//*[@type='password']//self::input")).click();
		
		//Descendant: - Selects the descendants of the current node
		driver.findElement(By.xpath("//*[@id='rt-feature']//descendant::a[1]")).click();
		
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
