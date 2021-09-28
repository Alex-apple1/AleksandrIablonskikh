package com.epam.tc.hw4.listeners;

import com.epam.tc.hw4.utils.AttachmentUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        Object driver = result.getTestContext().getAttribute("driver");

        if (driver != null) {
            AttachmentUtils.makeScreenshotAttachment("Holy-moly",
                ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
        }
    }
}
