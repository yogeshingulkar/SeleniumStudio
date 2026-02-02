package Healthcare;

import org.openqa.selenium.chrome.ChromeDriver;

public class MedPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.medplusmart.com/");
		driver.close();
	}

}
