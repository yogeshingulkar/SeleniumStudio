package DailyAssignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String [] args) {
		
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//enter into the dws page
		driver.get("https://demowebshop.tricentis.com/");
		//close the browser
		driver.close();
	}
}

/*Assignments :
 * 
 * 1
 * write a script for e-commerce application 
 * steps :  
 * -> open the browser 
 * -> maximize the browser 
 * -> enter into webpage 
 * -> after entering close the browser
 * write a script for 5 different e-commerce application's
 * 
 * 
 * 2
 * write a script for healthcare application's
 * steps : 
 * -> open the browser 
 * -> maximize the browser 
 * -> enter into webpage 
 * - > after entering the webpage close the browser
 * write a script for 5 different Healthcare application's
 * 
 * Total 10 Script
 * 
 * 
 * */
