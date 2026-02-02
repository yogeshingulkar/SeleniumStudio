package popUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EasyMyTripCalendarPopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//script 
		
		Robot bot = new Robot();
		
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		bot.keyRelease(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_ENTER);
		//find that daparture section and click 
		driver.findElement(By.id("ddate")).click();
//		driver.findElement(By.xpath("(//P['srlabel'])[32]")).click();
		Thread.sleep(1000);
		//click on the date 
		driver.findElement(By.id("fst_6_07/02/2026")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='divRtnCal']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("snd_6_14/02/2026")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@id='iDownArr']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='field1']//button[@id='add']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='spanpEconomy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='traveLer']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='srchBtnSe']")).click();
		Thread.sleep(1000);
		
		driver.quit();		
		}
}
