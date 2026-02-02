package demowebshop;

public class RegisterTest extends BaseClass {

    public void registerUser() {

        UtilityClass util = new UtilityClass();

        openBrowser();
        maximize();
        enterUrl();

        util.click(HomePage.REGISTER_LINK);
        util.click(RegisterPage.GENDER_MALE);
        util.sendKeys(RegisterPage.FIRST_NAME, "Yogesh");
        util.sendKeys(RegisterPage.LAST_NAME, "Ingulkar");
        util.sendKeys(RegisterPage.EMAIL, "yogesh@test123.com");
        util.sendKeys(RegisterPage.PASSWORD, "Test@123");
        util.sendKeys(RegisterPage.CONFIRM_PASSWORD, "Test@123");
        util.click(RegisterPage.REGISTER_BUTTON);

        closeBrowser();
    }
}
