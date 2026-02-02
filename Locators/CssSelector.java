package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//traditional way 
		driver.findElement(By.id("small-searchterms")).sendKeys("watch");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
		//new way - use this way is more convenient
		//for id we use hash(#)
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Pillow");
		//for class we use dot(.)
		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		
	}
}
