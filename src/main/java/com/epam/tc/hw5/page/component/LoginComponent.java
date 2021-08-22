//package com.epam.tc.hw5.page.component;
//
//import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
//import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class LoginComponent extends AbstractComponent {
//
//    private String loginName = "Roman";
//    private String loginPassword = "Jdi1234";
//
//    @FindBy(id = "user-icon")
//    private WebElement userIcon;
//    @FindBy(id = "name")
//    private WebElement name;
//    @FindBy(id = "password")
//    private WebElement password;
//    @FindBy(id = "login-button")
//    private WebElement loginButton;
//
//    public LoginComponent(WebDriver driver) {
//        super(driver);
//    }
//
//    public void findUserIconAndClickComponent() {
//        userIcon.click();
//    }
//
//    public void fillUserNameIn() {
//        wait.until(visibilityOf(name)).sendKeys(loginName);
//    }
//
//    public void fillUserPasswordIn() {
//        wait.until(visibilityOf(password)).sendKeys(loginPassword);
//    }
//
//    public void pressLoginButton() {
//        wait.until(elementToBeClickable(loginButton)).click();
//    }
//
//    public LoginComponent openUserAccountComponent() {
//        findUserIconAndClickComponent();
//        fillUserNameIn();
//        fillUserPasswordIn();
//        pressLoginButton();
//        return null;
//    }
//}
