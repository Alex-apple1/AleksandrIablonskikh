package com.epam.tc.hw5.page.component;

import static org.openqa.selenium.By.partialLinkText;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderComponent extends AbstractComponent {

    private static final String BASE_URL = "https://jdi-testing.github.io/jdi-light/index.html";

    private String loginName = "Roman";
    private String loginPassword = "Jdi1234";

    @FindBy(id = "user-icon")
    private WebElement userIcon;
    @FindBy(id = "name")
    private WebElement name;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement loginButton;
    @FindBy(className = "dropdown-toggle")
    private WebElement headerMenuService;
    @FindBy(xpath = "//*[text()='Different elements']")
    private WebElement differentElementsItem;
    @FindBy(xpath = "//*[text()='User Table ']")
    private WebElement userTableItem;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public void login() {
        wait.until(visibilityOf(userIcon)).click();
        driver.switchTo().activeElement();
        wait.until(visibilityOf(name)).sendKeys(loginName);
        wait.until(visibilityOf(password)).sendKeys(loginPassword);
        wait.until(visibilityOf(loginButton)).click();
    }

    @SneakyThrows
    public void login(String loginNameGiven) {
        if (loginNameGiven.contains("Roman Iovlev")) {
            wait.until(visibilityOf(userIcon)).click();
            wait.until(visibilityOf(name)).sendKeys(loginName);
            wait.until(visibilityOf(password)).sendKeys(loginPassword);
            wait.until(visibilityOf(loginButton)).click();
        }
    }

    public void clickOnServiceButtonInHeaderMenu(String buttonInHeaderMenu) {
        if (buttonInHeaderMenu.contains("Service")) {
            wait.until(visibilityOf(headerMenuService)).click();
        } else {
            driver.navigate().to(BASE_URL);
        }
    }

    public void goToItemFromHeaderMenuServiceChosen(String serviceCategory) {
        if (serviceCategory.contains("Different Elements")) {
            wait.until(visibilityOf(differentElementsItem)).click();
        } else {
            wait.until(visibilityOf(userTableItem)).click();
        }
    }
}
