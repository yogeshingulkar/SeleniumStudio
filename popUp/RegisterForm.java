package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterForm {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Yogesh");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ingulkar");

        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pune, Maharashtra, India");

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yogesh123@gmail.com");

        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");

        driver.findElement(By.xpath("//input[@value='Male']")).click();

        driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
        
//        driver.navigate().refresh();
        driver.findElement(By.xpath("//div[@id='msdd']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li/a[text()='English']")).click();
        driver.findElement(By.xpath("//li/a[text()='Hindi']")).click();
        driver.findElement(By.xpath("//body")).click();

        driver.findElement(By.xpath("//select[@id='Skills']/option[@value='Java']")).click();

        driver.findElement(By.xpath("//span[contains(@class,'select2-selection')]")).click();
        driver.findElement(By.xpath("//li[text()='India']")).click();

        driver.findElement(By.xpath("//select[@id='yearbox']")).click();
        driver.findElement(By.xpath("//select[@id='yearbox']/option[text()='2003']")).click();

        driver.findElement(By.xpath("//select[@ng-model='monthbox']")).click();
        driver.findElement(By.xpath("//select[@ng-model='monthbox']/option[text()='January']")).click();

        driver.findElement(By.xpath("//select[@id='daybox']")).click();
        driver.findElement(By.xpath("//select[@id='daybox']/option[text()='2']")).click();


        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Test@123");
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Test@123");

        WebElement upload = driver.findElement(By.xpath("//input[@id='imagesrc']"));
        upload.sendKeys("E:\\Photo_Signature\\YOGESH.jpg");

        driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
