package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleImgSearchPage extends BasePage {
    public GoogleImgSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input.cB9M7")
    private WebElement pasteImgLinkFld;

    @FindBy(css = "div.Qwbd3")
    private WebElement searchBtn;

    public void pasteImgLink(String imgLink) {
        sendKeys(pasteImgLinkFld, imgLink);
    }

    public void search() {
        click(searchBtn);
    }
}
