package com.epam.tc.hw5.cucumber.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tc.hw5.cucumber.context.TestContext;
import io.cucumber.java.en.Then;
import java.util.List;
import org.assertj.core.api.SoftAssertions;

public class AssertionStep extends AbstractStep {

    //    Ex1

    @Then("I check if 'checkbox, radio button, dropdown names' and theirs statuses are corresponding to selected")
    public void allSelectedProductsShouldBeVisibleOnCompareProductsPage() {
        SoftAssertions softAssertions = new SoftAssertions();

        List<String> checkboxes = TestContext.getInstance().getTestObject("checkboxes");
        String radio = TestContext.getInstance().getTestObject("radio");
        String dropbox = TestContext.getInstance().getTestObject("dropbox");

        softAssertions.assertThat(differentElementsPage.logBodyText()).contains(checkboxes);
        softAssertions.assertThat(differentElementsPage.logBodyText()).contains(radio);
        softAssertions.assertThat(differentElementsPage.logBodyText()).contains(dropbox);
        softAssertions.assertAll();
    }

    //    Ex2

    @Then("\"User Table\" page should be opened")
    public void dd() {
        SoftAssertions softAssertions = new SoftAssertions();

        List<String> checkboxes = TestContext.getInstance().getTestObject("checkboxes");
        String radio = TestContext.getInstance().getTestObject("radio");
        String dropbox = TestContext.getInstance().getTestObject("dropbox");

        softAssertions.assertThat(differentElementsPage.logBodyText()).contains(checkboxes);
        softAssertions.assertThat(differentElementsPage.logBodyText()).contains(radio);
        softAssertions.assertThat(differentElementsPage.logBodyText()).contains(dropbox);
        softAssertions.assertAll();
    }

    @Then("6 Number Type Dropdowns should be displayed on Users Table on User Table Page")
    public void dd() {

    }

    @Then("6 Description texts under images should be displayed on Users Table on User Table Page")
    public void dd() {

    }

    @Then("6 checkboxes should be displayed on Users Table on User Table Page")
    public void dd() {

    }

    @Then(
        "User table should contain following values: number \"<Number>\", user \"<User>\", description \"<Description>\"")
    public void dd(String number, String user, String description) {

    }

    //    Ex3

    @Then("1 log row has \"Vip: condition changed to true\" text in log section")
    public void dd() {

    }

    @Then("droplist should contain '<Dropdown Values>' values in column Type for user Roman")
    public void dd() {

    }
}

