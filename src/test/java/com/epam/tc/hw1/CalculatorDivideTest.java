package com.epam.tc.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.Test;

public class CalculatorDivideTest {
    Calculator calculator = new Calculator();

    @Test(dataProvider = "")
    public void divideTest() {
        double actualResult = calculator.div(2,2);
        assertThat(actualResult)
                .as("Dividing result")
                .isEqualTo(1);
    }
}
