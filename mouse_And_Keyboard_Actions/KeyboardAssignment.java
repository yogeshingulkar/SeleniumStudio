package mouse_And_Keyboard_Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAssignment {
	 public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			
			Actions act = new Actions(driver);
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(1000);
			
			act.keyDown(Keys.TAB).perform();
			Thread.sleep(1000);
			
			act.keyDown(Keys.ENTER).perform();
			
			for(int i=0;i<25;i++){
				act.keyDown(Keys.TAB).perform();
			}
			
			act.keyDown(Keys.ARROW_DOWN).perform();
			act.keyDown(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);
			
			
			act.keyDown(Keys.TAB).perform();
			act.sendKeys("Yogesh").keyDown(Keys.ENTER).perform();
			Thread.sleep(1000);
			
			act.sendKeys("Ingulkar").keyDown(Keys.ENTER).perform();
			Thread.sleep(1000);
			
			act.sendKeys("fakeahebhai@gmail.com").keyDown(Keys.ENTER).perform();
			Thread.sleep(1000);
			
			act.sendKeys("Yogesh123").keyDown(Keys.ENTER).perform();
			Thread.sleep(1000);
			
			act.sendKeys("Yogesh123").keyDown(Keys.ENTER).perform();
			Thread.sleep(1000);
			
			act.keyDown(Keys.ENTER).perform();
			Thread.sleep(2000);
			
			driver.quit();
		}
}
