package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class kbmaction {

	public static void main(String[] args) 
	{
	WebElement gmail;
	WebDriver driver=new FirefoxDriver();
	driver.get("http://google.com");
	driver.manage().window().maximize();
	Actions act=new Actions(driver);
	gmail=driver.findElement(By.linkText("Gmail"));
	
	act.moveToElement(gmail);
	act.contextClick(gmail);
	act.build().perform();
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.ARROW_DOWN);
	act.sendKeys(Keys.ENTER);
	act.build().perform();
	
	
	}

}
