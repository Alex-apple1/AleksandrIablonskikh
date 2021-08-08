package com.epam.tc.hw2.ex1;

import static org.assertj.core.api.Assertions.assertThat;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise1 {
    private WebDriver webDriver;

    private WebElement webElement;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void firstExerciseTest() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

//        1. Open test site by URL

        webDriver.navigate()
                .to("https://jdi-testing.github.io/jdi-light/index.html");

//        2. Assert Browser title

        assertThat(webDriver.getTitle())
                .as("Opening Home Page").isEqualTo("Home Page");

//        3. Perform log in

        webElement = webDriver.findElement(By.id("user-icon"));
        webElement.click();
        webElement = webDriver.findElement(By.id("name"));
        webElement.click();
        webElement.sendKeys("Roman");
        webElement = webDriver.findElement(By.id("password"));
        webElement.click();
        webElement.sendKeys("Jdi1234");
        webElement = webDriver.findElement(By.id("login-button"));
        webElement.click();

//        4. Assert Username is logged in

        webElement = webDriver.findElement(By.xpath("//*[text()='Roman Iovlev']"));
        String logNameResult = webElement.getText().toUpperCase();

        assertThat(logNameResult)
                .as("Username")
                .isEqualTo("ROMAN IOVLEV");

//        5. Assert that there are 4 items on the header section are displayed
//        and they have proper texts

        webElement = webDriver.findElement(By.xpath("//*[text()='Home']"));
        String headerItemHome = webElement.getText().toUpperCase();
        assertThat(headerItemHome)
                .as("Header item Home")
                .isEqualTo("HOME");

        webElement = webDriver.findElement(By.xpath("//*[text()='Contact form']"));
        String headerItemContactForm = webElement.getText().toUpperCase();
        assertThat(headerItemContactForm)
                .as("Header item Contact form")
                .isEqualTo("CONTACT FORM");

        webElement = webDriver.findElement(By.xpath("//*[text()='Service']"));
        String headerItemService = webElement.getText();
        assertThat(headerItemService)
                .as("Header item Service")
                .isEqualToIgnoringCase("SERVICE");

        webElement = webDriver.findElement(By.xpath("//*[text()='Metals & Colors']"));
        String headerItemMetalsAndColors = webElement.getText();
        assertThat(headerItemMetalsAndColors)
                .as("Header item Metals & Colors")
                .isEqualToIgnoringCase("METALS & COLORS");

//        6. Assert that there are 4 images on the Index Page and they are displayed

        webElement = webDriver.findElement(By.className("icons-benefit"));
        boolean indexPageMicroscopePicture = webElement.isDisplayed();
        assertThat(indexPageMicroscopePicture)
                .as("Index page microscope picture")
                .isTrue();

        webElement = webDriver.findElement(By.className("icon-custom"));
        boolean indexPageHeadphonePicture = webElement.isDisplayed();
        assertThat(indexPageHeadphonePicture)
                .as("Index page headphone picture")
                .isTrue();

        webElement = webDriver.findElement(By.className("icon-multi"));
        boolean indexPageScreenPicture = webElement.isDisplayed();
        assertThat(indexPageScreenPicture)
                .as("Index page screen picture")
                .isTrue();

        webElement = webDriver.findElement(By.className("icon-base"));
        boolean indexPageRocketPicture = webElement.isDisplayed();
        assertThat(indexPageRocketPicture)
                .as("Index page rocket picture")
                .isTrue();

//        7. Assert that there are 4 texts on the Index Page under icons and they have proper text

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

        webElement = webDriver.findElement(By.xpath("//*[text()='To be multiplatform ']"));
        String toBeMultiplatformText = webElement.getText();
        assertThat(toBeMultiplatformText)
                .as("To be multiplatform TEXT")
                .isEqualTo("To be multiplatform");

//        webElement = webDriver.findElement(By.xpath("//*[text()='Already have good base']"));
//        String alreadyHaveGoodBaseText = webElement.getText();
//        assertThat(alreadyHaveGoodBaseText)
//                .as("Already have good base TEXT")
//                .isEqualTo("Already have good base");

//        8. Assert that there is the iframe with “Frame Button” exist

        webElement = webDriver.findElement(By.id("frame"));
        boolean iframeExist = webElement.isEnabled();
        assertThat(iframeExist)
                .as("Iframe exist")
                .isTrue();
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
        webDriver.navigate().to("https://jdi-testing.github.io/jdi-light/contacts.html");
        webDriver.navigate().back();

//        11. Assert that there are 5 items in the Left Section are displayed and they have proper text

        webElement = webDriver.findElement(By.xpath("//*[@id='mCSB_1_container']/ul/li[1]/a/span"));
        String leftSectionHomeText = webElement.getText();
        assertThat(leftSectionHomeText)
                .as("Home in the Left Section")
                .isEqualTo("Home");

        webElement = webDriver.findElement(By.xpath("//*[@id='mCSB_1_container']/ul/li[2]/a/span"));
        String leftSectionContactForm = webElement.getText();
        assertThat(leftSectionContactForm)
                .as("Contact form in the Left Section")
                .isEqualTo("Contact form");

        webElement = webDriver.findElement(By.xpath("//*[@id='mCSB_1_container']/ul/li[3]/a/span"));
        String leftSectionService = webElement.getText();
        assertThat(leftSectionService)
                .as("Service in the Left Section")
                .isEqualTo("Service");

        webElement = webDriver.findElement(By.xpath("//*[@id='mCSB_1_container']/ul/li[4]/a/span"));
        String leftSectionMetalsAndColors = webElement.getText();
        assertThat(leftSectionMetalsAndColors)
                .as("Metals & Colors in the Left Section")
                .isEqualTo("Metals & Colors");

        webElement = webDriver.findElement(By.xpath("//*[@id='mCSB_1_container']/ul/li[5]/a/span"));
        String leftSectionElementPacks = webElement.getText();
        assertThat(leftSectionElementPacks)
                .as("Elements packs in the Left Section")
                .isEqualTo("Elements packs");

//        12. Close Browser

        webDriver.close();

    }

    @After
    public void clear() {
        webDriver.close();
    }

}

