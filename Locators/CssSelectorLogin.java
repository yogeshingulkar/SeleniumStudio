package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLogin 
{
	public static void main(String[] args) 
	{		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebElement poll = driver.findElement(By.cssSelector(".block.block-poll>div>strong"));
		System.out.println(poll.getText());
	}
}
