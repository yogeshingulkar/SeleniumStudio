package mouse_And_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTabBook {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	
	Actions act = new Actions(driver);
	WebElement books = driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
	act.keyDown(Keys.CONTROL).click(books).perform();
	Thread.sleep(5000);
	
	act.keyDown(Keys.SHIFT).click(books).perform();
	
	Thread.sleep(5000);
	driver.quit();
	}
}
