package com.epam.tc.hw5.cucumber.steps;

import com.epam.tc.hw5.cucumber.context.TestContext;
import com.epam.tc.hw5.page.DifferentElementsPage;
import com.epam.tc.hw5.page.FrontPage;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStep {

    protected FrontPage frontPage;
    protected DifferentElementsPage differentElementsPage;

    public AbstractStep() {
        WebDriver driver = TestContext.getInstance().getTestObject("web_driver");

        frontPage = new FrontPage(driver);
        differentElementsPage = new DifferentElementsPage(driver);
    }
}
