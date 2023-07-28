package org.example.pages;

import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log
public class GoogleApsPage extends BasePage {
    public GoogleApsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//c-wiz//ul[@class='ngVsM u4RcUd'] //li[3] //a")
    private WebElement mapsLink;

    public void navigateGoogleMaps() {
        log.info("Navigating to Google Maps");
        driver.switchTo().frame("app");
        click(mapsLink);
    }
}
