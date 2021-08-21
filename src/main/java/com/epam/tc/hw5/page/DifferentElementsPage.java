package com.epam.tc.hw5.page;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfNestedElementsLocatedBy;

import com.epam.tc.hw5.page.component.CheckboxesRadioDropboxComponent;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DifferentElementsPage extends AbstractBasePage {

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
    @FindBy(xpath = "//*[@class='panel-body-list logs']")
    private List<WebElement> logDataPath;

    private CheckboxesRadioDropboxComponent checkboxesRadioDropboxComponent;

    public DifferentElementsPage(WebDriver driver) {
        super(driver);
    }

    public void selectCheckboxItems() {
        wait.until(visibilityOfAllElements(checkBoxesList));
        checkboxesRadioDropboxComponent.selectCheckboxesComponent();
    }

    public String selectRadioItem(String name) {
        wait.until(visibilityOfAllElements(radioList));
        return radioList.get(3).getText();
    }

    public void selectDropdownItem(String name) {
        dropdown.click();
    }

    public List<String> getSelectedItemsNames() {
        return wait.until(ExpectedConditions.visibilityOfAllElements(logDataPath))
                   .stream()
                   .map(WebElement::getText)
                   .collect(Collectors.toList());
    }

//    public void assertCheckboxWaterLogRow() {
//        assertThat(waterCondition.getText())
//            .as("Water condition log")
//            .contains("Water: condition changed to true");
//    }
//
//    public void assertCheckboxWindLogRow() {
//        assertThat(windCondition.getText())
//            .as("Wind condition log")
//            .contains("Wind: condition changed to true");
//    }
//
//    public void assertRadioButtonMetalLogRow() {
//        assertThat(metalCondition.getText())
//            .as("Metal condition log")
//            .contains("metal: value changed to Selen");
//    }
//
//    public void assertDropdownYellowColorLogRow() {
//        assertThat(colorCondition.getText())
//            .as("Color condition log")
//            .contains("Colors: value changed to Yellow");
//    }

    //    public void clickToSelectCheckboxes(CheckboxesRadioDropboxComponent checkboxNameSelected) {
    //        checkboxNameSelected.selectCheckboxesComponent();
    //    }

    //    public DifferentElementsPage(WebDriver webDriver) {
    //        PageFactory.initElements(webDriver, this);
    //    }

    //    public void selectRadioOnDifferentElementsPage() {
    //        wait.until(visibilityOfAllElements());
    //        radioList.get(3).click();
    //    }

    //    public void assertCheckboxWaterLogRow() {
    //        assertThat(waterCondition.getText())
    //            .as("Water condition log")
    //            .contains("Water: condition changed to true");
    //    }
    //
    //    public void assertCheckboxWindLogRow() {
    //        assertThat(windCondition.getText())
    //            .as("Wind condition log")
    //            .contains("Wind: condition changed to true");
    //    }
    //
    //    public void assertRadioButtonMetalLogRow() {
    //        assertThat(metalCondition.getText())
    //            .as("Metal condition log")
    //            .contains("metal: value changed to Selen");
    //    }
    //
    //    public void assertDropdownYellowColorLogRow() {
    //        assertThat(colorCondition.getText())
    //            .as("Color condition log")
    //            .contains("Colors: value changed to Yellow");
    //    }

    //    public void selectYellowInDropdown() {
    //        dropdown.click();
    //    }
    //
    //    public void selectRadio() {
    //        radioList.get(3).click();
    //    }

    //    public void selectCheckboxes() {
    //        checkBoxesList.get(0).click();
    //        checkBoxesList.get(2).click();
    //    }

    //    public String addProductToCompare(String name) {
    //        wait.until(visibilityOfAllElements(products));
    //        return addProductToCompare(new CheckboxesRadioDropboxComponent(driver, products.contains(name)));
    //    }
    //
    //    private String addProductToCompare(CheckboxesRadioDropboxComponent productCard) {
    //        productCard.clickToAddToCompareButton();
    //        return productCard.getProductName();
    //    }
    //
    //    public void clickToNavigateToCompareButton() {
    //        new ModalWindowComponent(driver).clickToNavigateButton();
    //    }
    //
    //    public List<String> getProductNames() {
    //        return wait.until(visibilityOfAllElements(products))
    //                   .stream()
    //                   .map(product -> new CheckboxesRadioDropboxComponent(driver, product))
    //                   .collect(Collectors.toList())
    //                   .stream()
    //                   .map(CheckboxesRadioDropboxComponent::getProductName)
    //                   .collect(Collectors.toList());
    //    }
}
