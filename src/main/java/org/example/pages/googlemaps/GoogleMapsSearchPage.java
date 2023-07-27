package org.example.pages.googlemaps;

import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleMapsSearchPage extends BasePage {
    public GoogleMapsSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#searchboxinput")
    private WebElement searchFld;

    public void search(String text){
        sendKeys(searchFld, text);
        clickEnter(searchFld);
    }
}
