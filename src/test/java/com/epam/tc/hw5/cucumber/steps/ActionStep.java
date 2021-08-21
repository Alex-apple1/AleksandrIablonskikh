package com.epam.tc.hw5.cucumber.steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.When;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ActionStep extends AbstractStep {

    @ParameterType("'(.+)'")
    public List<Integer> productIndexes(String indexes) {
        return Arrays.stream(indexes.split(","))
                     .map(index -> Integer.parseInt(index.trim()))
                     .collect(Collectors.toList());
    }

    @When("I select checkboxes {checkboxIndexes} on Different Elements Page")
    public void selectCheckboxesOnDifferentElementsPage(List<Integer> checkboxIndexes) {
//        List<String> checkboxNames = new ArrayList<>();
//
//        for (Integer checkboxIndex : checkboxIndexes) {
//            checkboxNames.add(differentElementsPage.selectCheckboxesComponent(checkboxIndex));
//        }
//
//        TestContext.getInstance().addTestObject("checkbox_list", checkboxNames);
//        differentElementsPage.clickToSelectCheckboxes();

    }

    @When("I select radio {string} on Different Elements Page")
    public void selectRadioSelenOnDifferentElementsPage(String radioName) {
        differentElementsPage.selectRadioItem(radioName);
    }

    @When("I select in dropdown {string} on Different Elements Page")
    public void addProductsToCompareListOnCatalogItemPage(String dropdownName) {
        differentElementsPage.selectDropdownItem(dropdownName);
    }

}
