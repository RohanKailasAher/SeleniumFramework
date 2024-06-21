package testcases;

import org.testng.annotations.Test;
import pages.Base;
import pages.CheckoutPage;
import pages.CartPage;

public class OrderCompletionPageTest extends Base {

    @Test(dependsOnMethods = "testcases.CheckoutPageTest.checkoutTest")
    public void verifyOrderCompletionTest() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickOnFinish();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        String orderCompletionMessage = checkoutPage.getOrderCompletionMessage();
        System.out.println(orderCompletionMessage);
        assert orderCompletionMessage.equals("Thank you for your order!") : "Order completion message mismatch!";
    }
}
