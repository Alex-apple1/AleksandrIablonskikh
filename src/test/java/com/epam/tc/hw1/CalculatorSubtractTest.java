package com.epam.tc.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class CalculatorSubtractTest extends ParentCalculatorClass {

    @Test(dataProviderClass = DataProviders.class,
            dataProvider = "subtraction data")
    public void subtractTest(double num1, double num2, double result) {
        double actualResult = calculator.sub(num1, num2);
        assertThat(actualResult)
                .as("Subtraction result")
                .isEqualTo(result);
    }
}
