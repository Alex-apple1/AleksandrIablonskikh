package com.epam.tc.hw5.cucumber.steps;

import io.cucumber.java.en.Given;

public class GivenStep extends AbstractStep {

    @Given("I open Front Page")
    public void openFrontPage() {
        frontPage.open();
    }

    @Given("I perform login to User Account Front Page")
    public void UserAccountFrontPage() {
        var userAccount = frontPage.openUserAccount();
        userAccount.openUserAccountComponent();
    }

    @Given("I open {string} through the header menu Service")
    public void openDifferentElementsPageFromHeader(String category) {
        var serviceCategory = frontPage.openHeaderMenuService();
        serviceCategory.openServiceCategoryComponent(category);
    }
}
