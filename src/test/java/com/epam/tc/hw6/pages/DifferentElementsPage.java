package com.epam.tc.hw6.pages;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DifferentElementsPage {

    WebDriver webDriver;

    @FindBy(className = "label-checkbox")
    private List<WebElement> checkBoxesList;
    @FindBy(className = "label-radio")
    private List<WebElement> radioList;
    @FindBy(xpath = "//select[@class='uui-form-element']/option[text()='Yellow']")
    private WebElement dropdown;
    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li[4]")
    private WebElement waterCondition;
    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li[3]")
    private WebElement windCondition;
    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li[2]")
    private WebElement metalCondition;
    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li[1]")
    private WebElement colorCondition;

    public DifferentElementsPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void assertCheckboxWaterLogRow() {
        assertThat(waterCondition.getText())
            .as("Water condition log")
            .contains("Water: condition changed to true");
    }

    public void assertCheckboxWindLogRow() {
        assertThat(windCondition.getText())
            .as("Wind condition log")
            .contains("Wind: condition changed to true");
    }

    public void assertRadioButtonMetalLogRow() {
        assertThat(metalCondition.getText())
            .as("Metal condition log")
            .contains("metal: value changed to Selen");
    }

    public void assertDropdownYellowColorLogRow() {
        assertThat(colorCondition.getText())
            .as("Color condition log")
            .contains("Colors: value changed to Yellow");
    }

    public void selectYellowInDropdown() {
        dropdown.click();
    }

    public void selectRadio() {
        radioList.get(3).click();
    }

    public void selectCheckboxes() {
        checkBoxesList.get(0).click();
        checkBoxesList.get(2).click();
    }
}
