package com.epam.tc.hw3.ex2;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tc.hw3.pages.DifferentElementsPage;
import com.epam.tc.hw3.pages.FrontPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise2 {

    private WebDriver webDriver;
    private WebElement webElement;
    private String frontPageUrl = "https://jdi-testing.github.io/jdi-light/index.html";
    private DifferentElementsPage differentElementsPage;
    private FrontPage frontPage;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @AfterTest
    public void clear() {
        webDriver.quit();
    }

    @Test
    public void firstExerciseTest() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        frontPage = new FrontPage(webDriver);
        differentElementsPage = new DifferentElementsPage(webDriver);

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

