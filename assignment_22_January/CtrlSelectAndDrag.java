package assignment_22_January;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class CtrlSelectAndDrag {
	    public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/ui/dragDrop?sublist=0");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Drag Multiple')]")).click();
			
			Thread.sleep(1000);
			Actions act = new Actions(driver);
			
			WebElement lcharger = driver.findElement(By.xpath("//div[contains(text(),'Laptop Charger')]"));
			WebElement lcover = driver.findElement(By.xpath("//div[contains(text(),'Laptop Cover')]"));
			
			WebElement target1 = driver.findElement(By.xpath("//div[contains(text(),'Laptop Accessories')]"));
			act.keyDown(Keys.LEFT_CONTROL).click(lcharger).keyDown(Keys.LEFT_CONTROL).click(lcover).dragAndDrop(lcharger,target1).perform();
			Thread.sleep(2000);
			
			WebElement mcover = driver.findElement(By.xpath("//div[contains(text(),'Mobile Cover')]"));
			WebElement mcharger = driver.findElement(By.xpath("//div[contains(text(),'Mobile Charger')]"));
			
			WebElement target2 = driver.findElement(By.xpath("//div[contains(text(),'Mobile Accessories')]"));
			
			act.keyDown(Keys.LEFT_CONTROL).click(mcharger).keyDown(Keys.LEFT_CONTROL).click(mcover).dragAndDrop(mcharger, target2).perform();
			
			Thread.sleep(2000);
			
			driver.quit();
		}
	}
	
