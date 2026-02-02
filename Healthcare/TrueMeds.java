package Healthcare;

import org.openqa.selenium.chrome.ChromeDriver;

public class TrueMeds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.truemeds.in/");
		driver.manage().window().maximize();
		driver.close();
	}

}
