package org.example.pages.googlemaps;

import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleMapsPublicTransportPage extends BasePage {
    public GoogleMapsPublicTransportPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(text(),'Wyślij trasę na telefon')]")
    private WebElement sendRouteToPhoneBtn;

    public boolean isSendRouteToPhoneBtnPresent(){
        wait.until(ExpectedConditions.visibilityOf(sendRouteToPhoneBtn));
        if(isDisplayed(sendRouteToPhoneBtn)){
            return true;
        } else {
            return false;
        }
    }
}
