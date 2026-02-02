package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
    public static void main(String[] args) throws Exception {
    	
    	// Manikandan Sir
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.dream11.com/fantasy-football");
      	driver.manage().window().maximize();
      
      	//int 
      	driver.switchTo().frame(0);
    	
      	//String - (id/name)
      	driver.switchTo().frame("send-sms-iframe");
    	Thread.sleep(2000);
    	
    	//Argument
    	WebElement iframe = driver.findElement(By.className("send-sma-iframe"));
    	driver.switchTo().frame(iframe);
    	Thread.sleep(1000);
        driver.findElement(By.id("regEmail")).sendKeys("9876543210");
        Thread.sleep(1000);
        
        driver.quit();
    }
}
