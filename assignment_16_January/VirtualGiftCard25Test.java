package assignment_16_January;

import org.openqa.selenium.By;

public class VirtualGiftCard25Test extends BaseClass {

    public static void main(String[] args) throws InterruptedException {

        VirtualGiftCard25Test test = new VirtualGiftCard25Test();

        test.openBrowser();
        test.maximizeBrowser();
        test.enterUrl();
        test.login();

        // Open $25 Virtual Gift Card
        driver.findElement(By.linkText("$25 Virtual Gift Card")).click();

        // Fill gift card details
        driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Yash Patil");
        Thread.sleep(1000);
        driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("yashpatil@gmail.com");
        Thread.sleep(1000);
//        driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("Yogesh");
//        Thread.sleep(1000);
//        driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("pandu98765432@gmail.com");
//        Thread.sleep(1000);
        driver.findElement(By.id("giftcard_2_Message")).sendKeys("Best Wishes");
        
        Thread.sleep(2000);
        // Change quantity
        driver.findElement(By.id("addtocart_2_EnteredQuantity")).clear();
        driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
        Thread.sleep(2000);
        // Add to cart
        driver.findElement(By.id("add-to-cart-button-2")).click();
        Thread.sleep(2000);
        // Go to cart
        driver.findElement(By.linkText("Shopping cart")).click();
        Thread.sleep(2000);
        // Remove product
        driver.findElement(By.name("removefromcart")).click();
        driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
        Thread.sleep(2000);
        test.logout();
        test.closeBrowser();
    }
}
