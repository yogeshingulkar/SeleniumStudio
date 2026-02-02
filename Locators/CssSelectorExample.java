package Locators;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Random r = new Random();
		for(int i = 0 ; i<=1000;i++) {
			driver.findElement(By.cssSelector(".ico-register")).click();
			driver.findElement(By.cssSelector("#gender-male")).click();
			driver.findElement(By.cssSelector("#FirstName")).sendKeys("Yash");
			driver.findElement(By.cssSelector("#LastName")).sendKeys("gawali");
			
			//nextInt() from random class
			driver.findElement(By.cssSelector("#Email")).sendKeys("yashgawali"+r.nextInt(10000)+"@gmail.com");

//			driver.findElement(By.cssSelector("#Email")).sendKeys("yashgawali"+System.currentTimeMillis()+"@gmail.com");
			driver.findElement(By.cssSelector("#Password")).sendKeys("Admin@123");
			driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("Admin@123");
			driver.findElement(By.cssSelector("#register-button")).click();
			driver.findElement(By.cssSelector(".button-1.register-continue-button")).click();
			
			WebElement fetchEmail = driver.findElement(By.cssSelector(".account"));
			System.out.println(fetchEmail.getText());
			
			driver.findElement(By.cssSelector(".ico-logout")).click();
		}
		
		
		driver.quit();
	}

}
