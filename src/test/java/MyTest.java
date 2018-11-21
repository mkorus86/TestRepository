import Pages.PlayStoreHomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class MyTest {


    private AndroidDriver<AndroidElement> driver;
    private FluentWait<WebDriver> wait;


    @BeforeMethod
    public void setUp(ITestContext context) throws MalformedURLException {
//        driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4729/wd/hub"), getCapabilities());
//        wait = new WebDriverWait(driver, 30)
//                .ignoring(StaleElementReferenceException.class)
//                .ignoring(NullPointerException.class)
//                .ignoring(ClassCastException.class)
//                .ignoring(NoSuchElementException.class);
//
//        context.setAttribute("driver",this.driver);
//        context.setAttribute("wait", this.wait);
    }

    @Test
    public void testName(ITestContext context) throws MalformedURLException {
        PlayStoreHomePage playStoreHomePage = new PlayStoreHomePage(context);
        playStoreHomePage.clickNavigationButton();
    }

    @Test(dataProvider = "test1")
    public void test2(String name, Integer age) {
        System.out.println(name);
        System.out.println(age);
    }

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][] {
                { "Cedric", 36},
                { "Anne", 37},
                { "Monika", 33},
        };
    }

    @AfterMethod
    public void tearDown() {
        //driver.quit();
    }

    private DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "6.0.1");
        capabilities.setCapability("deviceName", "Samsung");
        capabilities.setCapability("udid", "04b65cea");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.android.vending");
        capabilities.setCapability("appActivity", "com.android.vending.AssetBrowserActivity");
        capabilities.setCapability("autoGrantPermissions", true);
        return capabilities;
    }
}
