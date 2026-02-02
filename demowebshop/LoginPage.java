package demowebshop;

import org.openqa.selenium.By;

public class LoginPage {

    public static final By EMAIL =
        By.xpath("//*[@id='Email']");

    public static final By PASSWORD =
        By.xpath("//*[@id='Password']");

    public static final By LOGIN_BUTTON =
        By.xpath("/html/body/div[4]/div/div/div[2]/form/div[3]/input");
}
