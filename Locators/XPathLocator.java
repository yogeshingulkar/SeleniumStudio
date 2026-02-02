package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator {

	public static void main(String[] args) {

	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li/a")).click();
	driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Yogesh");
	driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Ingulkar");
	driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("yogeshingulkar02@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Admin@123");
	driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Admin@123");
	driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	driver.quit();
	
	}

}
