package TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot {
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.zomato.com");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	//downcasting
	TakesScreenshot ts = (TakesScreenshot)driver;

	//screenshot
	File from = ts.getScreenshotAs(OutputType.FILE);
	
	//store in a file 
	File to = new File("D:\\M65\\Selenium\\SeleniumFile\\HomepageDefect1.png");
	
	//pass that locations from webpage to file
	FileHandler.copy(from, to);
	
	Thread.sleep(2000);
	driver.quit();
	}
}
