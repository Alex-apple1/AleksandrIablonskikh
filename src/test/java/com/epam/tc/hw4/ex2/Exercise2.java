package com.epam.tc.hw4.ex2;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tc.hw4.pages.DifferentElementsPage;
import com.epam.tc.hw4.pages.FrontPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exercise2 {

    private WebDriver webDriver;
    private WebElement webElement;
    private String frontPageUrl = "https://jdi-testing.github.io/jdi-light/index.html";

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @AfterMethod
    public void clear() {
        webDriver.close();
    }

    @Test
    public void firstExerciseTest() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        FrontPage frontPage = new FrontPage(webDriver);
        final DifferentElementsPage differentElementsPage = new DifferentElementsPage(webDriver);

        //        1. Open test site by URL

        webDriver.navigate()
                 .to(frontPageUrl);

        //        2. Assert Browser title

        assertThat(webDriver.getTitle())
            .as("Opening Home Page").isEqualTo("Home Page");

        //        3. Perform log in

        frontPage.findUserIconAndClick();
        frontPage.fillUserNameIn();
        frontPage.fillUserPasswordIn();
        frontPage.pressLoginButton();

        //        4. Assert Username is logged in

        frontPage.assertUserAccountName();

        //        5. Open through the header menu Service -> Different Elements Page

        frontPage.goToDifferentElementsPage();

        //        6. Select checkboxes

        differentElementsPage.selectCheckboxes();

        //        7. Select radio

        differentElementsPage.selectRadio();

        //        8. Select in dropdown

        differentElementsPage.selectYellowInDropdown();

        //        9. Assert that
        //for each checkbox there is an individual log row and value is corresponded to the status of checkbox
        //for radio button there is a log row and value is corresponded to the status of radio button
        //for dropdown there is a log row and value is corresponded to the selected value.

        differentElementsPage.assertCheckboxWaterLogRow();
        differentElementsPage.assertDropdownYellowColorLogRow();
        differentElementsPage.assertCheckboxWindLogRow();
        differentElementsPage.assertRadioButtonMetalLogRow();

        //        10. Close Browser

        webDriver.close();
    }
}

