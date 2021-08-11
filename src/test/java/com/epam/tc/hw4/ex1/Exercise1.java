package com.epam.tc.hw4.ex1;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tc.hw3.pages.FrontPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise1 {

    private WebDriver webDriver;
    private String frontPageUrl = "https://jdi-testing.github.io/jdi-light/index.html";
    private String nextUrl = "https://jdi-testing.github.io/jdi-light/contacts.html";

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void firstExerciseTest() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        FrontPage frontPage = new FrontPage(webDriver);

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

        //        5. Assert that there are 4 items on the header section are displayed
        //        and they have proper texts

        frontPage.assertHeaderItemHome();
        frontPage.assertHeaderItemContactForm();
        frontPage.assertHeaderItemService();
        frontPage.assertHeaderItemMetalsAndColors();

        //        6. Assert that there are 4 images on the Index Page and they are displayed

        frontPage.assertIndexPageHeadphonePicture();
        frontPage.assertIndexPageRocketPicture();
        frontPage.assertIndexPageScreenPicture();
        frontPage.assertIndexPageMicroscopePicture();

        //        7. Assert that there are 4 texts on the Index Page under icons and they have proper text

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

        //        8. Assert that there is the iframe with “Frame Button” exist

        frontPage.assertIFrameExist();
        //
        ////        9. Switch to the iframe and check that there is “Frame Button” in the iframe

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

        //        10. Switch to original window back

        webDriver.navigate().to(nextUrl);
        webDriver.navigate().back();

        //        11. Assert that there are 5 items in the Left Section are displayed and they have proper text

        frontPage.assertLeftSectionContactFormText();
        frontPage.assertLeftSectionElementsPacksText();
        frontPage.assertLeftSectionHomeText();
        frontPage.assertLeftSectionServiceText();
        frontPage.assertLeftSectionMetalsAndColorsText();

        //        12. Close Browser

        webDriver.close();
    }

    @After
    public void clear() {
        webDriver.close();
    }
}

