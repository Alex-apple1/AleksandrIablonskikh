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

    @Given("I open {string} through the header menu Service")
    public void openDifferentElementsPageFromHeader(String category) {
        frontPage.goToHeaderComponent().goToDifferentElementsPage();
    }

    //    Ex2

    @Given("I open JDI GitHub site")
    public void openHomePage() {
        frontPage.open();
    }

    @Given("I login as user {string}")
    public void openHomePage(String loginPerson) {
        frontPage.open();
    }

    //    Ex3
    @Given("I open JDI GitHub site")
    public void openHomePage() {
        frontPage.open();
    }

    @Given("I login as user {string}")
    public void openHomePage(String loginPerson) {
        frontPage.open();
    }

    @Given("I click on \"Service\" button in Header")
    public void openHomePage() {
        frontPage.open();
    }

    @Given("I click on \"User Table\" button in Service dropdown")
    public void openHomePage() {
        frontPage.open();
    }
}
