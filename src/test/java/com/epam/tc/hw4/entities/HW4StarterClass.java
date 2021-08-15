package com.epam.tc.hw4.entities;

import com.epam.tc.hw4.pages.DifferentElementsPage;
import com.epam.tc.hw4.pages.FrontPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class HW4StarterClass {
    protected WebDriver webDriver;
    protected WebElement webElement;
    protected DifferentElementsPage differentElementsPage;
    protected FrontPage frontPage;
    protected String frontPageUrl = "https://jdi-testing.github.io/jdi-light/index.html";
    protected String nextUrl = "https://jdi-testing.github.io/jdi-light/contacts.html";

    @BeforeClass
    public void beforeClass(ITestContext context) {
        context.setAttribute("driver", webDriver);
    }

    @BeforeMethod
    @Description("This is description of second Exercise")
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @AfterMethod
    public void clear() {
        webDriver.quit();
    }
}
