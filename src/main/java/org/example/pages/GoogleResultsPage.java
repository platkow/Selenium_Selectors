package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class GoogleResultsPage extends BasePage {
    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(text(),'Podobne pytania')]")
    private WebElement similarQuestionsSection;

    @FindBy (xpath = "//div[@jsname='yEVEwb']")
    private List<WebElement> similarQuestions;

    @FindBy (xpath = "//div[@class='GKS7s']//span[contains(text(),'Wiadomości')]")
    private WebElement news;

    public boolean checkIfSimilarQuestionsExist() {
        if (isDisplayed(similarQuestionsSection)) {
            return true;
        } else {
            return false;
        }
    }

    public int countSimilarQuestions() {
        return similarQuestions.size();
    }

    public void navigateNews(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(news));
        click(news);
    }
}
