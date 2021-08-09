package com.epam.tc.hw1.addAndSubtractTestsPackage;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tat.module4.Calculator;
import com.epam.tc.hw1.DataProviders;
import com.epam.tc.hw1.ParentCalculatorClass;
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
