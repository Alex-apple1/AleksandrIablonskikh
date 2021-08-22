//package com.epam.tc.hw5.page.component;
//
//import static org.openqa.selenium.By.className;
//import static org.openqa.selenium.By.cssSelector;
//import static org.openqa.selenium.By.partialLinkText;
//import static org.openqa.selenium.By.xpath;
//import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
//import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
//
//import java.util.List;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class CheckboxesRadioDropboxComponent extends AbstractComponent {
//
//    private final WebElement checkboxName;
//
//    @FindBy(className = "label-checkbox")
//    private List<WebElement> checkBoxesList;
//    @FindBy(className = "label-radio")
//    private List<WebElement> radioList;
//    @FindBy(xpath = "//select[@class='uui-form-element']/option[text()='Yellow']")
//    private WebElement dropdown;
////    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li[4]")
////    private WebElement waterCondition;
////    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li[3]")
////    private WebElement windCondition;
////    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li[2]")
////    private WebElement metalCondition;
////    @FindBy(xpath = "//*[@id='mCSB_2_container']/section[1]/div[2]/div/ul/li[1]")
////    private WebElement colorCondition;
//
//    public CheckboxesRadioDropboxComponent(WebDriver driver, WebElement checkboxName) {
//        super(driver);
//        this.checkboxName = checkboxName;
//    }
//
//    public void selectCheckboxesComponent() {
//        checkBoxesList.get(0).click();
//        checkBoxesList.get(2).click();
//    }
//
////    public void selectRadioComponent() {
////        radioList.get(3).click();
////    }
//
//    public void selectRadioComponent(final String categoryName) {
//        wait.until(visibilityOfElementLocated(partialLinkText(categoryName))).click();
//    }
//
//    public void selectYellowInDropdownComponent() {
//        dropdown.click();
//    }
//}
