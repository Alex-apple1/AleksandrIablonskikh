package com.epam.tc.hw7;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.tc.hw7.pages.Homepage;
import com.epam.tc.hw7.pages.MetalsAndColorsPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JdiSite {

    public static Homepage homePage;

    public static MetalsAndColorsPage metalsAndColorsPage;

    //    public static void open() {
    //        homePage.open();
    //    }

    //    public static void login(User user) {
    //        homePage.login(user);
    //    }

    //    public static void logout() {
    //        homePage.logout();
    //    }

    //    public static String getUserName() {
    //        return homePage.getUserName();
    //    }

    //    public static void checkUserLoggedIn(User user) {
    //        homePage.checkUserLoggedIn(user);
    //    }

    //    public static void selectMetalsAndColorsPage() {
    //        homePage.selectMetalsAndColorsPage();
    //    }
}

