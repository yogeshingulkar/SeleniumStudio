package mouse_And_Keyboard_Actions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Coordinates {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	
	Actions act = new Actions(driver);
	act.scrollByAmount(580, 516).perform();
	
}
}
