package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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
        return resultsLinks.size();
    }

    public void navigateTenthPage(){
        click(tenResultsPage);
    }

    public String getResultsStatus(){
        return getText(resultsStatusLabel);
    }

    //refactor
    //dodaj loggery w metodach
    //połącz wszystkie testy w jedną klasę
    //przenieś tworzenie obiektó pagy do before all

}
