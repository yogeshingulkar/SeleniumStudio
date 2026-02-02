package assignment_22_January;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MobileAndLaptopAccessories {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        Actions action = new Actions(driver);

        // Mobile Accessories
        WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
        WebElement mobileTarget = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));

        action.dragAndDrop(mobileCharger, mobileTarget).perform();

        WebElement mobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
        action.dragAndDrop(mobileCover, mobileTarget).perform();
        Thread.sleep(2000);

        // Laptop Accessories
        WebElement laptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
        WebElement laptopTarget = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));

        action.dragAndDrop(laptopCharger, laptopTarget).perform();

        WebElement laptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
        action.dragAndDrop(laptopCover, laptopTarget).perform();
        Thread.sleep(2000);
        
        driver.quit();
    }
}
