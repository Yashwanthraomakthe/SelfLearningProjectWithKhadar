package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Travelocity_CheckOptions_001 extends BaseClass_Travelocity {

	@Test()
	public void testAvialableSiteFeatures() {
		List<WebElement> list = driver.findElements(By.xpath("// ul[@id='uitk-tabs-button-container']//li//a//span"));
		int noOfFeatures =list.size();
		ArrayList<String> actualFeaturesNames = new ArrayList<String>();
		for(int i=0;i<noOfFeatures;i++) {
			String FeaureName =list.get(i).getText();
			actualFeaturesNames.add(FeaureName);
			System.out.println("Feature Name " + FeaureName );
		}
		
		ArrayList<String> expectedFeaturesNames = new ArrayList<String>();
		expectedFeaturesNames.add("Hotels");
		expectedFeaturesNames.add("Flights");
		expectedFeaturesNames.add("Cars");
		expectedFeaturesNames.add("Packages");
		expectedFeaturesNames.add("Things to do");
		expectedFeaturesNames.add("Cruises");
		
		Assert.assertEquals(actualFeaturesNames, expectedFeaturesNames);
		
	}

	//// ul[@id='uitk-tabs-button-container']//li//a//span

}
