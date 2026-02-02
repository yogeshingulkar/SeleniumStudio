package assignment_22_January;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DefaultMouseAction {
	public static void main(String[] args) throws InterruptedException{
		
		ChromeDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
		driver.manage().window().maximize();
//		Thread.sleep(1000);
		
		WebElement dragMe = driver.findElement(By.xpath("//div[contains(text(),'Drag Me')]"));

		
		action.clickAndHold(dragMe).moveByOffset(-355, -177).release().perform();
		
//		Thread.sleep(3000);
		driver.quit();
		
	}
}
