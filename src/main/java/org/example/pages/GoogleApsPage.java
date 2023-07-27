package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleApsPage extends BasePage{
    public GoogleApsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//c-wiz//ul[@class='ngVsM u4RcUd'] //li[3] //a")
    private WebElement mapsLink;

    public void navigateGoogleMaps(){
        driver.switchTo().frame("app");
        click(mapsLink);
    }
}
