package com.epam.tc.hw5.cucumber.steps;

import com.epam.tc.hw5.cucumber.context.TestContext;
import com.epam.tc.hw5.page.DifferentElementsPage;
import com.epam.tc.hw5.page.FrontPage;
import com.epam.tc.hw5.page.UserTablePage;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStep {

    protected FrontPage frontPage;
    protected DifferentElementsPage differentElementsPage;
    protected UserTablePage userTablePage;

    public AbstractStep() {
        WebDriver driver = TestContext.getInstance().getTestObject("web_driver");

        frontPage = new FrontPage(driver);
        differentElementsPage = new DifferentElementsPage(driver);
        userTablePage = new UserTablePage(driver);

    }
}
