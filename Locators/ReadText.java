package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadText {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//to read the text we use getText() of WebElement
//		WebElement register = driver.findElement(By.linkText("Register"));
//		System.out.println(register.getText());
		
		WebElement register1 = driver.findElement(By.className("Register"));
		System.out.println(register1.getText());
		
		
		
//		driver.close();
	
	}
}
