package mouse_And_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Facebook {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        
        //create new account on facebook
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Yogesh");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Ingulkar");
        Thread.sleep(1000);
        //date 
        driver.findElement(By.xpath("(//option[@value='2'])[1]")).click();
        driver.findElement(By.xpath("(//option[@value='1'])[2]")).click();
        driver.findElement(By.xpath("(//option[@value='2003'])")).click();
        Thread.sleep(1000);
        //male
        driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
        driver.findElement(By.name("reg_email__")).sendKeys("fakeahebhai@gmail.com");
//     	driver.findElement(By.name("reg_email__")).sendKeys("9579353591");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@id='password_step_input'])")).sendKeys("Password@123");
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(5000);
        
        //login into facebook
//        driver.findElement(By.)
        driver.quit();
    }
}
