package com.epam.tc.tests;

import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tc.hw3.pages.FrontPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise1 {

    private WebDriver webDriver;
    private String frontPageUrl = "https://jdi-testing.github.io/jdi-light/index.html";
    private String nextUrl = "https://jdi-testing.github.io/jdi-light/contacts.html";

    @Before
    @Description("This is description")
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void clear() {
        webDriver.close();
    }

    @Test
    public void firstExerciseTest() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        final FrontPage frontPage = new FrontPage(webDriver);

        step("Open test site by URL");

        webDriver.navigate()
                 .to(frontPageUrl);

        step("Assert Browser title");

        assertThat(webDriver.getTitle())
            .as("Opening Home Page").isEqualTo("Home Page");

        step("Perform log in");

        frontPage.findUserIconAndClick();
        frontPage.fillUserNameIn();
        frontPage.fillUserPasswordIn();
        frontPage.pressLoginButton();

        step("Assert Username is logged in");

        frontPage.assertUserAccountName();
        step("Assert that there are 4 items on the header section are displayed\n"
            + "        //        and they have proper texts");

        frontPage.assertHeaderItemHome();
        frontPage.assertHeaderItemContactForm();
        frontPage.assertHeaderItemService();
        frontPage.assertHeaderItemMetalsAndColors();

        step("Assert that there are 4 images on the Index Page and they are displayed");

        frontPage.assertIndexPageHeadphonePicture();
        frontPage.assertIndexPageRocketPicture();
        frontPage.assertIndexPageScreenPicture();
        frontPage.assertIndexPageMicroscopePicture();

        step("Assert that there are 4 texts on the Index Page under icons and they have proper text");

        frontPage.assertToBeMultiplatformText();

        //        webElement = webDriver.findElement(By.xpath("//*[text()='To include good practices']"));
        //        String toIncludeGoodPracticesText = webElement.getText();
        //        assertThat(toIncludeGoodPracticesText)
        //                .as("To include good practices TEXT")
        //                .isEqualTo("To include good practices and ideas from successful EPAM project");
        ////
        //        webElement = webDriver.findElement(By.xpath("//*[text()^='To be flexible and']"));
        //        String toBeFlexibleText = webElement.getText();
        //        assertThat(toBeFlexibleText)
        //                .as("To be flexible TEXT")
        //                .isEqualTo("To be flexible and");

        //        webElement = webDriver.findElement(By.xpath("//*[text()='To be multiplatform ']"));
        //        String toBeMultiplatformText = webElement.getText();
        //        assertThat(toBeMultiplatformText)
        //                .as("To be multiplatform TEXT")
        //                .isEqualTo("To be multiplatform");

        //        webElement = webDriver.findElement(By.xpath("//*[text()='Already have good base']"));
        //        String alreadyHaveGoodBaseText = webElement.getText();
        //        assertThat(alreadyHaveGoodBaseText)
        //                .as("Already have good base TEXT")
        //                .isEqualTo("Already have good base");

        step("Assert that there is the iframe with “Frame Button” exist");

        frontPage.assertIFrameExist();

        step("Switch to the iframe and check that there is “Frame Button” in the iframe");

        //        webElement = webDriver.findElement(By.cssSelector("#frame"));
        //        webElement.click();
        //        webElement = webDriver.findElement(By.xpath("//*[@id='frame-button']"));
        //        boolean frameButtonExist = webElement.isEnabled();
        //        assertThat(frameButtonExist)
        //                .as("Button frame exist")
        //                .isTrue();

        //        String windowHandler = webDriver.getWindowHandle();
        //        Set<String> windows = webDriver.getWindowHandles();
        //        webDriver.switchTo().window(windowHandler);
        //        webDriver.switchTo().frame("frame-button");
        //        webDriver.switchTo().alert();

        step("Switch to original window back");

        webDriver.navigate().to(nextUrl);
        webDriver.navigate().back();

        step("Assert that there are 5 items in the Left Section are displayed and they have proper text");

        frontPage.assertLeftSectionContactFormText();
        frontPage.assertLeftSectionElementsPacksText();
        frontPage.assertLeftSectionHomeText();
        frontPage.assertLeftSectionServiceText();
        frontPage.assertLeftSectionMetalsAndColorsText();

        step("Close Browser");

        webDriver.close();
    }
}

