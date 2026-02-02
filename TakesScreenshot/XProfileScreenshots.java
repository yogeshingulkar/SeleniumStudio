package TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class XProfileScreenshots {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://x.com/actorvijay?lang=en");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // 🔹 Dynamic name (same logic as yours)
        String dateTime = LocalDateTime.now().toString().replaceAll(":", "");
        String dynamicName = "dwsSearchBox" + dateTime;

        String path = "D:\\M65\\Selenium\\SeleniumFile\\" + dynamicName + ".png";

        /* ================= COVER IMAGE SCREENSHOT ================= */

        Thread.sleep(3000);
        WebElement coverImage = driver.findElement(By.xpath("(//img[@class='css-9pa8cd'])[1]"));
        coverImage.click();

        File cover = coverImage.getScreenshotAs(OutputType.FILE);
        File coverPath = new File(path);
        FileHandler.copy(cover, coverPath);

        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@data-testid='swipe-to-dismiss']")).click();

        /* ================= PROFILE IMAGE SCREENSHOT ================= */

        Thread.sleep(3000);
        WebElement profileImage = driver.findElement(
                By.xpath("(//div[@class='css-175oi2r r-172uzmj r-1pi2tsx r-13qz1uu r-o7ynqc r-6416eg r-1ny4l3l'])[1]")
        );

        profileImage.click();

        File profile = profileImage.getScreenshotAs(OutputType.FILE);
        File profilePath = new File("D:\\M65\\Selenium\\SeleniumFile\\profile_" + dateTime + ".png");
        FileHandler.copy(profile, profilePath);

        Thread.sleep(3000);

        driver.quit();
    }
}
