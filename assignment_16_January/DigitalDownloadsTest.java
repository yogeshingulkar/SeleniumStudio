package assignment_16_January;

import org.openqa.selenium.By;

public class DigitalDownloadsTest extends BaseClass {

    public static void main(String[] args) throws InterruptedException {

        DigitalDownloadsTest test = new DigitalDownloadsTest();

        test.openBrowser();
        test.maximizeBrowser();
        test.enterUrl();
        test.login();

        // Click Digital Downloads
        driver.findElement(By.linkText("Digital downloads")).click();

        // Add all products one by one
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();

        // Go to cart
        driver.findElement(By.linkText("Shopping cart")).click();

        // Remove all products
        driver.findElement(By.name("removefromcart")).click();
        driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();

        test.logout();
        test.closeBrowser();
    }
}
