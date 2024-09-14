package stepdefinitions;

import io.cucumber.java.en.When;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;

public class BrowserSteps {

    @When("Back to the previous page")
    public void backToPage(){
        step("Go to the previous page");
        getBrowser().goBack();
    }
}
