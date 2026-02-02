package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWithRandomName {

    public static void main(String[] args) throws InterruptedException, IOException {

        // Dynamic Name
        String date = LocalDateTime.now().toString().replace(":", "-");
//        String date = LocalDateTime.now().toString().replace(":", "");
        String dynamicName = "BMW" + date;
        System.out.println(dynamicName);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bmw.in/en/index.html");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        // Downcasting
        TakesScreenshot ts = (TakesScreenshot) driver;

        // Take screenshot
        File from = ts.getScreenshotAs(OutputType.FILE);

        // Store screenshot
        File to = new File("D:\\M65\\Selenium\\SeleniumFile\\HomepageDefect1_"+ dynamicName + ".png");

        FileHandler.copy(from, to);

        driver.quit();
    }
}
