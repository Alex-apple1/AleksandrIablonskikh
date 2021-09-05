package com.epam.tc.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class CalculatorAddTest extends ParentCalculatorClass {

    @Test(dataProviderClass = DataProviders.class,
            dataProvider = "addition data")
    public void addTest(double num1, double num2, double result) {
        double actualResult = calculator.sum(num1, num2);
        assertThat(actualResult)
                .as("Addition result")
                .isEqualTo(result);
    }

}
