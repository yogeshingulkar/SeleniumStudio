package popUp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarAgodaAssignment {

    public static void main(String[] args) throws InterruptedException {

        LocalDate todayDate = LocalDate.now();
        LocalDate returnDate = todayDate.plusDays(150);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String checkIn = formatter.format(todayDate);
        String checkOut = formatter.format(returnDate);

        System.out.println("Check-in Date: " + checkIn);
        System.out.println("Check-out Date: " + checkOut);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.agoda.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.id("check-in-box")).click();
        Thread.sleep(1500);

        driver.findElement(
            By.xpath("//span[@data-selenium-date='" + checkIn + "']")
        ).click();

        Thread.sleep(1000);

        for (int i = 0; i < 12; i++) {
            try {
                driver.findElement(
                    By.xpath("//span[@data-selenium-date='" + checkOut + "']")
                ).click();
                break;
            } catch (Exception e) {
                driver.findElement(
                    By.xpath("//button[@aria-label='Next Month']")
                ).click();
                Thread.sleep(800);
            }
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
