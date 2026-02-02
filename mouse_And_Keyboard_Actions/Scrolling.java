package mouse_And_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
//		WebElement footerScroll = driver.findElement(By.xpath("//[text()='reserved']"));
//		act.scrollToElement(scrolling).perform();
//		act.scrollToElement(footerScroll).perform();
		
		WebElement scrolling = driver.findElement(By.xpath("//img[@id='node']"));
		WebElement source = driver.findElement(By.id("angular"));
		WebElement target = driver.findElement(By.id("droparea"));
		act.scrollToElement(scrolling).perform();
		Thread.sleep(2000);
//		by using clickAndHold
		act.clickAndHold(source).release(target).perform();
//		driver.quit();
	}
}
