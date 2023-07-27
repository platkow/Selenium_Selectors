package org.example.pages.googlemaps;

import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleMapsPlotRutePage extends BasePage {
    public GoogleMapsPlotRutePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#sb_ifc50 input")
    private WebElement startPointFld;

    @FindBy(xpath = "//div[@class='oya4hc vxq1Hc'] [2]//button ")
    private WebElement publicTransportBtn;

    public void setUpStartPoint(String text){
        wait.until(ExpectedConditions.visibilityOf(startPointFld));
        click(startPointFld);
        sendKeys(startPointFld, text);
    }

    public void selectPublicTransport(){
        //startPointFld.getShadowRoot().
        click(publicTransportBtn);
    }


}
