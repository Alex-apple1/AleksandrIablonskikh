package com.epam.tc.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;


public class CalculatorMultiplyTest {
    Calculator calculator = new Calculator();

    @Test(dataProvider = "")
    public void multiplyTest() {
        double actualResult = calculator.mult(2,2);
        assertThat(actualResult)
                .as("Multiplication results")
                .isEqualTo(4);
    }
}
