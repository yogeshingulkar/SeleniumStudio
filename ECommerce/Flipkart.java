package ECommerce;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgesDriver;

public class Flipkart {
	public static void main(String[] args) {
		
		//create a object of chromeDriver with the help of constructor
		ChromeDriver driver = new ChromeDriver ();
		//open the browser
		driver.get("https://www.flipkart.com/");
		//maximize the window
		driver.manage().window().maximize();
		//close the browser
		driver.close();
	}
}
