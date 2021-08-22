package com.epam.tc.hw5.page;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UserTablePage extends AbstractBasePage {

    @FindBy(tagName = "select")
    private List<WebElement> numberTypeDropdowns;
    @FindBy(css = "tr td a")
    private List<WebElement> usernames;
    @FindBy(css = "tr td div span")
    private List<WebElement> descriptionTexts;
    @FindBy(css = "tr td div input")
    private List<WebElement> checkboxes;
    @FindBy(css = "#user-table")
    private WebElement userTableText;
    @FindBy(tagName = "select")
    private List<WebElement> droplist;
    @FindBy(className = "info-panel-section")
    private List<WebElement> logGetText;
    @FindBy(xpath = "//*[@class='panel-body-list logs']")
    private List<WebElement> logDataPath;
    @FindBy(id = "ivan")
    private WebElement sergeyIvan;
    //    @FindBy(xpath = "//*[@type='checkbox']")
    //    private List<WebElement> sergeyIvan;
    @FindBy(css = ".info-panel-section ul")
    private WebElement logRowsQuantity;
    @FindBy(css = ".info-panel-section li")
    private WebElement logRowText;

    public UserTablePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> numberTypeDropdowns() {
        return wait.until(ExpectedConditions.visibilityOfAllElements(numberTypeDropdowns));
    }

    public List<WebElement> usernames() {
        return wait.until(ExpectedConditions.visibilityOfAllElements(usernames));
    }

    public List<WebElement> descriptionTexts() {
        return wait.until(ExpectedConditions.visibilityOfAllElements(descriptionTexts));
    }

    public List<WebElement> checkboxes() {
        return wait.until(ExpectedConditions.visibilityOfAllElements(checkboxes));
    }

    public String userTableText() {
        return wait.until(visibilityOf(userTableText)).getText()
                   .replaceAll("\n", " ");
    }

    public List<String> droplistText() {
        List<WebElement> droplistItems = wait.until(ExpectedConditions.visibilityOfAllElements(droplist));
        List<WebElement> droplistItem = droplistItems.stream().findFirst().get().findElements(By.tagName("option"));
        return droplistItem.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public void selectVipCheckBoxOnUserTablePage() {
        wait.until(ExpectedConditions.visibilityOf(sergeyIvan)).click();
    }

    //    public void selectVipCheckBoxOnUserTablePage(String sergeyIvanVipCheckbox) {
    //        wait.until(visibilityOfAllElements(sergeyIvan))
    //            .stream()
    //            .filter(i -> i.getText().contains(sergeyIvanVipCheckbox))
    //            .collect(Collectors.toList()).stream().findFirst().get().click();
    //    }

    public List<WebElement> logRowsQuantity() {
        return wait.until(visibilityOfAllElements(logRowsQuantity));
    }

    public String logRowText() {
        return wait.until(visibilityOfAllElements(logRowText))
                   .stream().map(WebElement::getText).collect(Collectors.joining(""));
    }
}
