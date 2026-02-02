package assignment_16_January;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {
    public static void main(String[] args) {

//        System.setProperty(
//            "webdriver.chrome.driver",
//            "C:\\Users\\Yogesh\\eclipse\\chromedriver-win64\\chromedriver.exe"
//        );

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
