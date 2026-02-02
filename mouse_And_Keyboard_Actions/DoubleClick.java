package mouse_And_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

public static void main(String[] args) throws InterruptedException {
	
	//create a object of chromeDriver with the help of constructor
	ChromeDriver driver = new ChromeDriver ();
	//open the browser
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	//maximize the window
	driver.manage().window().maximize();
	
//	Thread.sleep(2000);
	Actions actions = new Actions(driver);
	WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	actions.moveToElement(doubleClick).doubleClick().perform();
}
}
