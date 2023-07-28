package org.example.pages;

import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log
public class GoogleImgResultsPage extends BasePage {
    public GoogleImgResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.ICt2Q")
    private WebElement findImgSource;

    public boolean elementIsDisplayed() {
        log.info("Verifying if element is displayed");
        return findImgSource.isDisplayed();
    }
}
