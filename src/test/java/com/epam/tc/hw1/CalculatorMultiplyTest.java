package com.epam.tc.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class CalculatorMultiplyTest extends ParentCalculatorClass {

    @Test(dataProviderClass = DataProviders.class,
            dataProvider = "multiplication data")
    public void multiplyTest(double num1, double num2, double result) {
        double actualResult = calculator.mult(num1, num2);
        assertThat(actualResult)
                .as("Multiplication result")
                .isEqualTo(result);
    }

}
