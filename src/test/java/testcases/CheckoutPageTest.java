package testcases;

import org.testng.annotations.Test;
import pages.Base;
import pages.CheckoutPage;

public class CheckoutPageTest extends Base {
    @Test(dependsOnMethods = "testcases.CartPageTest.continueShoppingTest")
    public void checkoutTest() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.checkout("John", "Doe", "12345");
    }
}
