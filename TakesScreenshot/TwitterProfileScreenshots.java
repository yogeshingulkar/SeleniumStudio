package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TwitterProfileScreenshots {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		String timeDate = LocalDateTime.now().toString().replaceAll(":","");
		String dynamicName = "twitter"+timeDate;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://x.com/actorvijay?lang=en");
		Thread.sleep(3000);
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		Thread.sleep(1500);
		File fromWeb = screenshot.getScreenshotAs(OutputType.FILE);
		File toWeb = new File("D:\\\\M65\\\\Selenium\\\\SeleniumFile\\\\HomePage"+ dynamicName + ".png");
		FileHandler.copy(fromWeb,toWeb);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(("(//div[@class='css-175oi2r r-172uzmj r-1pi2tsx r-13qz1uu r-o7ynqc r-6416eg r-1ny4l3l'])[1]"))).click();
		Thread.sleep(1500);
		TakesScreenshot screenshot2 = (TakesScreenshot)driver;
		File fromProfile = screenshot2.getScreenshotAs(OutputType.FILE);
		File toProfile = new File("D:\\\\M65\\\\Selenium\\\\SeleniumFile\\\\Profile"+ dynamicName + ".png");
		FileHandler.copy(fromProfile,toProfile);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M10.59 12L')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//img[@class='css-9pa8cd'])[1]")).click();
		Thread.sleep(1500);
		TakesScreenshot screenshot3 = (TakesScreenshot)driver;	
		File fromCover = screenshot3.getScreenshotAs(OutputType.FILE);
		File toCover = new File("D:\\\\M65\\\\Selenium\\\\SeleniumFile\\\\Cover"+ dynamicName + ".png");
		FileHandler.copy(fromCover,toCover);
		Thread.sleep(3000);

		driver.quit();
	}
}
