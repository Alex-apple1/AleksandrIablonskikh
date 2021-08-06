package com.epam.tc.hw1.addAndSubtractTestsPackage;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;


public class CalculatorSubtractTest {
    Calculator calculator = new Calculator();

    @Test(dataProvider = "")
    public void subtractTest() {
        double actualResult = calculator.sub(2,2);
        assertThat(actualResult)
                .as("Subtraction result")
                .isEqualTo(0);
    }
}
