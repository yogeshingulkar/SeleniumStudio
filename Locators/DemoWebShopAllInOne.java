package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

/* ================= BASE CLASS ================= */
class BaseClass {

    static WebDriver driver;

    static void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
    }

    static void closeBrowser() {
        driver.quit();
    }
}

/* ================= UTILITY CLASS ================= */
class UtilityClass {

    static void click(By locator) {
        BaseClass.driver.findElement(locator).click();
    }

    static void sendKeys(By locator, String value) {
        BaseClass.driver.findElement(locator).sendKeys(value);
    }
}

/* ================= PAGE OBJECTS ================= */

class HomePage {
    static By REGISTER = By.xpath("/html/body/div[4]/div/div/div[1]/div[2]/div/ul/li[1]/a");
    static By LOGIN = By.xpath("/html/body/div[4]/div/div/div[1]/div[2]/div/ul/li[2]/a");
    static By SEARCH_BOX = By.xpath("/html/body/div[4]/div/div/div[1]/div[3]/form/input[1]");
    static By SEARCH_BUTTON = By.xpath("/html/body/div[4]/div/div/div[1]/div[3]/form/input[2]");
}

class RegisterPage {
    static By FIRST_NAME = By.id("FirstName");
    static By LAST_NAME = By.id("LastName");
    static By EMAIL = By.id("Email");
    static By PASSWORD = By.id("Password");
    static By CONFIRM_PASSWORD = By.id("ConfirmPassword");
    static By REGISTER_BUTTON = By.id("register-button");
}

class LoginPage {
    static By EMAIL = By.id("Email");
    static By PASSWORD = By.id("Password");
    static By LOGIN_BUTTON = By.xpath("/html/body/div[4]/div/div/div[2]/form/div[3]/input");
}

class CartPage {
    static By ADD_TO_CART = By.xpath("(//input[@value='Add to cart'])[1]");
}

class NewsletterPage {
    static By EMAIL = By.id("newsletter-email");
    static By SUBSCRIBE = By.id("newsletter-subscribe-button");
}

class PollPage {
    static By OPTION = By.id("pollanswers-1");
    static By VOTE = By.id("vote-poll-1");
}

/* ================= SINGLE CONTROLLER CLASS ================= */

public class DemoWebShopAllInOne {

    public static void main(String[] args) {

        /* OPEN BROWSER ONLY ONCE */
        BaseClass.openBrowser();

        /* ===== REGISTER FLOW ===== */
        UtilityClass.click(HomePage.REGISTER);
        UtilityClass.sendKeys(RegisterPage.FIRST_NAME, "Yogesh");
        UtilityClass.sendKeys(RegisterPage.LAST_NAME, "Ingulkar");
        UtilityClass.sendKeys(RegisterPage.EMAIL, "test123@mail.com");
        UtilityClass.sendKeys(RegisterPage.PASSWORD, "Test@123");
        UtilityClass.sendKeys(RegisterPage.CONFIRM_PASSWORD, "Test@123");
        UtilityClass.click(RegisterPage.REGISTER_BUTTON);

        /* ===== LOGIN FLOW ===== */
        UtilityClass.click(HomePage.LOGIN);
        UtilityClass.sendKeys(LoginPage.EMAIL, "test123@mail.com");
        UtilityClass.sendKeys(LoginPage.PASSWORD, "Test@123");
        UtilityClass.click(LoginPage.LOGIN_BUTTON);

        /* ===== SEARCH FLOW ===== */
        UtilityClass.sendKeys(HomePage.SEARCH_BOX, "Laptop");
        UtilityClass.click(HomePage.SEARCH_BUTTON);

        /* ===== ADD TO CART ===== */
        UtilityClass.click(CartPage.ADD_TO_CART);

        /* ===== NEWSLETTER ===== */
        UtilityClass.sendKeys(NewsletterPage.EMAIL, "mail@test.com");
        UtilityClass.click(NewsletterPage.SUBSCRIBE);

        /* ===== POLL ===== */
        UtilityClass.click(PollPage.OPTION);
        UtilityClass.click(PollPage.VOTE);

        /* CLOSE BROWSER ONLY ONCE */
        BaseClass.closeBrowser();
    }
}
