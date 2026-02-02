package popUp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarAfterDays {
public static void main(String[] args) throws InterruptedException {
	
	//date format - used from GenerateDate.java File from same folder
	LocalDate date = LocalDate.now();
	System.out.println(date);
	LocalDate plusDate = date.plusDays(120);
	System.out.println(plusDate);
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println("_--------------------_");
	String today = formatter.format(date);
	String afterDate = formatter.format(plusDate);
	
	//this is for disable notifications
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.easemytrip.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
			//find that daparture section and click 
			driver.findElement(By.id("ddate")).click();
			Thread.sleep(1000);
			//click on the date 
			driver.findElement(By.xpath("//li[contains(@id,'"+today+"')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("divRtnCal")).click();
			Thread.sleep(1000);
			
			//optimis logic
			for(;;) {
				try {
					driver.findElement(By.xpath("//li[contains(@id,'"+afterDate+"')]")).click();
					break;
				}catch(Exception e) {
					driver.findElement(By.id("img2Nex")).click();
				}
				Thread.sleep(1000);
			}
			
//			driver.findElement(By.xpath("//span[@id='spanpEconomy']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//a[@id='traveLer']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//input[@class='srchBtnSe']")).click();
//			Thread.sleep(1000);
			
			driver.quit();		
}
}
