package com.epam.tc.hw5.page;

import com.epam.tc.hw5.page.component.AbstractComponent;
import com.epam.tc.hw5.page.component.HeaderComponent;
import com.epam.tc.hw5.page.component.ServiceHeaderComponent;
import com.epam.tc.hw5.page.component.LoginComponent;
import org.openqa.selenium.WebDriver;

public class AbstractBasePage extends AbstractComponent {

    private static final String BASE_URL = "https://jdi-testing.github.io/jdi-light/index.html";

    protected HeaderComponent headerComponent;

    protected AbstractBasePage(WebDriver driver) {
        super(driver);
        headerComponent = new HeaderComponent(driver);
    }

    public LoginComponent openUserAccount() {
        return headerComponent.openUserAccountComponent();
    }

    public ServiceHeaderComponent openHeaderMenuService() {
        return headerComponent.openHeaderMenuServiceComponent();
    }

//    public void clickOnHeaderMenuService() { headerComponent.clickOnHeaderMenuService(); }

    protected void openFrontPage(String url) {
        driver.navigate().to(BASE_URL + url);
    }
}
