package mouse_And_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//right click is nothing but context click 

public class RightClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//create a object of chromeDriver with the help of constructor
		ChromeDriver driver = new ChromeDriver ();
		//open the browser
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//maximize the window
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement rightClickMe = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		actions.moveToElement(rightClickMe).contextClick().click(copy).perform();
	}
}
