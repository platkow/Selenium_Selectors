package org.example.pages;

import lombok.extern.java.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log
public class GoogleImgSearchPage extends BasePage {
    public GoogleImgSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input.cB9M7")
    private WebElement pasteImgLinkFld;

    @FindBy(css = "div.Qwbd3")
    private WebElement searchBtn;

    public void pasteImgLink(String imgLink) {
        log.info("Pasting link: " + imgLink);
        sendKeys(pasteImgLinkFld, imgLink);
    }

    public void search() {
        log.info("Clicking Search button");
        click(searchBtn);
    }
}
