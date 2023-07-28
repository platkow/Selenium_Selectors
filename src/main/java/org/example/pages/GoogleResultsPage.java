package org.example.pages;

import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

@Log
public class GoogleResultsPage extends BasePage {
    public GoogleResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"kp-wp-tab-overview\"]/div[5]/div/div")
    private WebElement similarQuestionsSection;

    @FindBy(xpath = "//div[@jsname='yEVEwb']")
    private List<WebElement> similarQuestions;

    @FindBy(xpath = "//div[@class='GKS7s']//span[contains(text(),'Wiadomości')]")
    private WebElement news;

    public boolean checkIfSimilarQuestionsExist() {
        log.info("Checking if Similar Questions section is displayed");
        if (isDisplayed(similarQuestionsSection)) {
            return true;
        } else {
            return false;
        }
    }

    public int countSimilarQuestions() {
        log.info("Counting similar questions");
        return similarQuestions.size();
    }

    public void navigateNews() {
        log.info("Navigating to News");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(news));
        click(news);
    }
}
