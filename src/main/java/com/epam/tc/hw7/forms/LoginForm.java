package com.epam.tc.hw7.forms;

import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import com.epam.tc.hw7.entities.User;

public class LoginForm extends Form<User> {

    @UI("#user-icon")
    Button userIcon;

    @UI("#name")
    TextField name;

    @UI("#password")
    TextField password;

    @UI("#login-button")
    Button loginButton;

    @UI(".logout")
    Button logOut;

    public void login(User user) {
        userIcon.click();
        name.input(user.getName());
        password.input(user.getPassword());
        loginButton.click();
    }

    public void logout() {
        userIcon.click();
        logOut.click();
    }
}
