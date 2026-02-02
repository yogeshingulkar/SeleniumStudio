package assignment_16_January;

import org.openqa.selenium.By;

public class BuildYourOwnComputerTest extends BaseClass {

    public static void main(String[] args) throws InterruptedException {

        BuildYourOwnComputerTest test = new BuildYourOwnComputerTest();

        test.openBrowser();
        test.maximizeBrowser();
        test.enterUrl();
        test.login();

        // Open product
        driver.findElement(By.linkText("Build your own cheap computer")).click();

        // High configuration
        driver.findElement(By.xpath("//input[@id='product_attribute_72_5_18_65']")).click(); // Fast CPU
        driver.findElement(By.xpath("//input[@id='product_attribute_72_6_19_91']")).click(); // 8GB RAM
        driver.findElement(By.xpath("//input[@id='product_attribute_72_3_20_58']")).click(); // HDD

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_93']")).click(); // Software 1

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='product_attribute_72_8_30_94']")).click(); // Software 2

        // Change quantity
        driver.findElement(By.xpath("//input[@id='addtocart_72_EnteredQuantity']")).clear();
        driver.findElement(By.xpath("//input[@id='addtocart_72_EnteredQuantity']")).sendKeys("2");

        // Add to cart
        driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();

        Thread.sleep(2000);

        // Go to cart
        driver.findElement(By.xpath("(//a[@class=\"ico-cart\"])[1]")).click();

        // Remove product
        driver.findElement(By.name("removefromcart")).click();
        driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();

        test.logout();
        test.closeBrowser();
    }
}
