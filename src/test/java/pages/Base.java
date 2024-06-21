package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import utility.ExcelDataProvider;
import utility.TakeScreenshot;

import java.io.IOException;
import java.time.Duration;

public class Base {
    public static WebDriver driver;
    public ExcelDataProvider excel;

    @BeforeSuite
    public void setUpSuite() throws Throwable {
        excel = new ExcelDataProvider();
    }

    @BeforeTest
    public void initialize() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown() throws IOException {
        TakeScreenshot.captureScreenshot(driver);
    }

    @AfterSuite
    public void quitAll() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebElement waitForClickable(By locator, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement waitForVisible(By locator, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
