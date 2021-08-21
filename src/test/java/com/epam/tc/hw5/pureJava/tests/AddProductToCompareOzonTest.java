//package com.epam.tc.hw5.pureJava.tests;
//
//import java.util.List;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
///*
// * Test checks that all selected products was added to compare list correctly
// */
//public class AddProductToCompareOzonTest extends AbstractBaseSeleniumTest {
//
//    @DataProvider
//    public Object[][] categoriesSubCategoriesDataSet() {
//        return new Object[][] {
//            {"Электроника", "Смартфоны"},
//            {"Одежда", "Девочкам"},
//            {"Красота и здоровье", "Глаза"}
//        };
//    }
//
//    @Test(dataProvider = "categoriesSubCategoriesDataSet",
//          description = "Проварка добавления товаров к сравнению")
//    public void addProductToCompareTest(String categoryName, String subCategoryName) {
//        // 1. Открыть Озон маркет
//        actionStep.openOzonHomePage();
//
//        // 2. Выбрать категорию "Электроника"
//        // 3. Выбрать подкатегорию "Смартфоны"
//        actionStep.openCategoryAndSubCategoryOzon(categoryName, subCategoryName);
//
//        // 4. Добавить первый товар к сравнению
//        // 5. добавить второй товар к сравнению
//        // 6. Нажать на кнопку сравнить товары
//        List<String> selectedProductNames = actionStep.addProductToCompareList(1, 2, 3);
//
//        //7. Проверить, что выбранные товары были добавлены к сравнению
//        assertionStep.selectedProductsShouldBeAddedToTheCompareList(selectedProductNames);
//    }
//}
