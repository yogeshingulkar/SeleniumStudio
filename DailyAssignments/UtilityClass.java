package DailyAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityClass {
	
	public static ChromeDriver driver = null ;
	
	public static void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	
	public static void register() {
		
			driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li/a")).click();
			driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Yogesh");
			driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Ingulkar");
			driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("ingulkar@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Admin@123");
			driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Admin@123");
			driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();

		}
	public static void login() {
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("ingulkar@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Admin@123");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
	}
	
//	public static void AddToCart() {
//		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
//		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
//	}
	
//	public static void getTextData() {
		//xpath by text Function
//		WebElement manufacture = driver.findElement(By.xpath("//strong[text()='Digital downloads'"));
//		System.out.println(manufacture.getText());
//		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads']")).click();
//		driver.findElement(By.xpath("//input[contains(@class,'search-box-text')]")).sendKeys("Mobile");
//	}
	
	public static void postCondition() {
		driver.quit();
	}
}
