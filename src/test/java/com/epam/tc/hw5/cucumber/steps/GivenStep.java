package com.epam.tc.hw5.cucumber.steps;

import io.cucumber.java.en.Given;

public class GivenStep extends AbstractStep {

    //    Ex1

    @Given("I open Front Page")
    public void openFrontPage() {
        frontPage.open();
    }

    @Given("I perform login to User Account Front Page")
    public void UserAccountFrontPage() {
        frontPage.goToHeaderComponent().login();
    }

    @Given("I click on {string} button in Header")
    public void openServiceDropDownInHeader(String serviceItemInHeaderMenu) {
        frontPage.goToHeaderComponent().clickOnServiceButtonInHeaderMenu(serviceItemInHeaderMenu);
    }

    @Given("I click {string} through the header menu Service")
    public void openCategoryFromHeaderMenuServiceDropdown(String dEServiceCategory) {
        frontPage.goToHeaderComponent().goToItemFromHeaderMenuServiceChosen(dEServiceCategory);
    }

    //    Ex2

    @Given("I open JDI GitHub site")
    public void openHomePage() {
        frontPage.open();
    }

    @Given("I login as user {string}")
    public void loginAsRomanIovlev(String loginPerson) {
        frontPage.goToHeaderComponent().login(loginPerson);
    }

    //    Ex3
    @Given("I open JDI GitHub site")
    public void openJDIPage() { frontPage.open(); }

    @Given("I login as user {string}")
    public void loginAsRoman(String loginPerson)  {
        frontPage.goToHeaderComponent().login(loginPerson);
    }

    @Given("I click on {string} button in Header")
    public void openServiceDropDownFromHeader(String serviceItemInHeaderMenu) {
        frontPage.goToHeaderComponent().clickOnServiceButtonInHeaderMenu(serviceItemInHeaderMenu);
    }

    @Given("I click on {string} button in Service dropdown")
    public void clickOnUserTableButton(String userTableButton) {
        frontPage.goToHeaderComponent().goToItemFromHeaderMenuServiceChosen(userTableButton);
    }
}
