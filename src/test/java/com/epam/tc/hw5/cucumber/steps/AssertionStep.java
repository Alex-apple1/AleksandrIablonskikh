package com.epam.tc.hw5.cucumber.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tc.hw5.cucumber.context.TestContext;
import io.cucumber.java.en.Then;
import java.util.List;

public class AssertionStep extends AbstractStep {

    @Then("I check if 'checkbox, radio button, dropdown names' and theirs statuses are corresponding to selected")
    public void allSelectedProductsShouldBeVisibleOnCompareProductsPage() {
        var actualLogDataNames = differentElementsPage.getSelectedItemsNames();
        List<String> expectedLogDataNames = TestContext.getInstance().getTestObject("compare_product_list");

        assertThat(actualLogDataNames)
            .as("Not all log data was displayed on Different Elements Page")
            .contains(String.valueOf(expectedLogDataNames));
    }
}

