package com.epam.tc.hw7.pages;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.tc.hw7.entities.User;
import com.epam.tc.hw7.forms.LoginForm;

@Url("/index.html")
@Title("Home Page")
public class Homepage extends WebPage {

    public LoginForm loginForm;

    @UI("#user-name")
    public static Label userName;

    @UI(".uui-navigation.nav.navbar-nav.m-l8")
    public static Menu headerButtons;

    public void selectMetalsAndColorsPage() {
        headerButtons.select("Metals & Colors");
    }

    public void login(User user) {
        loginForm.login(user);
    }

    public String getUserName() {
        return userName.getText();
    }

    public void checkUserLoggedIn(User user) {
        userName.is().text(user.getFullName());
    }
}
