package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.id("register_Layer")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@placeholder='What is your name?']")).sendKeys("Yogesh Suresh Ingulkar");

        driver.findElement(By.xpath("//input[@placeholder='Tell us your Email ID']")).sendKeys("yogesh.test@gmail.com");

        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Test@12345");

        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9876543210");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@data-val='exp']")).click();
        Thread.sleep(1000);

        WebElement uploadResume = driver.findElement(By.xpath("//input[@type='file']"));
        uploadResume.sendKeys("D:\\Yogesh Resume.docx");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[contains(text(),'Send me important updates')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[contains(text(),'Register now')]")).click();
        Thread.sleep(1000); 

        driver.quit();
    }
}
