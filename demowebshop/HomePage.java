package demowebshop;

import org.openqa.selenium.By;

public class HomePage {

    public static final By REGISTER_LINK =
        By.xpath("/html/body/div[4]/div/div/div[1]/div[2]/div/ul/li[1]/a");

    public static final By LOGIN_LINK =
        By.xpath("/html/body/div[4]/div/div/div[1]/div[2]/div/ul/li[2]/a");

    public static final By SEARCH_BOX =
        By.xpath("/html/body/div[4]/div/div/div[1]/div[3]/form/input[1]");

    public static final By SEARCH_BUTTON =
        By.xpath("/html/body/div[4]/div/div/div[1]/div[3]/form/input[2]");
}
