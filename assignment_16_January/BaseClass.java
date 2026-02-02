package assignment_16_January;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    public void openBrowser() {
        driver = new ChromeDriver();
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public void enterUrl() {
        driver.get("https://demowebshop.tricentis.com/");
    }

    public void login() {
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("yashgawali@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
    }

    public void logout() {
        driver.findElement(By.linkText("Log out")).click();
    }

    public void closeBrowser() {
        driver.quit();
    }
}
