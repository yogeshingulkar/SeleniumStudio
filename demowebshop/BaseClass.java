package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void enterUrl() {
        driver.get("https://demowebshop.tricentis.com/");
    }

    public void closeBrowser() {
        driver.quit();
    }
}
