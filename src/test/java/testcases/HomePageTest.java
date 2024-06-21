package testcases;

import org.testng.annotations.Test;
import pages.Base;
import pages.HomePage;

public class HomePageTest extends Base {
    @Test(dependsOnMethods = "testcases.LoginPageTest.loginTest")
    public void addItemsToCartTest() {
        HomePage homePage = new HomePage(driver);
        homePage.addItemToCart(1);
        homePage.goToCart();
    }
}
