	package popUp;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.Alert;
	
	public class JavascriptAlerts {
	
	    static ChromeDriver driver;
	
	    public static void main(String[] args) throws InterruptedException {
	
	        driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Alerts.html");
	        driver.manage().window().maximize();
	
	        simpleAlert();
	        Thread.sleep(1000);
	        alertWithOkCancel();
	        Thread.sleep(1000);
	        alertWithTextbox();
	        Thread.sleep(1000);
	
	        driver.quit();
	    }
	
	    // 1️⃣ Simple Alert (OK)
	    public static void simpleAlert() throws InterruptedException {
	        driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
	        driver.findElement(By.cssSelector(".btn.btn-danger")).click();
	
	        Alert alert = driver.switchTo().alert();
	        System.out.println(alert.getText());
	        alert.accept();
	
	        Thread.sleep(1000);
	    }
	
	    // 2️⃣ Confirmation Alert (OK & Cancel)
	    public static void alertWithOkCancel() throws InterruptedException {
	        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
	        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	
	        Alert alert = driver.switchTo().alert();
	        System.out.println(alert.getText());
	        alert.dismiss();   // use accept() for OK
	
	        Thread.sleep(1000);
	    }
	
	    // 3️⃣ Prompt Alert (Textbox)
	    public static void alertWithTextbox() throws InterruptedException {
	        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	        driver.findElement(By.cssSelector(".btn.btn-info")).click();
	
	        Alert alert = driver.switchTo().alert();
	        alert.sendKeys("Yogesh");
	        alert.accept();
	
	        Thread.sleep(1000);
	    }
	}
