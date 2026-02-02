package ECommerce;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nike {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nike.com/");
		driver.manage().window().maximize();
		driver.close();
		
	}
}
