package com.epam.tc.hw7.forms;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Checkbox;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import com.epam.tc.hw7.entities.MetalsAndColorsData;

public class MetalsAndColorsForm extends Form<MetalsAndColorsData> {

    @UI("[name=custom_radio_odd]")
    public static RadioButtons customRadioOdd;

    @UI("[name=custom_radio_even]")
    public static RadioButtons customRadioEven;

    @UI("section[id=elements-checklist] input")
    public static Checklist elementsChecklist;

    @JDropdown(root = "div[ui=dropdown]",
               value = ".filter-option",
               list = "li",
               expand = ".caret")
    public static Dropdown colors;

    @JDropdown(root = "div[ui=combobox]",
               value = ".filter-option",
               list = "li",
               expand = ".caret")
    public static Dropdown metals;

    @UI("#vegetables")
    Button vegetable;

    @JDropdown(root = "div[ui=droplist]",
               value = ".filter-option",
               list = "li",
               expand = ".caret")
    public static Dropdown vegetablesMultiDropdown;

    @UI("#g7")
    public static Checkbox vegetablesCheckBox;

    @UI("[id=submit-button]")
    public static Button submitButton;

    @Override
    public void fill(MetalsAndColorsData metalsAndColorsData) {
        customRadioOdd.select(metalsAndColorsData.getSummary().get(0));
        customRadioEven.select(metalsAndColorsData.getSummary().get(1));
        metalsAndColorsData.getElements().forEach(elementsChecklist::select);
        colors.select(metalsAndColorsData.getColor());
        metals.select(metalsAndColorsData.getMetals());
        vegetable.click();
        vegetablesCheckBox.uncheck();
        metalsAndColorsData.getVegetables().forEach(vegetablesMultiDropdown::select);
    }

    @Override
    public void submit() {
        submitButton.click();
    }
}
