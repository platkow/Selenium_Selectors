package org.example.pages;

import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log
public class GoogleSearchPage extends BasePage{
    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = "#W0wltc")
    private WebElement rejectAllBtn;

    @FindBy (css = "input.gLFyf, #APjFqb")
    private WebElement searchFld;

    @FindBy (xpath = "//a[@aria-label='Aplikacje Google']")
    private WebElement googleAps;

    @FindBy(css = "div.nDcEnd")
    private WebElement searchByImage;

    @FindBy(css = "div.ea0Lbe")
    private WebElement imgSearchWindow;

    public void rejectAllCookies(){
        log.info("Rejecting all cookies");
        if (isDisplayed(rejectAllBtn)){
            click(rejectAllBtn);
        }
    }

    public void search(String text){
        log.info("Searching for text: " + text);
        sendKeys(searchFld, text);
        searchFld.submit();
    }

    public void navigateGoogleAps(){
        log.info("Navigating to Google Aps");
        click(googleAps);
    }

    public void navigateToSearchByImage() {
        log.info("Navigating to Search By Image");
        Actions action = new Actions(driver);
        action.moveToElement(searchByImage).click(searchByImage).build().perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(imgSearchWindow));
    }
}
