package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends Base {

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkout(String firstName, String lastName, String postalCode) {
        WebElement firstNameField = waitForVisible(By.id("first-name"), 30);
        WebElement lastNameField = waitForVisible(By.id("last-name"), 10);
        WebElement postalCodeField = waitForVisible(By.id("postal-code"), 10);
        WebElement continueButton = waitForClickable(By.id("continue"), 10);

        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        postalCodeField.sendKeys(postalCode);
        continueButton.click();
    }

    public String getOrderCompletionMessage() {
        WebElement orderCompletionMessage = waitForVisible(By.className("complete-header"), 60);
        return orderCompletionMessage.getText();
    }
}
