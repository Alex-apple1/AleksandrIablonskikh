package com.epam.tc.hw1;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class ParentCalculatorClass {

    public Calculator calculator;

    @BeforeClass
    public void calculateGivenNumbers() {
        calculator = new Calculator();
    }

}
