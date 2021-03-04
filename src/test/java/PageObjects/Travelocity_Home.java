package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Travelocity_Home {
	
	
		public WebDriver ldriver;

		public Travelocity_Home(WebDriver rdriver) {
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);

		}

		// HomePage Options 
		@FindBy(xpath="//input[@id='email_create']")
		@CacheLookup
		WebElement writeemial;

		public WebElement writeEmail() {
			return writeemial;

		}

}
