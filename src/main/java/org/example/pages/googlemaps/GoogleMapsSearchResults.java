package org.example.pages.googlemaps;

import lombok.extern.java.Log;
import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@Log
public class GoogleMapsSearchResults extends BasePage {
    public GoogleMapsSearchResults(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.etWJQ.jym1ob.kdfrQc.pChizd.bWQG4d  .g88MCb.S9kvJb")
    private WebElement plotRoute;

    public void clickPlotRute(){
        log.info("Clicking Plot route");
        wait.until(ExpectedConditions.visibilityOf(plotRoute));
        click(plotRoute);
    }
}
