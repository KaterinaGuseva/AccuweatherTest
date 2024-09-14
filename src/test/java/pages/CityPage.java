package pages;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class CityPage extends Form {

    private final static String headerPage = "//h1[@class ='header-loc']";
    private final ILink selectedCityLnk = getElementFactory().getLink(By.xpath(headerPage),
            "Selected City");
   
    public CityPage() {
        super(By.xpath(headerPage), "Selected city page");
    }
    
    public String getHeaderText() {
        selectedCityLnk.state().isDisplayed();
        return selectedCityLnk.getText();
    }
}
