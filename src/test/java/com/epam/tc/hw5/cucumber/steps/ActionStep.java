package com.epam.tc.hw5.cucumber.steps;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

import com.epam.tc.hw5.cucumber.context.TestContext;
import io.cucumber.java.en.When;
import java.util.Arrays;

public class ActionStep extends AbstractStep {

    //    Ex1
    @When("I select checkboxes {string} and {string} on Different Elements Page")
    public void selectCheckboxesOnDifferentElementsPage(String water, String wind) {
        differentElementsPage.selectCheckboxItems(water);
        differentElementsPage.selectCheckboxItems(wind);

        TestContext.getInstance().addTestObject("checkboxes", Arrays.asList(water, wind));
    }

    @When("I select radio {string} on Different Elements Page")
    public void selectRadioSelenOnDifferentElementsPage(String radioName) {
        differentElementsPage.selectRadioItem(radioName);

        TestContext.getInstance().addTestObject("radio", radioName);
    }

    @When("I select in dropdown {string} on Different Elements Page")
    public void addProductsToCompareListOnCatalogItemPage(String dropdownName) {
        differentElementsPage.selectDropdownItem(dropdownName);

        TestContext.getInstance().addTestObject("dropdown", dropdownName);
    }

    //    Ex2

    @When("I click on {string} button in Service dropdown")
    public void clickOnUserTableButton(String userTableButton) {
        frontPage.goToHeaderComponent().goToItemFromHeaderMenuServiceChosen(userTableButton);
    }

    //    Ex3
    @When("I select 'vip' checkbox for \"Sergey Ivan\"")
    public void selectVipCheckboxOnUserTablePage() {
        userTablePage.selectVipCheckBoxOnUserTablePage();
    }

    //    @When("I select 'vip' checkbox for {string}")
    //    public void selectVipCheckboxOnUserTablePage(String sergeyIvanLink) {
    //        userTablePage.selectVipCheckBoxOnUserTablePage(sergeyIvanLink);
    //    }
}
