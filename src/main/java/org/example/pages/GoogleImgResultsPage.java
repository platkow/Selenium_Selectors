package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleImgResultsPage extends BasePage{
    public GoogleImgResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.ICt2Q")
    private WebElement findImgSource;

    public boolean elementIsDisplayed(){
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOf(searchedImgTitle));
//        return searchedImgTitle.getText().toString();
        return findImgSource.isDisplayed();
    }
}
