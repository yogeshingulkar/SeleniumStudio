package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysRobot {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Robot bot = new Robot();
		for(int i = 0 ; i <= 5;i++) {
			bot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
		}
		for(int i = 0 ; i < 1;i++) {
			bot.keyPress(KeyEvent.VK_Y);
			Thread.sleep(1000);
			bot.keyPress(KeyEvent.VK_O);
			Thread.sleep(1000);
			bot.keyPress(KeyEvent.VK_G);
			Thread.sleep(1000);
			bot.keyPress(KeyEvent.VK_I);
			Thread.sleep(1000);
		}
		
		bot.keyRelease(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_Y);
		bot.keyRelease(KeyEvent.VK_O);
		bot.keyRelease(KeyEvent.VK_G);
		bot.keyRelease(KeyEvent.VK_I);
	}
}
