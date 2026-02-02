package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ParticularElementScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		// Dynamic Name
        String dateTime = LocalDateTime.now().toString().replace(":", "-");
        String dynamicName = "dwsSearchBox" + dateTime;
        System.out.println(dynamicName);

        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement searchBox = driver.findElement(By.xpath("//div[@class='search-box']"));
        // Take screenshot
        File from = searchBox.getScreenshotAs(OutputType.FILE);

        // Store screenshot
        File to = new File("D:\\M65\\Selenium\\SeleniumFile\\"+ dynamicName + ".png");

        FileHandler.copy(from, to);

        driver.quit();
	}
}
