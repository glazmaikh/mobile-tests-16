package tests.android.selenide;

import com.codeborne.selenide.Configuration;
import drivers.BrowserstackDriver;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static helpers.Browserstack.getVideoUrl;

public class TestBase {
    @BeforeAll
    static void setUp() {
        Configuration.browser = BrowserstackDriver.class.getName();
        Configuration.browserSize = null;
    }

    @BeforeEach
    void startDriver() {
        addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void tearDown() {
//        String sessionId = sessionId().toString();
//        Attach.screenshotAs("Last screenshot");
//        Attach.pageSource();

        closeWebDriver();
//        Attach.addVideo(sessionId);
    }
}
