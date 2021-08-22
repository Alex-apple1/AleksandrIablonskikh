package com.epam.tc.hw5.page.component;

import static org.openqa.selenium.By.partialLinkText;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderComponent extends AbstractComponent {
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

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

//    public LoginComponent openUserAccountComponent() {
//        wait.until(visibilityOf(userIcon)).click();
//        return new LoginComponent(driver).openUserAccountComponent();
//    }

    public void login() {
        wait.until(visibilityOf(userIcon)).click();
        driver.switchTo().activeElement();
        wait.until(visibilityOf(name)).sendKeys(loginName);
        wait.until(visibilityOf(password)).sendKeys(loginPassword);
        wait.until(visibilityOf(loginButton)).click();
    }

    public ServiceHeaderComponent openHeaderMenuServiceComponent() {
        wait.until(visibilityOf(headerMenuService)).click();
        return new ServiceHeaderComponent(driver);
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

//    clickButton(wait.until(visibilityOfAllElements(headerButtons)), "SERVICE");
//        webDriver.switchTo().activeElement();
//    clickButton(wait.until(visibilityOfAllElements(serviceMenuButtons)), "DIFFERENT ELEMENTS");
//        return new DifferentElementsPage(webDriver);
}
