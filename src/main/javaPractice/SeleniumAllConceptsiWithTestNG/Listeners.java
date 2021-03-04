package SeleniumAllConceptsiWithTestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	//WebDriver driver;
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
 
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Executicion successfull" + result.getName());
		
	}
 
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Am failed testcase "  + result.getName());
		/*File src = (File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,new File("F:\\Screenshots\\Screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
 
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
 
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
 
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
 
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
