package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends Base {

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void continueShopping() {
        WebElement continueShoppingButton = waitForClickable(By.id("continue-shopping"), 10);
        continueShoppingButton.click();
    }

    public void checkout() {
        WebElement checkoutButton = waitForClickable(By.id("checkout"), 10);
        checkoutButton.click();
    }

    public void clickOnFinish() {
        WebElement finishButton = waitForClickable(By.id("finish"), 10);
        finishButton.click();
    }
}
