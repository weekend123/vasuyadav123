package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DraAndDrop {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver ff=new FirefoxDriver();
		ff.manage().window().maximize();
		ff.get("https://jqueryui.com/droppable/");
		ff.switchTo().frame(0);		
		WebElement src=ff.findElement(By.id("draggable"));
		WebElement tar=ff.findElement(By.id("droppable"));		
		Actions a=new Actions(ff);
		a.dragAndDrop(src, tar).perform();
		Thread.sleep(2000);
		ff.switchTo().defaultContent();
			


	}

}
