package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {
        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();
        WebElement logoutLink = driver.findElement(By.id("logout_sidebar_link"));
        logoutLink.click();
    }
}
