package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class KBMactions {

	
	public static void main(String[] args) 
	{
	WebElement compinfo,email;
	WebDriver driver=new FirefoxDriver();
	driver.get("http://net4.in");
	Sleeper.sleepTightInSeconds(5);
	driver.manage().window().maximize();
	compinfo=driver.findElement(By.linkText("Company Info"));
	Actions act=new Actions(driver);
	act.moveToElement(compinfo).build().perform();
	driver.findElement(By.linkText("Contact Us")).click();
	Sleeper.sleepTightInSeconds(5);
	email=driver.findElement(By.xpath(".//*[@id='section_grey']/div/div/div/div[3]/div[1]/div[1]/div[2]/div[2]/span[5]/a"));
	act.contextClick(email);
	act.sendKeys(Keys.ARROW_DOWN);
	Sleeper.sleepTightInSeconds(5);
	act.sendKeys(Keys.ENTER);
	act.build().perform();

	}

}
