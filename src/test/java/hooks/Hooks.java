package hooks;

import aquality.selenium.browser.AqualityServices;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.SettingsTestData;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;

public class Hooks {
    
    @Before
    public void setup() {
        step("Open the browser in maximized mode");
        getBrowser().maximize();
        step("Go to the start URL");
        getBrowser().goTo(SettingsTestData.getEnvData().getHost());
    }
    
    @After
    public void teardown() {
        if (AqualityServices.isBrowserStarted()) {
            step("Quiting the browser");
            getBrowser().quit();
        }
    }
}
