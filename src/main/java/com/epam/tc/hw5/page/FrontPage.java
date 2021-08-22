package com.epam.tc.hw5.page;

import org.openqa.selenium.WebDriver;

public class FrontPage extends AbstractBasePage {

    public FrontPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        openFrontPage("");
    }

}
