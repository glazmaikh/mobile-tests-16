//package tests.android.browserstack_sample;
//
//import java.net.URL;
//import java.time.Duration;
//import java.net.MalformedURLException;
//
//import io.appium.java_client.MobileBy;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.RemoteWebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class SearchTests {
//
//    @Test
//    void searchTest() throws MalformedURLException, InterruptedException {
//
//        DesiredCapabilities caps = new DesiredCapabilities();
//
//        // Set your access credentials
//        caps.setCapability("browserstack.user", "bsuser_lTzkIJ");
//        caps.setCapability("browserstack.key", "JvmcfFkukSNWBozAjFpJ");
//
//        // Set URL of the application under test
//        caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
//
//        // Specify device and os_version for testing
//        caps.setCapability("device", "Samsung Galaxy S22 Ultra");
//        caps.setCapability("os_version", "12.0");
//
//        // Set other BrowserStack capabilities
//        caps.setCapability("project", "First Java Project");
//        caps.setCapability("build", "browserstack-build-1");
//        caps.setCapability("name", "first_test");
//
//
//        // Initialise the remote Webdriver using BrowserStack remote URL
//        // and desired capabilities defined above
//        WebDriver driver = new RemoteWebDriver(new URL("http://hub.browserstack.com/wd/hub"), caps);
//
//        // Test case for the BrowserStack sample Android app.
//        // If you have uploaded your app, update the test case here.
//        RemoteWebElement searchElement = (RemoteWebElement) new WebDriverWait(driver, Duration.ofMillis(10000)).until(
//                ExpectedConditions.elementToBeClickable(
//                        MobileBy.AccessibilityId("Search Wikipedia")));
//        searchElement.click();
//        RemoteWebElement insertTextElement = (RemoteWebElement) new WebDriverWait(driver, Duration.ofMillis(10000)).until(
//                ExpectedConditions.elementToBeClickable(
//                        MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
//        insertTextElement.sendKeys("BrowserStack");
//        Thread.sleep(5000);
////        List<RemoteWebElement> allProductsName = driver.findElementsByClassName(
////                "android.widget.TextView");
////        assert (allProductsName.size() > 0);
//
//
//        // Invoke driver.quit() after the test is done to indicate that the test is completed.
//        driver.quit();
//    }
//}
