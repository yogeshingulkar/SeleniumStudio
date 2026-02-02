package Healthcare;

import org.openqa.selenium.chrome.ChromeDriver;

public class ApolloPharmacy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apollopharmacy.in/");
		driver.close();
	}

}
