package com.epam.tc.hw3.ex1;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tc.hw3.pages.FrontPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise1 {

    private WebDriver webDriver;
    private FrontPage frontPage;
    private String frontPageUrl = "https://jdi-testing.github.io/jdi-light/index.html";
    private String nextUrl = "https://jdi-testing.github.io/jdi-light/contacts.html";

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

        //        1. Open test site by URL

        webDriver.navigate().to(frontPageUrl);

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

        //        5. Assert that there are 4 items on the header section are displayed
        //        and they have proper texts

        frontPage.assertHeaderItemHome();
        frontPage.assertHeaderItemContactForm();
        frontPage.assertHeaderItemService();
        frontPage.assertHeaderItemMetalsAndColors();

        //        6. Assert that there are 4 images on the Index Page and they are displayed

        frontPage.assertIndexPageFourBottomPictures();

        //        7. Assert that there are 4 texts on the Index Page under icons and they have proper text

        frontPage.assertIndexPageFourBottomTexts();

        //        8. Assert that there is the iframe with “Frame Button” exist

        frontPage.assertIFrameExist();

        //        9. Switch to the iframe and check that there is “Frame Button” in the iframe

        webDriver.switchTo().frame("frame");
        frontPage.switchToIFrameAndCheckTheButton();

        //        10. Switch to original window back

        webDriver.switchTo().defaultContent();

        //        11. Assert that there are 5 items in the Left Section are displayed and they have proper text

        frontPage.assertLeftSectionContactFormText();
        frontPage.assertLeftSectionElementsPacksText();
        frontPage.assertLeftSectionHomeText();
        frontPage.assertLeftSectionServiceText();
        frontPage.assertLeftSectionMetalsAndColorsText();

        //        12. Close Browser

        webDriver.close();
    }
}

