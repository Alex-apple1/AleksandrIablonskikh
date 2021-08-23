package com.epam.tc.hw6.tests;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tc.hw6.pages.FrontPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exercise1 {

    private WebDriver webDriver;
    private FrontPage frontPage;
    private String frontPageUrl = "https://jdi-testing.github.io/jdi-light/index.html";
    private String nextUrl = "https://jdi-testing.github.io/jdi-light/contacts.html";

    @BeforeClass
    public void beforeClass(ITestContext context) {
        context.setAttribute("driver", webDriver);
    }

    @BeforeMethod
    @Description("This is description of first Exercise")
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @AfterMethod
    public void clear() {
        webDriver.quit();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Feature("Front page tests")
    @Story("Marvel story")
    public void firstExerciseTest() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        frontPage = new FrontPage(webDriver);

        step("1. Open test site by URL");

        webDriver.navigate().to(frontPageUrl);

        step("2. Assert Browser title");

        assertThat(webDriver.getTitle())
            .as("Opening Home Page").isEqualTo("Home Page");

        step("3. Perform log in");

        frontPage.findUserIconAndClick();
        frontPage.fillUserNameIn();
        frontPage.fillUserPasswordIn();
        frontPage.pressLoginButton();

        step("4. Assert Username is logged in");

        frontPage.assertUserAccountName();

        step("5. Assert that there are 4 items on the header section are displayed "
            + "and they have proper texts");

        frontPage.assertHeaderItemHome();
        frontPage.assertHeaderItemContactForm();
        frontPage.assertHeaderItemService();
        frontPage.assertHeaderItemMetalsAndColors();

        step("6. Assert that there are 4 images on the Index Page and they are displayed");

        frontPage.assertIndexPageFourBottomPictures();

        step("7. Assert that there are 4 texts on the Index Page under icons and they have proper text");

        frontPage.assertIndexPageFourBottomTexts();

        step("8. Assert that there is the iframe with “Frame Button” exist");

        frontPage.assertIFrameExist();

        step("9. Switch to the iframe and check that there is “Frame Button” in the iframe");

        webDriver.switchTo().frame("frame");
        frontPage.switchToIFrameAndCheckTheButton();

        step("10. Switch to original window back");

        webDriver.switchTo().defaultContent();

        step("11. Assert that there are 5 items in the Left Section are displayed and they have proper text");

        frontPage.assertLeftSectionContactFormText();
        frontPage.assertLeftSectionElementsPacksText();
        frontPage.assertLeftSectionHomeText();
        frontPage.assertLeftSectionServiceText();
        frontPage.assertLeftSectionMetalsAndColorsText();

        step("12. Close Browser");

        webDriver.close();
    }
}

