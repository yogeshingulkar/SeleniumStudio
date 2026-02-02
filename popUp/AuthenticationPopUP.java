package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUP {
public static void main(String[] args) throws AWTException, InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
	driver.manage().window().maximize();
	Robot bot = new Robot();
	
	for(int i = 0 ; i < 2;i++) {
		bot.keyPress(KeyEvent.VK_A);
		bot.keyPress(KeyEvent.VK_D);
		bot.keyPress(KeyEvent.VK_M);
		bot.keyPress(KeyEvent.VK_I);
		bot.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
	}

	bot.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
	bot.keyRelease(KeyEvent.VK_A);
	bot.keyRelease(KeyEvent.VK_D);
	bot.keyRelease(KeyEvent.VK_M);
	bot.keyRelease(KeyEvent.VK_I);
	bot.keyRelease(KeyEvent.VK_N);
	bot.keyRelease(KeyEvent.VK_TAB);
	bot.keyRelease(KeyEvent.VK_ENTER);
	}


}
