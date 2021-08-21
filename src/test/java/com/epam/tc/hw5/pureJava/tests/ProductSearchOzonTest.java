//package com.epam.tc.hw5.pureJava.tests;
//
//import org.testng.annotations.Test;
//
//public class ProductSearchOzonTest extends AbstractBaseSeleniumTest {
//
//    @Test(description = "Тестирование поиска товара")
//    public void testProductSearch() {
//        // 1. Открыть Озон маркет
//        actionStep.openOzonHomePage();
//
//        // 2. Найти заданный товар
//        actionStep.searchProduct("iPhone");
//
//        // 3. Проверить что текст присутствует в названии продукта
//        assertionStep.searchTextShouldBeExistInResults("Apple");
//    }
//}
