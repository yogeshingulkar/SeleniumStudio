package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		
		//create a object of chromeDriver with the help of constructor
		ChromeDriver driver = new ChromeDriver ();
		//open the browser
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement sendWordFile = driver.findElement(By.xpath("//input[@type='file']"));
		sendWordFile.sendKeys("D:\\Yogesh Resume.docx"); //file path 
	}

}
