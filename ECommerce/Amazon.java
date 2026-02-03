package ECommerce;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.close();
	}
}
