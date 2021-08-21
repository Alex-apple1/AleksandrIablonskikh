//package com.epam.tc.hw5.pureJava.steps;
//
//import com.epam.tc.selenium.lesson5.page.OzonCatalogItemPage;
//import com.epam.tc.selenium.lesson5.page.OzonComparePage;
//import com.epam.tc.selenium.lesson5.page.OzonHomePage;
//import io.qameta.allure.Step;
//import org.openqa.selenium.WebDriver;
//
//public abstract class AbstractStep {
//
//    protected OzonHomePage homePage;
//    protected OzonCatalogItemPage catalogItemPage;
//    protected OzonComparePage comparePage;
//
//    protected AbstractStep(WebDriver driver) {
//        homePage = new OzonHomePage(driver);
//        catalogItemPage = new OzonCatalogItemPage(driver);
//        comparePage = new OzonComparePage(driver);
//    }
//
//    @Step("Открыть домашнюю страницу Озон")
//    public void openOzonHomePage() {
//        homePage.open();
//    }
//}
