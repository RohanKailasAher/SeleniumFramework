package testcases;

import org.testng.annotations.Test;
import pages.Base;
import pages.CartPage;
import pages.HomePage;

public class CartPageTest extends Base {
    @Test(dependsOnMethods = "testcases.HomePageTest.addItemsToCartTest")
    public void continueShoppingTest() {
        CartPage cartPage = new CartPage(driver);
        cartPage.continueShopping();

        HomePage homePage = new HomePage(driver);
        homePage.addItemToCart(1);  // Adding one more item
        homePage.goToCart();
        cartPage.checkout();
    }
}
