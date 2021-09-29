package com.epam.tc.hw4.pages;

import static org.assertj.core.api.Assertions.assertThat;

import io.qameta.allure.Step;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontPage {

    WebDriver webDriver;
    WebElement webElement;

    private String loginName = "Roman";
    private String loginPassword = "Jdi1234";
    private String expectedAccountName = "ROMAN IOVLEV";
    private String expectedHeaderItemHome = "HOME";
    private String expectedHeaderItemContactForm = "CONTACT FORM";
    private String expectedHeaderItemService = "SERVICE";
    private String expectedHeaderItemMetalsAndColors = "METALS & COLORS";

    @FindBy(id = "user-icon")
    private WebElement userIcon;
    @FindBy(id = "name")
    private WebElement name;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    @FindBy(xpath = "//*[text()='Roman Iovlev']")
    private WebElement userAccountName;
    @FindBy(xpath = "//*[text()='Home']")
    private WebElement headerItemHome;
    @FindBy(xpath = "//*[text()='Contact form']")
    private WebElement headerItemContactForm;
    @FindBy(xpath = "//*[text()='Service']")
    private WebElement headerItemService;
    @FindBy(xpath = "//*[text()='Metals & Colors']")
    private WebElement headerItemMetalsAndColors;
    @FindBy(className = "icons-benefit")
    private WebElement indexPageMicroscopePicture;
    @FindBy(className = "icon-custom")
    private WebElement indexPageHeadphonePicture;
    @FindBy(className = "icon-multi")
    private WebElement indexPageScreenPicture;
    @FindBy(className = "icon-base")
    private WebElement indexPageRocketPicture;
    @FindBy(id = "frame")
    private WebElement iframeExist;
    @FindBy(xpath = "//*[@id='mCSB_1_container']/ul/li[1]/a/span")
    private WebElement leftSectionHomeText;
    @FindBy(xpath = "//*[@id='mCSB_1_container']/ul/li[2]/a/span")
    private WebElement leftSectionContactFormText;
    @FindBy(xpath = "//*[@id='mCSB_1_container']/ul/li[3]/a/span")
    private WebElement leftSectionServiceText;
    @FindBy(xpath = "//*[@id='mCSB_1_container']/ul/li[4]/a/span")
    private WebElement leftSectionMetalsAndColorsText;
    @FindBy(xpath = "//*[@id='mCSB_1_container']/ul/li[5]/a/span")
    private WebElement leftSectionElementsPacksText;
    @FindBy(className = "dropdown-toggle")
    private WebElement headerMenuService;
    @FindBy(xpath = "//*[text()='Different elements']")
    private WebElement differentElementsItem;
    @FindBy(className = "benefit-icon")
    private List<WebElement> indexPageFourBottomPictures;
    @FindBy(className = "benefit-txt")
    private List<WebElement> indexPageFourBottomTexts;
    @FindBy(xpath = "//*[@id='frame-button']")
    private WebElement frameButtonExists;

    public FrontPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @Step
    public void clickOnHeaderMenuService() {
        headerMenuService.click();
    }

    @Step
    public void clickOnDifferentElementsItemFromHeaderMenuService() {
        differentElementsItem.click();
    }

    @Step
    public void goToDifferentElementsPage() {
        clickOnHeaderMenuService();
        clickOnDifferentElementsItemFromHeaderMenuService();
    }

    @Step
    public void findUserIconAndClick() {
        userIcon.click();
    }

    @Step
    public void fillUserNameIn() {
        name.sendKeys(loginName);
    }

    @Step
    public void fillUserPasswordIn() {
        password.sendKeys(loginPassword);
    }

    @Step
    public void pressLoginButton() {
        loginButton.click();
    }

    @Step
    public void assertUserAccountName() {
        assertThat(userAccountName.getText().toUpperCase())
            .as("Username")
            .isEqualTo(expectedAccountName);
    }

    @Step
    public void assertHeaderItemHome() {
        assertThat(headerItemHome.getText())
            .as("Header item Home")
            .isEqualToIgnoringCase(expectedHeaderItemHome);
    }

    @Step
    public void assertHeaderItemContactForm() {
        assertThat(headerItemContactForm.getText())
            .as("Header item Contact form")
            .isEqualToIgnoringCase(expectedHeaderItemContactForm);
    }

    @Step
    public void assertHeaderItemService() {
        assertThat(headerItemService.getText())
            .as("Header item Service")
            .isEqualToIgnoringCase(expectedHeaderItemService);
    }

    @Step
    public void assertHeaderItemMetalsAndColors() {
        assertThat(headerItemMetalsAndColors.getText())
            .as("Header item Metals & Colors")
            .isEqualToIgnoringCase(expectedHeaderItemMetalsAndColors);
    }

    @Step
    public void switchToIFrameAndCheckTheButton() {
        assertThat(frameButtonExists.isEnabled())
            .as("Button frame exists")
            .isTrue();
    }

    @Step
    public void assertIndexPageFourBottomPictures() {
        assertThat(indexPageFourBottomPictures.get(0).isDisplayed()).as("Picture is shown").isTrue();
        assertThat(indexPageFourBottomPictures.get(1).isDisplayed()).as("Picture is shown").isTrue();
        assertThat(indexPageFourBottomPictures.get(2).isDisplayed()).as("Picture is shown").isTrue();
        assertThat(indexPageFourBottomPictures.get(3).isDisplayed()).as("Picture is shown").isTrue();
    }

    @Step
    public void assertIndexPageFourBottomTexts() {
        assertThat(indexPageFourBottomTexts.get(0).getText()).isEqualTo("To include good practices\n"
            + "and ideas from successful\n"
            + "EPAM project");
        assertThat(indexPageFourBottomTexts.get(1).getText()).isEqualTo("To be flexible and\n"
            + "customizable");
        assertThat(indexPageFourBottomTexts.get(2).getText()).isEqualTo("To be multiplatform");
        assertThat(indexPageFourBottomTexts.get(3).getText()).isEqualTo("Already have good base\n"
            + "(about 20 internal and\n"
            + "some external projects),\n"
            + "wish to get more…");
    }

    @Step
    public void assertIFrameExist() {
        assertThat(iframeExist.isEnabled())
            .as("Iframe exist")
            .isTrue();
    }

    @Step
    public void assertLeftSectionHomeText() {
        assertThat(leftSectionHomeText.getText())
            .as("Home text in the Left Section")
            .isEqualTo("Home");
    }

    @Step
    public void assertLeftSectionContactFormText() {
        assertThat(leftSectionContactFormText.getText())
            .as("Contact form text in the Left Section")
            .isEqualTo("Contact form");
    }

    @Step
    public void assertLeftSectionServiceText() {
        assertThat(leftSectionServiceText.getText())
            .as("Service text in the Left Section")
            .isEqualTo("Service");
    }

    @Step
    public void assertLeftSectionMetalsAndColorsText() {
        assertThat(leftSectionMetalsAndColorsText.getText())
            .as("Metals & Colors text in the Left Section")
            .isEqualTo("Metals & Colors");
    }

    @Step
    public void assertLeftSectionElementsPacksText() {
        assertThat(leftSectionElementsPacksText.getText())
            .as("Elements packs text in the Left Section")
            .isEqualTo("Elements packs");
    }
}
