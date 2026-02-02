package DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements2 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement register = driver.findElement(By.className("ico-register"));
		WebElement login = driver.findElement(By.className("ico-login"));
		WebElement shopping = driver.findElement(By.className("ico-cart"));
		WebElement wishlist = driver.findElement(By.className("ico-wishlist"));
		
		register.click();
		driver.navigate().back();
		Thread.sleep(9000);
		
		login.click();
		driver.navigate().back();
		Thread.sleep(9000);
		
		shopping.click();
		driver.navigate().back();
		Thread.sleep(9000);
		
		wishlist.click();
		Thread.sleep(9000);
		driver.close();
//		driver.quit();
	}
}
