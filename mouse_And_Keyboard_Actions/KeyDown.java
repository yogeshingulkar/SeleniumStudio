package mouse_And_Keyboard_Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//press keyDown - register page on dws 
public class KeyDown {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.ENTER).perform();
		
	}
}
