package com.epam.tc.hw5.page.component;

import static org.openqa.selenium.By.partialLinkText;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderComponent extends AbstractComponent {

    @FindBy(id = "user-icon")
    private WebElement userIcon;
    @FindBy(className = "dropdown-toggle")
    private WebElement headerMenuService;
    @FindBy(xpath = "//*[text()='Different elements']")
    private WebElement differentElementsItem;

    public HeaderComponent(WebDriver driver) {
        super(driver);
    }

    public LoginComponent openUserAccountComponent() {
        wait.until(visibilityOf(userIcon)).click();
        return new LoginComponent(driver);
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
}
