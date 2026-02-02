package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextLocators {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		// linked text
//		driver.findElement(By.linkText("Shopping cart")).click();
		// partial text
		driver.findElement(By.partialLinkText("Shopping")).click();
	}
}
