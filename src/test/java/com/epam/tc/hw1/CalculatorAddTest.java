package com.epam.tc.hw1;

import static org.assertj.core.api.Assertions.assertThat;

import com.epam.tat.module4.Calculator;
import com.epam.tc.hw1.DataProviders;
import com.epam.tc.hw1.ParentCalculatorClass;
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
