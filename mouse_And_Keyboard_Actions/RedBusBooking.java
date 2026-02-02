package mouse_And_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RedBusBooking {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.redbus.in/");
	Thread.sleep(2000);
	
	Actions act = new Actions(driver);
	
	WebElement from = driver.findElement(By.id("srcinput"));
	Thread.sleep(2000);
	act.sendKeys(from, "Pune").perform();
	Thread.sleep(2000);
	act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
	Thread.sleep(2000);

	act.sendKeys("Goa").perform();
	Thread.sleep(2000);
	
	act.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();
	Thread.sleep(2000);
	
	WebElement clickDate = driver.findElement(By.className("[class='doj___48d282']"));
	clickDate.click();
	WebElement chooseDate = driver.findElement(By.xpath("(//span[contains(text(),'26')])[2]"));
	act.keyDown(Keys.ENTER).perform();
}
}
