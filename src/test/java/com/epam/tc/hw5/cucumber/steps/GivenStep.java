package com.epam.tc.hw5.cucumber.steps;

import io.cucumber.java.en.Given;

public class GivenStep extends AbstractStep {

    //    Ex1 and Ex2 and Ex3

    @Given("I open JDI GitHub site")
    public void openFrontPage() {
        frontPage.open();
    }

    @Given("I login as user {string}")
    public void loginAsRomanIovlev(String loginPerson) {
        frontPage.goToHeaderComponent().login(loginPerson);
    }

    @Given("I click on {string} button in Header")
    public void openServiceDropDownInHeader(String serviceItemInHeaderMenu) {
        frontPage.goToHeaderComponent().clickOnServiceButtonInHeaderMenu(serviceItemInHeaderMenu);
    }

    @Given("I click {string} through the header menu Service")
    public void openCategoryFromHeaderMenuServiceDropdown(String name) {
        frontPage.goToHeaderComponent().goToItemFromHeaderMenuServiceChosen(name);
    }
}
