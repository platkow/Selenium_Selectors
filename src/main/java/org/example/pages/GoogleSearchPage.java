package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
        if (isDisplayed(rejectAllBtn)){
            click(rejectAllBtn);
        }
    }

    public void search(String text){
        sendKeys(searchFld, text);
        searchFld.submit();
    }

    public void navigateGoogleAps(){
        click(googleAps);
    }

    public void navigateToSearchByImage() {
        Actions action = new Actions(driver);
        action.moveToElement(searchByImage).click(searchByImage).build().perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(imgSearchWindow));
    }
}
