package com.epam.tc.hw2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ParentClass {

    protected WebDriver webDriver;

    protected WebElement webElement;

    @BeforeTest(alwaysRun = true)
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @AfterTest(alwaysRun = true)
    public void clear() {
        webDriver.quit();
    }
}
