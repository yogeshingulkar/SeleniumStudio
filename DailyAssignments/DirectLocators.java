package DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//enter into dws page
		driver.get("https://demowebshop.tricentis.com/");
		//select the tagName
		WebElement searchField = driver.findElement(By.tagName("input"));
		//send the input to the webElement SearchField
		searchField.sendKeys("iphone");
		//Thread will sleep for 3-sec
		Thread.sleep(3000);
		//close the browser
		driver.close();
	}
}
