package TestCases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CaptureImage {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		/*
		 * Below Dependencies need to add in POM
		 * <dependency>
	     *  <groupId>ru.yandex.qatools.ashot</groupId>
	     *  <artifactId>ashot</artifactId>
	     *  <version>1.5.3</version>
	     * </dependency>
	     *   <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
	     * <dependency>
	     *   <groupId>com.google.code.gson</groupId>
	     *   <artifactId>gson</artifactId>
	     *   <version>2.8.8</version>
	     * </dependency>
	     *   <!-- https://mvnrepository.com/artifact/org.hamcrest/hamcrest-all -->
	     * <dependency>
	     *    <groupId>org.hamcrest</groupId>
	     *    <artifactId>hamcrest-all</artifactId>
	     *    <version>1.3</version>
	     *    <scope>test</scope>
	     * </dependency>
		 */
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/company/about-us/about-orangehrm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement expectedImageElement= driver.findElement(By.xpath("//section[@class='starter-main']"));
		Screenshot expectedImageElementScreenshot=new AShot().takeScreenshot(driver, expectedImageElement);
		ImageIO.write(expectedImageElementScreenshot.getImage(), "png", new File("./Drivers\\ExoectedImage.png"));
		
		File f = new File("./Drivers\\ExoectedImage.png");
		
		if(f.exists()) {
			System.out.println("-------------------Expected Image Captured-------------------------");
		}
		else {
			System.out.println("-------------------Expected Image Not Captured-------------------------");
		}
		
		System.out.println("---------------------------Captured the Expected Image ----------------------------------- ");
		
		
		BufferedImage expectedImage = ImageIO.read(new File("./Drivers\\ExoectedImage.png"));
		
		WebElement ActualImageElement= driver.findElement(By.xpath("//section[@class='starter-main']"));
		Screenshot ActualImageElementScreenshot=new AShot().takeScreenshot(driver, ActualImageElement);
		
		BufferedImage actualImage = ActualImageElementScreenshot.getImage();
		
		System.out.println("---------------------------Captured the Actual Image ----------------------------------- ");
		
		ImageDiffer imgDiff = new ImageDiffer();
		
		ImageDiff diff=imgDiff.makeDiff(expectedImage, actualImage);
		
		if(diff.hasDiff()==true) 
			System.out.println("---------------------------Images are Not same ----------------------------------- ");
		else
			System.out.println("---------------------------Images are same ----------------------------------- ");
		
		driver.quit();

	}

}
