package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.flipkart.com/?affid=kamnatsgm");
		d.manage().window().maximize();
		WebElement ele=d.findElement(By.xpath(".//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li[1]/a/span"));
		Actions a=new Actions(d);
		a.moveToElement(ele).build().perform();
		WebElement Honour=d.findElement(By.xpath(".//*[@id='menu-electronics-tab-0-content']/ul[1]/li[11]/a"));
        Thread.sleep(2000);
		a.moveToElement(Honour).click().build().perform();
	}

}
