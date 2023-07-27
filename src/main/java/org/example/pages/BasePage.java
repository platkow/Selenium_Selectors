package org.example.pages;

import lombok.extern.java.Log;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Log
public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public void sendKeys(WebElement element, String text){
        log.info("Sending text: " + text + " to field: " + element.getTagName());
        element.sendKeys(text);
    }

    public void click(WebElement element){
        log.info("Clicking on element: " + element.getTagName());
        element.click();
    }

    public void clickEnter(WebElement element){
        log.info("Send keys ENTER to element: " + element.getTagName());
        element.sendKeys(Keys.ENTER);
    }

    public boolean isDisplayed(WebElement element){
        log.info("Checking if element is displayed");
        if (element.isDisplayed()){
            return true;
        } else {
            return false;
        }
    }

    public String getText(WebElement element){
        log.info("Getting text from element: " + element.getTagName());
        return element.getText();
    }
}
