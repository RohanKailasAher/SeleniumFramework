package testcases;

import org.testng.annotations.Test;
import pages.Base;
import pages.LogoutPage;

public class LogoutPageTest extends Base {
    @Test(dependsOnMethods = "testcases.OrderCompletionPageTest.verifyOrderCompletionTest")
    public void logoutTest() {
        LogoutPage logoutPage = new LogoutPage(driver);
        logoutPage.logout();
    }
}
