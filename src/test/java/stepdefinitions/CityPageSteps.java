package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CityPage;

public class CityPageSteps {

    private final CityPage cityPage = new CityPage();

    @When("Wait for the selected city page is open")
    public void waitSelectedCityPageLoad() {
        cityPage.state().waitForDisplayed();
    }
    
    @Then("City weather page header contains {string}")
    public void checkSelectedData(String testData) {
        Assert.assertTrue(cityPage.getHeaderText().contains(testData),
                String.format("City weather page header should be contain %s", testData));
    }
}
