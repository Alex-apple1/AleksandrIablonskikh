//package com.epam.tc.hw5.pureJava.steps;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import io.qameta.allure.Step;
//import java.util.List;
//import org.assertj.core.api.SoftAssertions;
//import org.openqa.selenium.WebDriver;
//
//public class AssertionStep extends AbstractStep {
//
//    public AssertionStep(WebDriver driver) {
//        super(driver);
//    }
//
//    @Step("Проверка,что выбранные товары были добавлены к сравнению")
//    public void selectedProductsShouldBeAddedToTheCompareList(List<String> expectedProducts) {
//        List<String> actualProducts = comparePage.getProductNames();
//
//        assertThat(actualProducts)
//            .as("Проверка что выбранные товары добавлены в список сравнения")
//            .containsExactlyInAnyOrderElementsOf(expectedProducts);
//    }
//
//    @Step("Проверка что текст поиска присутствует в названии товара")
//    public void searchTextShouldBeExistInResults(String expectedText) {
//        List<String> productNames = catalogItemPage.getProductNames();
//
//        SoftAssertions softAssertions = new SoftAssertions();
//        productNames.forEach(productName ->
//            softAssertions.assertThat(productName)
//                          .as("Проверка что поисковый текст присутствует в заголовке продукта")
//                          .contains(expectedText));
//        softAssertions.assertAll();
//    }
//}
