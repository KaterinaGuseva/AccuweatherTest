package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageSteps {

    private final MainPage mainPage = new MainPage();
    
    @When("I accept the consent data button on the Main Page")
    public void acceptConsentData() {
        step("Accepting the consent data");
        mainPage.acceptPolicy();
    }
    
    @When("Input {string} in the search field")
    public void inputDataInSearchField(String data) {
        mainPage.inputDataInSearchField(data);
    }

    @Then("Search results list is displayed")
    public void searchResultsIsDisplayed() {
        Assert.assertTrue(mainPage.isDisplayedSearchResults(), "City search results list isn't displayed");
    }
    
    @When("I click on the first search result") 
    public void clickOnFirstResult() {
        step("Selecting the first result");
        mainPage.clickOnFirstSearchResult();
    }

    @When ("Сliсk search field")
    public void clickOnSearchField() {
        step("Clicking on search field");
        mainPage.clickOnSearchField();
    }

    @Then("Main page is opened")
    public void mainPageIsOpened() {
        Assert.assertTrue(mainPage.state().isDisplayed(), "Main page is not open");
    }
    
    @When("I choose the first recent location")
    public void chooseFirstLocation() {
        step("Choose first recent location");
        mainPage.chooseFirstRecentLocation();
    }
    
    @Then("Current location label is displayed")
    public void isCurrentLocationLabelDisplayed() {
        Assert.assertTrue(mainPage.isDisplayedCurrentLink(), 
                "Current location label isn't displayed");
    }
}
