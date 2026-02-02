package demowebshop;

import org.openqa.selenium.By;

import demowebshop.BaseClass;

@SuppressWarnings("unused")
public class UtilityClass extends BaseClass {

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void sendKeys(By locator, String value) {
        driver.findElement(locator).sendKeys(value);
    }

    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }

    public boolean isDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }
}
