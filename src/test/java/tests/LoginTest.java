package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ExcelUtils;

public class LoginTest extends BaseTest {

    @DataProvider
    public Object[][] loginData() {
        return ExcelUtils.getTestData("Login");
    }

    @Test(dataProvider = "loginData")
    public void verifyLogin(String email, String password) {

        test.info("Navigating to Login Page");
        LoginPage loginPage = new LoginPage(driver);

        test.info("Logging in with email: " + email);
        loginPage.login(email, password);

        test.info("Verifying page title");
        Assert.assertTrue(driver.getTitle().contains("Automation"));
    }
}
