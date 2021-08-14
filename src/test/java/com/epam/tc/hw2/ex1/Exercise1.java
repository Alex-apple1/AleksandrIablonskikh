package com.epam.tc.hw2.ex1;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exercise1 {
    private WebDriver webDriver;

    private WebElement webElement;

    @BeforeTest
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

        String[][] headerSectionArray = {
            {"//*[text()='Home']", "HOME"},
            {"//*[text()='Contact form']", "CONTACT FORM"},
            {"//*[text()='Service']", "SERVICE"},
            {"//*[text()='Metals & Colors']", "METALS & COLORS"}
        };

        for (String[] strings : headerSectionArray) {
            webElement = webDriver.findElement(By.xpath(strings[0]));
            String headerSectionText = webElement.getText().toUpperCase();
            assertThat(headerSectionText)
                .as("Text in the Header Section")
                .isEqualTo(strings[1]);
        }

        //        6. Assert that there are 4 images on the Index Page and they are displayed

        List<String> indexPageImages = List.of("icons-benefit", "icon-custom", "icon-multi", "icon-base");

        for (String indexPageClassName : indexPageImages) {
            webElement = webDriver.findElement(By.className(indexPageClassName));
            boolean indexPagePicture = webElement.isDisplayed();
            assertThat(indexPagePicture)
                .as("Index page some picture")
                .isTrue();
        }

        //        7. Assert that there are 4 texts on the Index Page under icons and they have proper text

        List<WebElement> indexPageFourTexts = webDriver.findElements(By.cssSelector(".benefit-txt"));
        assertThat(indexPageFourTexts.get(0).getText()).isEqualTo("To include good practices\n"
            + "and ideas from successful\n"
            + "EPAM project");
        assertThat(indexPageFourTexts.get(1).getText()).isEqualTo("To be flexible and\n"
            + "customizable");
        assertThat(indexPageFourTexts.get(2).getText()).isEqualTo("To be multiplatform");
        assertThat(indexPageFourTexts.get(3).getText()).isEqualTo("Already have good base\n"
            + "(about 20 internal and\n"
            + "some external projects),\n"
            + "wish to get more…");


        //        8. Assert that there is the iframe with “Frame Button” exist

        webElement = webDriver.findElement(By.id("frame"));
        boolean iframeExists = webElement.isEnabled();
        assertThat(iframeExists)
            .as("Iframe exists")
            .isTrue();

        //        9. Switch to the iframe and check that there is “Frame Button” in the iframe

        webDriver.switchTo().frame("frame");

        //        webElement = webDriver.findElement(By.cssSelector("#frame"));
        //                webElement.click();
        webElement = webDriver.findElement(By.xpath("//*[@id='frame-button']"));
        boolean frameButtonExists = webElement.isEnabled();
        assertThat(frameButtonExists)
            .as("Button frame exists")
            .isTrue();

        //                String windowHandler = webDriver.getWindowHandle();
        //                Set<String> windows = webDriver.getWindowHandles();
        //                webDriver.switchTo().window(windowHandler);
        //                webDriver.switchTo().frame("frame-button");
        //                webDriver.switchTo().alert();

        //        10. Switch to original window back
        webDriver.switchTo().defaultContent();

        //        11. Assert that there are 5 items in the Left Section are displayed and they have proper text

        String[][] leftSectionArr = {
            {"//*[@id='mCSB_1_container']/ul/li[1]/a/span", "Home"},
            {"//*[@id='mCSB_1_container']/ul/li[2]/a/span", "Contact form"},
            {"//*[@id='mCSB_1_container']/ul/li[3]/a/span", "Service"},
            {"//*[@id='mCSB_1_container']/ul/li[4]/a/span", "Metals & Colors"},
            {"//*[@id='mCSB_1_container']/ul/li[5]/a/span", "Elements packs"}
        };

        for (String[] strings : leftSectionArr) {
            webElement = webDriver.findElement(By.xpath(strings[0]));
            String leftSectionText = webElement.getText();
            assertThat(leftSectionText)
                .as("Text in the Left Section")
                .isEqualTo(strings[1]);
        }

        //        12. Close Browser

        webDriver.close();
    }

    @AfterTest
    public void clear() {
        webDriver.quit();
    }
}

