package demowebshop;

import org.openqa.selenium.By;

public class RegisterPage {

    public static final By GENDER_MALE =
        By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[2]/div[1]/div/input[1]");

    public static final By FIRST_NAME =
        By.xpath("//*[@id='FirstName']");

    public static final By LAST_NAME =
        By.xpath("//*[@id='LastName']");

    public static final By EMAIL =
        By.xpath("//*[@id='Email']");

    public static final By PASSWORD =
        By.xpath("//*[@id='Password']");

    public static final By CONFIRM_PASSWORD =
        By.xpath("//*[@id='ConfirmPassword']");

    public static final By REGISTER_BUTTON =
        By.xpath("//*[@id='register-button']");
}
