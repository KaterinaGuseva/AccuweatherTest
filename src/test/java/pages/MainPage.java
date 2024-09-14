package pages;

import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.List;

public class MainPage extends Form {
    
    private final String searchResults = "//div[contains(@class,'search-bar-result')]";
    private final String recentLocation = "//a[contains(@class,'recent-location-item')]";
    private final IButton policyAcceptBtn = getElementFactory().getButton
            (By.xpath("//div[contains(@class,'policy-accept')]"), "Accept policy");
    private final ITextBox searchFieldTxb = getElementFactory().getTextBox(By.xpath("//input[@class='search-input']"), 
            "Search input");
    private final ILink resultsContainerLnk = getElementFactory().getLink(By.xpath("//div[@class='results-container']"),
            "Results container");
    private final ILink currentLocationLnk = getElementFactory().getLink(By.xpath("//div[contains(@class,'current-location-result')]"),
            "Selected City");
    
    public MainPage() {
        super(By.xpath("//div[@class='nearby-locations content-module']"), "Main Page");
    }
    
    public void acceptPolicy() {
        policyAcceptBtn.click();
    }

    @Step("Entering the data into the search field")
    public void inputDataInSearchField(String data) {
        searchFieldTxb.clearAndType(data);
    }

    private List<ILink> getSearchResultsLblList() {
        resultsContainerLnk.state().waitForDisplayed();
        return getElementFactory().findElements(By.xpath(searchResults), ElementType.LINK);
    }

    private List<ILink> getRecentLocationLblList() {
        return getElementFactory().findElements(By.xpath(recentLocation), ElementType.LINK);
    }

    public boolean isDisplayedSearchResults() {
        return !getSearchResultsLblList().isEmpty();
    }
    
    public void clickOnFirstSearchResult() {
        getSearchResultsLblList().get(1).click();
    }
    
    public void chooseFirstRecentLocation() {
        getRecentLocationLblList().get(0).click();
    }
    
    public void clickOnSearchField() {
        searchFieldTxb.click();
        currentLocationLnk.state().waitForDisplayed();
    }
    
    public boolean isDisplayedCurrentLink() {
        return currentLocationLnk.state().isDisplayed();
    }
}
