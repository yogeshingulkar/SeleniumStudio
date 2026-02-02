package ECommerce;

import org.openqa.selenium.chrome.ChromeDriver;

public class Puma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.puma.in/");
		driver.manage().window().maximize();
		driver.close();
	}

}
