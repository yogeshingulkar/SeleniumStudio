package mouse_And_Keyboard_Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//using page down keys -(page up and page down)
public class ScrollWithKeyboard {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		//one time page down
		act.keyDown(Keys.PAGE_DOWN).perform();
		
		//second time page down - and this will be 2x 
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);

		driver.quit();
	}
}
