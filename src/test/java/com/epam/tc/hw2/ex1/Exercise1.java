package com.epam.tc.hw2.ex1;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tc.hw2.ParentClass;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Exercise1 extends ParentClass {

    @Test
    public void firstExerciseTest() throws InterruptedException {

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

        webElement = webDriver.findElement(By.cssSelector("#user-name"));
        String logNameResult = webElement.getText().toUpperCase();

        assertThat(logNameResult)
            .as("Username")
            .isEqualTo("ROMAN IOVLEV");

        //        5. Assert that there are 4 items on the header section are displayed
        //        and they have proper texts

        List<WebElement> headerSectionButtons = webDriver.findElements(By.cssSelector("ul.navbar-nav.m-l8 > li"));
        List<String> expectedHeaderSectionButtons = Arrays.asList("HOME", "CONTACT FORM", "SERVICE", "METALS & COLORS");

        assertThat(headerSectionButtons).hasSize(4);
        assertThat(headerSectionButtons.stream().map(WebElement::getText).collect(Collectors.toList()))
            .containsExactlyElementsOf(expectedHeaderSectionButtons);

        //        6. Assert that there are 4 images on the Index Page and they are displayed

        List<WebElement> indexPageImages = webDriver.findElements(By.className("benefit-icon"));

        assertThat(indexPageImages).hasSize(4);

        //        7. Assert that there are 4 texts on the Index Page under icons and they have proper text

        List<WebElement> indexPageFourTexts = webDriver.findElements(By.className("benefit-txt"));
        List<String> expectedIndexPageFourTexts = Arrays.asList(
            "To include good practices\n" + "and ideas from successful\n" + "EPAM project",
            "To be flexible and\n" + "customizable",
            "To be multiplatform",
            "Already have good base\n" + "(about 20 internal and\n" + "some external projects),\n"
                + "wish to get more…");

        assertThat(indexPageFourTexts.stream().map(WebElement::getText).collect(Collectors.toList()))
            .containsExactlyElementsOf(expectedIndexPageFourTexts);

        //        8. Assert that there is the iframe with “Frame Button” exist

        webElement = webDriver.findElement(By.id("frame"));
        boolean iframeExists = webElement.isEnabled();

        assertThat(iframeExists)
            .as("Iframe exists")
            .isTrue();

        //        9. Switch to the iframe and check that there is “Frame Button” in the iframe

        webDriver.switchTo().frame("frame");

        webElement = webDriver.findElement(By.cssSelector("#frame-button"));
        boolean frameButtonExists = webElement.isEnabled();

        assertThat(frameButtonExists)
            .as("Button frame exists")
            .isTrue();

        //        10. Switch to original window back

        webDriver.switchTo().

                 defaultContent();

        //        11. Assert that there are 5 items in the Left Section are displayed and they have proper text

        List<WebElement> leftSectionMenu = webDriver.findElements(By.xpath("//*[@class='sidebar-menu left']/li/a"));
        List<String> expectedLeftSectionMenu = Arrays.asList("Home", "Contact form",
            "Service", "Metals & Colors", "Elements packs");

        assertThat(leftSectionMenu).hasSize(5);
        assertThat(leftSectionMenu.stream().map(WebElement::getText).collect(Collectors.toList()))
            .containsExactlyElementsOf(expectedLeftSectionMenu);

        //        12. Close Browser
    }
}

