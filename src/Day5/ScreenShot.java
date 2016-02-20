package Day5;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.Flipkart.com");
		//driver.findElement(By.name("txtUsername")).sendKeys("kumar");
		//driver.findElement(By.name("txtPassword")).sendKeys("vasanth");
		//driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);		  
		//capture screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//saving captured screen shot
		FileUtils.copyFile(scrFile, new File("D:\\vasu\\LoginFail.png"));		
		driver.quit();
		
		

	}

}
