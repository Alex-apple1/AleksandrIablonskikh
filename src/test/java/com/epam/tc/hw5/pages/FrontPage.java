package com.epam.tc.hw5.pages;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontPage {

    WebDriver webDriver;
    WebElement webElement;


    @FindBy(className = "dropdown-toggle")
    private WebElement headerMenuService;
    @FindBy(xpath = "//*[text()='Different elements']")
    private WebElement differentElementsItem;

    public FrontPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void clickOnHeaderMenuService() {
        headerMenuService.click();
    }

    public void clickOnDifferentElementsItemFromHeaderMenuService() {
        differentElementsItem.click();
    }

    public void goToDifferentElementsPage() {
        clickOnHeaderMenuService();
        clickOnDifferentElementsItemFromHeaderMenuService();
    }

}