package com.epam.tc.hw7;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.tc.hw7.JdiSite.homePage;
import static com.epam.tc.hw7.JdiSite.metalsAndColorsPage;
import static com.epam.tc.hw7.entities.User.ROMAN;
import static com.epam.tc.hw7.pages.MetalsAndColorsPage.metalsAndColorsForm;
import static org.testng.Assert.assertEquals;

import com.epam.tc.hw7.entities.MetalsAndColorsData;
import com.epam.tc.hw7.utils.DataProviders;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class JdiSiteTests {

    @BeforeSuite(alwaysRun = true)
    public void setUp() {
        initElements(JdiSite.class);
    }

    @AfterSuite(alwaysRun = true)
    public void quit() {
        killAllSeleniumDrivers();
    }

    @Test(dataProvider = "metalsAndColorsData", dataProviderClass = DataProviders.class)
    public void metalsAndColorsTest(MetalsAndColorsData metalsAndColorsData) {
        homePage.open();
        homePage.login(ROMAN);
        homePage.checkUserLoggedIn(ROMAN);

        homePage.selectMetalsAndColorsPage();
        metalsAndColorsPage.checkOpened();

        metalsAndColorsForm.fill(metalsAndColorsData);
        metalsAndColorsForm.submit();

        assertEquals(metalsAndColorsPage.getActualResult(),
            metalsAndColorsPage.getExpectedResultFromMetalsAndColorsData(metalsAndColorsData));

        metalsAndColorsPage.logout();
    }
}
