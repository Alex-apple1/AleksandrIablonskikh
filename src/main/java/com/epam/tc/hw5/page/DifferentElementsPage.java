package com.epam.tc.hw5.page;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DifferentElementsPage extends AbstractBasePage {

    @FindBy(className = "label-checkbox")
    private List<WebElement> checkBoxes;
    @FindBy(className = "label-radio")
    private List<WebElement> radioList;
    @FindBy(xpath = "//select[@class='uui-form-element']/option[text()='Yellow']")
    private WebElement dropdown;
    @FindBy(tagName = "option")
    private List<WebElement> dropdownItems;

    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li[4]")
    private WebElement waterCondition;
    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li[3]")
    private WebElement windCondition;
    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li[2]")
    private WebElement metalCondition;
    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li[1]")
    private WebElement colorCondition;
    @FindBy(className = "info-panel-section")
    private List<WebElement> logGetText;
    @FindBy(xpath = "//*[@class='panel-body-list logs']")
    private List<WebElement> logDataPath;

    //    private CheckboxesRadioDropboxComponent checkboxesRadioDropboxComponent;

    public DifferentElementsPage(WebDriver driver) {
        super(driver);
    }

    public void selectCheckboxItems(String boxName) {
        wait.until(visibilityOfAllElements(checkBoxes))
            .stream()
            .filter(i -> i.getText().contains(boxName))
            .collect(Collectors.toList()).stream().findFirst().get().click();
    }

    public void selectRadioItem(String radioName) {
        wait.until(visibilityOfAllElements(radioList))
            .stream()
            .filter(i -> i.getText().contains(radioName))
            .collect(Collectors.toList()).stream().findFirst().get().click();
    }

    public void selectDropdownItem(String dropdownName) {
        wait.until(ExpectedConditions.visibilityOf(dropdown)).click();
        driver.switchTo().activeElement();
        wait.until(visibilityOfAllElements(dropdownItems))
            .stream()
            .filter(i -> i.getText().contains(dropdownName))
            .collect(Collectors.toList()).stream().findFirst().get().click();
    }

    public List<String> getSelectedItemsNames() {
        return wait.until(ExpectedConditions.visibilityOfAllElements(logDataPath))
                   .stream()
                   .map(WebElement::getText)
                   .collect(Collectors.toList());
    }

    public boolean findInLog(String elementName) {
        return wait.until(visibilityOfAllElements(logDataPath))
                   .stream().anyMatch(i -> i.getText().contains(elementName));
    }

    public String logBodyText() {
        return wait.until(visibilityOfAllElements(logGetText))
                   .stream().map(WebElement::getText).collect(Collectors.joining(""));
    }
}
