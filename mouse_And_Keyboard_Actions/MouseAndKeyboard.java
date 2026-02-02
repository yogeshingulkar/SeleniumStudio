package mouse_And_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboard {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        
        Thread.sleep(2000);
        // Locate the element to hover
        WebElement hover = driver.findElement(By.xpath("//a[@data-group='genz']"));
        
        WebElement hover1 = driver.findElement(By.xpath("//a[@class='desktop-categoryLink']"));
        
        // Create Actions class object
        Actions actions = new Actions(driver);
//        class="desktop-categoryLink"
        // Perform mouse hover
        Thread.sleep(2000);
        actions.moveToElement(hover).perform();
        actions.click();
    }
}
