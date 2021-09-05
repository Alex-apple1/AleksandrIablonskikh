package com.epam.tc.hw2.ex2;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tc.hw2.ParentClass;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Exercise2 extends ParentClass {

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

        webElement = webDriver.findElement(By.xpath("//*[text()='Roman Iovlev']"));
        String logNameResult = webElement.getText().toUpperCase();

        assertThat(logNameResult)
            .as("Username")
            .isEqualTo("ROMAN IOVLEV");

        //        5. Open through the header menu Service -> Different Elements Page

        webElement = webDriver.findElement(By.className("dropdown-toggle"));
        webElement.click();

        webElement = webDriver.findElement(By.xpath("//*[text()='Different elements']"));
        webElement.click();

        ////        6. Select checkboxes

        List<WebElement> checkBoxesList = webDriver.findElements(By.className("label-checkbox"));
        checkBoxesList.get(0).click();
        checkBoxesList.get(2).click();

        //        7. Select radio

        List<WebElement> radioList = webDriver.findElements(By.className("label-radio"));
        radioList.get(3).click();

        //        8. Select in dropdown

        webElement = webDriver.findElement(By.xpath("//select[@class='uui-form-element']/option[text()='Yellow']"));
        webElement.click();

        //        9. Assert that
        //for each checkbox there is an individual log row and value is corresponded to the status of checkbox
        //for radio button there is a log row and value is corresponded to the status of radio button
        //for dropdown there is a log row and value is corresponded to the selected value.

        webElement = webDriver.findElement(By.cssSelector(".info-panel-body li:nth-of-type(4)"));
        String waterCondition = webElement.getText();
        assertThat(waterCondition)
            .as("Water condition log")
            .contains("Water: condition changed to true");

        webElement = webDriver.findElement(By.cssSelector(".info-panel-body li:nth-of-type(3)"));
        String windCondition = webElement.getText();
        assertThat(windCondition)
            .as("Wind condition log")
            .contains("Wind: condition changed to true");

        webElement = webDriver.findElement(By.cssSelector(".info-panel-body li:nth-of-type(2)"));
        String metalCondition = webElement.getText();
        assertThat(metalCondition)
            .as("Metal condition log")
            .contains("metal: value changed to Selen");

        webElement = webDriver.findElement(By.cssSelector(".info-panel-body li:nth-of-type(1)"));
        String colorCondition = webElement.getText();
        assertThat(colorCondition)
            .as("Color condition log")
            .contains("Colors: value changed to Yellow");

        //        10. Close Browser
    }
}

