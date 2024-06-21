package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart(int numberOfItems) {
        List<WebElement> addToCartButtons = driver.findElements(By.className("btn_inventory"));
        for (int i = 0; i <=  numberOfItems && i < addToCartButtons.size(); i++) {
            addToCartButtons.get(i).click();
        }
    }

    public void goToCart() {
        WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
        cartIcon.click();
    }
}
