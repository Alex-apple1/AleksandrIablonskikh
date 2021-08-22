package com.epam.tc.hw5.cucumber.steps;

import com.epam.tc.hw5.cucumber.context.TestContext;
import io.cucumber.java.en.Then;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.SoftAssertions;

public class AssertionStep extends AbstractStep {

    SoftAssertions softAssertions = new SoftAssertions();

    //    Ex1

    @Then("I check if 'checkbox, radio button, dropdown names' and theirs statuses are corresponding to selected")
    public void allSelectedProductsShouldBeVisibleOnCompareProductsPage() {

        List<String> checkboxes = TestContext.getInstance().getTestObject("checkboxes");
        String radio = TestContext.getInstance().getTestObject("radio");
        String dropbox = TestContext.getInstance().getTestObject("dropbox");

        softAssertions.assertThat(differentElementsPage.logBodyText()).contains(checkboxes);
        softAssertions.assertThat(differentElementsPage.logBodyText()).contains(radio);
//        softAssertions.assertThat(differentElementsPage.logBodyText()).contains(dropbox);
        //        softAssertions.assertAll();
    }

    //    Ex2

    @Then("{string} page should be opened")
    public void userTablePageIsOpened(String userTablePageIsOpened) {
        softAssertions.assertThat(userTablePage.getTitle()).isEqualTo(userTablePageIsOpened);
    }

    @Then("6 Number Type Dropdowns should be displayed on Users Table on User Table Page")
    public void numberTypeDropdownsAreDisplayed() {
        softAssertions.assertThat(userTablePage.numberTypeDropdowns()).hasSize(6);
    }

    @Then("6 Usernames should be displayed on Users Table on User Table Page")
    public void usernamesAreDisplayed() {
        softAssertions.assertThat(userTablePage.usernames()).hasSize(6);
    }

    @Then("6 Description texts under images should be displayed on Users Table on User Table Page")
    public void descriptionTextsAreDisplayed() {
        softAssertions.assertThat(userTablePage.descriptionTexts()).hasSize(6);
    }

    @Then("6 checkboxes should be displayed on Users Table on User Table Page")
    public void checkboxesAreDisplayed() {
        softAssertions.assertThat(userTablePage.checkboxes()).hasSize(6);
    }

    @Then("User table should contain following values: number {string}, user {string}, description {string}")
    public void userTableContainsValues(String number, String user, String description) {
        softAssertions.assertThat(userTablePage.userTableText()).contains(Arrays.asList(number, user, description));
    }

    @Then("droplist should contain values {string} in column Type for user Roman")
    public void droplistText(String droplistValues) {
        softAssertions.assertThat(userTablePage.droplistText()).contains(droplistValues);
    }

    //    Ex3

    @Then("1 log row has {string} text in log section")
    public void logRowHasVipText(String inLogSectionText) {
        softAssertions.assertThat(userTablePage.logRowsQuantity()).hasSize(1);
        softAssertions.assertThat(userTablePage.logRowText()).contains(inLogSectionText);
    }
}

