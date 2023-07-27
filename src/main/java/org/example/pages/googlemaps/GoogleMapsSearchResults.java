package org.example.pages.googlemaps;

import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleMapsSearchResults extends BasePage {
    public GoogleMapsSearchResults(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.etWJQ.jym1ob.kdfrQc.pChizd.bWQG4d  .g88MCb.S9kvJb")
    private WebElement plotRoute;

    public void clickPlotRute(){

        wait.until(ExpectedConditions.visibilityOf(plotRoute));
        click(plotRoute);
    }
}
