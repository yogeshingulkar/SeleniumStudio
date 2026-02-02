package DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsId {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
//		driver.findElement(By.className("search-box-text")).sendKeys("laptop");
//		driver.findElement(By.name("q")).sendKeys("watch");
		driver.findElement(By.name("pollanswers-4")).click();
		
	}
}
