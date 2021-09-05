package com.epam.tc.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class CalculatorDivideTest extends ParentCalculatorClass {

    @Test(dataProviderClass = DataProviders.class,
            dataProvider = "division data")
    public void divideTest(double num1, double num2, double result) {
        double actualResult = calculator.div(num1, num2);
        assertThat(actualResult)
                .as("Division result")
                .isEqualTo(result);
    }
}
