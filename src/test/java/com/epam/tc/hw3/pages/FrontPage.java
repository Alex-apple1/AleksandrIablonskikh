package com.epam.tc.hw3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FrontPage {

    WebDriver webDriver;

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
    @FindBy(xpath = "//*[text()='To be multiplatform ']")
    private WebElement toBeMultiplatformText;
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
    private WebElement DifferentElementsItem;

    public FrontPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void clickOnHeaderMenuService() {
        headerMenuService.click();
    }

    public void clickOnDifferentElementsItemFromHeaderMenuService() {
        DifferentElementsItem.click();
    }

    public void goToDifferentElementsPage() {
        clickOnHeaderMenuService();
        clickOnDifferentElementsItemFromHeaderMenuService();
    }

    public void findUserIconAndClick() {
        userIcon.click();
    }

    public void fillUserNameIn() {
        name.sendKeys(loginName);
    }

    public void fillUserPasswordIn() {
        password.sendKeys(loginPassword);
    }

    public void pressLoginButton() {
        loginButton.click();
    }

    public void assertUserAccountName() {
        assertThat(userAccountName.getText().toUpperCase())
                .as("Username")
                .isEqualTo(expectedAccountName);
    }

    public void assertHeaderItemHome() {
        assertThat(headerItemHome.getText())
                .as("Header item Home")
                .isEqualToIgnoringCase(expectedHeaderItemHome);
    }

    public void assertHeaderItemContactForm() {
        assertThat(headerItemContactForm.getText())
                .as("Header item Contact form")
                .isEqualToIgnoringCase(expectedHeaderItemContactForm);
    }

    public void assertHeaderItemService() {
        assertThat(headerItemService.getText())
                .as("Header item Service")
                .isEqualToIgnoringCase(expectedHeaderItemService);
    }

    public void assertHeaderItemMetalsAndColors() {
        assertThat(headerItemMetalsAndColors.getText())
                .as("Header item Metals & Colors")
                .isEqualToIgnoringCase(expectedHeaderItemMetalsAndColors);
    }

    public void assertIndexPageMicroscopePicture() {
        assertThat(indexPageMicroscopePicture.isDisplayed())
                .as("Index page microscope picture")
                .isTrue();
    }

    public void assertIndexPageHeadphonePicture() {
        assertThat(indexPageMicroscopePicture.isDisplayed())
                .as("Index page headphone picture")
                .isTrue();
    }

    public void assertIndexPageScreenPicture() {
        assertThat(indexPageMicroscopePicture.isDisplayed())
                .as("Index page screen picture")
                .isTrue();
    }

    public void assertIndexPageRocketPicture() {
        assertThat(indexPageRocketPicture.isDisplayed())
                .as("Index page rocket picture")
                .isTrue();
    }

    public void assertToBeMultiplatformText() {
        assertThat(toBeMultiplatformText.getText())
                .as("To be multiplatform TEXT")
                .isEqualTo("To be multiplatform");
    }

    public void assertIFrameExist() {
        assertThat(iframeExist.isEnabled())
                .as("Iframe exist")
                .isTrue();
    }

    public void assertLeftSectionHomeText() {
        assertThat(leftSectionHomeText.getText())
                .as("Home text in the Left Section")
                .isEqualTo("Home");
    }

    public void assertLeftSectionContactFormText() {
        assertThat(leftSectionContactFormText.getText())
                .as("Contact form text in the Left Section")
                .isEqualTo("Contact form");
    }

    public void assertLeftSectionServiceText() {
        assertThat(leftSectionServiceText.getText())
                .as("Service text in the Left Section")
                .isEqualTo("Service");
    }

    public void assertLeftSectionMetalsAndColorsText() {
        assertThat(leftSectionMetalsAndColorsText.getText())
                .as("Metals & Colors text in the Left Section")
                .isEqualTo("Metals & Colors");
    }

    public void assertLeftSectionElementsPacksText() {
        assertThat(leftSectionElementsPacksText.getText())
                .as("Elements packs text in the Left Section")
                .isEqualTo("Elements packs");
    }


}
