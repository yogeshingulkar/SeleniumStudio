package DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOfClick {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		WebElement login = driver.findElement(By.className("ico-login"));
		login.click();
		driver.navigate().back();
		driver.quit();
		
	}
}
