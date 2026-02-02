package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Notification {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		//create a object of chromeDriver with the help of constructor
		ChromeDriver driver = new ChromeDriver ();
		//open the browser
		driver.get("https://easymytrip.com/");
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		//pop-up notifications handled using Robot Class of awt package
		Robot bot = new Robot();
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		bot.keyRelease(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
