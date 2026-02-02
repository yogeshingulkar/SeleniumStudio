package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopup {
public static void main(String[] args) throws InterruptedException {
	
	//create a object of chromeDriver with the help of constructor
	ChromeDriver driver = new ChromeDriver ();
	//open the browser
//	driver.get("https://demo.automationtesting.in/Datepicker.html");

	driver.get("https://www.easemytrip.com/");
	//maximize the window
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//datepicker Enabled
	//calendar with textfield
//	driver.findElement(By.id("datepicker2")).sendKeys("01/02/2003");
	
	//datepicker disabled 
	//calendar with disabled textfield
	driver.findElement(By.className("col-xs-1")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	Thread.sleep(1000);
	
	//calendar without textfield
	driver.findElement(By.id(".input_cld")).click();
	driver.quit();
	}
}
