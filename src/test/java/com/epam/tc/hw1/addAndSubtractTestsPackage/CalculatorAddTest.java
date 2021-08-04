package com.epam.tc.hw1.addAndSubtractTestsPackage;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;


public class CalculatorAddTest {
    Calculator calculator = new Calculator();

    @Test(dataProvider = "")
    public void addTest() {
        double actualResult = calculator.sum(2,2);
        assertThat(actualResult)
                .as("Addition result")
                .isEqualTo(4);
    }
}
