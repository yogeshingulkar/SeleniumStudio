package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
//		Alert alt = driver.switchTo().alert().accept();
//		System.out.println(alt.getText());
		
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(1000);
		driver.close();
	}

}
