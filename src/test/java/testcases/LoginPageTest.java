package testcases;

import org.testng.annotations.Test;
import pages.Base;
import pages.LoginPage;

public class LoginPageTest extends Base {
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        String username = excel.getStringData("Sheet1", 0, 0);
        String password = excel.getStringData("Sheet1", 0, 1);
        loginPage.login(username, password);
    }
}
