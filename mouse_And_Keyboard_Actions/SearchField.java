package mouse_And_Keyboard_Actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchField {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Actions act = new Actions(driver);

		for (int i = 0; i < 6; i++) {
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(300);
		}

		act.sendKeys("computer").perform();
		Thread.sleep(300);

		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(300);

		act.sendKeys(Keys.ENTER).perform();
		driver.quit();
	}
}
