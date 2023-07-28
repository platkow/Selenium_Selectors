package org.example.pages;

import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Log
public class NewsPage extends BasePage{
    public NewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.SoaBEf a")
    private List<WebElement> resultsLinks;

    @FindBy (xpath = "//a[@aria-label='Page 10']")
    private WebElement tenResultsPage;

    @FindBy (css = "div#result-stats")
    private WebElement resultsStatusLabel;

    public int countResultsLinks(){
        log.info("Counting results links");
        return resultsLinks.size();
    }

    public void navigateTenthPage(){
        log.info("Navigating to tenth page");
        click(tenResultsPage);
    }

    public String getResultsStatus(){
        log.info("Getting results status");
        return getText(resultsStatusLabel);
    }
}
