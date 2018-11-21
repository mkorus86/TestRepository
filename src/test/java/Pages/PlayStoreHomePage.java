package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.ITestContext;

public class PlayStoreHomePage {
    private final By navigationButton = By.xpath("//*[contains(@resource-id,'navigation_button')]");
    private AndroidDriver<AndroidElement> driver;
    private FluentWait<WebDriver> wait;

    public PlayStoreHomePage(ITestContext context) {
        this.driver = (AndroidDriver<AndroidElement>)context.getAttribute("driver");
        this.wait = (FluentWait<WebDriver>)context.getAttribute("wait");
    }

    public void clickNavigationButton() {
        wait.until(ExpectedConditions.elementToBeClickable(navigationButton));
        driver.findElement(navigationButton).click();
    }
}
