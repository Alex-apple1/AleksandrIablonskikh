package com.epam.tc.hw6.tests;

import com.epam.tc.hw6.driver.WebDriverSingleton;
import com.epam.tc.hw6.pages.DifferentElementsPage;
import com.epam.tc.hw6.pages.FrontPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class AbstractBaseSeleniumTest {

    private FrontPage frontPage;
    private DifferentElementsPage differentElementsPage;


    @BeforeMethod
    public void setUp(ITestContext testContext) {
        var driver = WebDriverSingleton.getDriver();

        driver.manage().window().maximize();

        frontPage = new FrontPage(driver);
        differentElementsPage = new DifferentElementsPage(driver);
        testContext.setAttribute("driver", driver);
    }

    @AfterMethod
    public void tearDown() {
        WebDriverSingleton.closeDriver();
    }
}
