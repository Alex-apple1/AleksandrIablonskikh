//package com.epam.tc.hw5.pureJava.steps;
//
//import io.qameta.allure.Step;
//import java.util.ArrayList;
//import java.util.List;
//import org.openqa.selenium.WebDriver;
//
//public class ActionStep extends AbstractStep {
//    public ActionStep(WebDriver driver) {
//        super(driver);
//    }
//
//    @Step("Открыть категорию '{categoryName}' и подкатегорию '{1}'")
//    public void openCategoryAndSubCategoryOzon(String categoryName, String subcategoryName) {
//        var catalog = homePage.openCatalog();
//        catalog.openCategory(categoryName);
//        catalog.openSubcategory(subcategoryName);
//    }
//
//    @Step("Сравнить товары")
//    public List<String> addProductToCompareList(int... productIndexes) {
//        List<String> products = new ArrayList<>();
//
//        for (int productIndex : productIndexes) {
//            products.add(catalogItemPage.addProductToCompare(productIndex));
//        }
//
//        catalogItemPage.clickToNavigateToCompareButton();
//
//        return products;
//    }
//
//    @Step("Поиск '{productName}'")
//    public void searchProduct(String productName) {
//        homePage.sendKeysToSearchInputField(productName);
//        homePage.clickToSearchButton();
//    }
//}
