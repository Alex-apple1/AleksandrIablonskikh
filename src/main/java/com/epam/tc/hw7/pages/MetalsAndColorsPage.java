package com.epam.tc.hw7.pages;

import static java.lang.String.format;
import static java.lang.String.join;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.tc.hw7.entities.MetalsAndColorsData;
import com.epam.tc.hw7.forms.LoginForm;
import com.epam.tc.hw7.forms.MetalsAndColorsForm;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Url("/metals-colors.html")
@Title("Metal and Colors")
public class MetalsAndColorsPage extends WebPage {

    public LoginForm loginForm;

    @UI("form")
    public static MetalsAndColorsForm metalsAndColorsForm;

    @UI(".results li")
    private List<UIElement> actualResult;

    public List<String> getActualResult() {
        return actualResult.stream().map(UIElement::getText).collect(Collectors.toList());
    }

    public List<String> getExpectedResultFromMetalsAndColorsData(MetalsAndColorsData data) {
        List<String> expectedResult = new ArrayList<>();

        expectedResult.add(format("Summary: %s", (
            Integer.parseInt(data.getSummary().get(0)) + Integer.parseInt(data.getSummary().get(1)))));
        expectedResult.add(format("Elements: %s", join(", ", data.getElements())));
        expectedResult.add(format("Color: %s", data.getColor()));
        expectedResult.add(format("Metal: %s", data.getMetals()));
        expectedResult.add(format("Vegetables: %s", join(", ", data.getVegetables())));

        return expectedResult;
    }

    public void logout() {
        loginForm.logout();
    }
}
