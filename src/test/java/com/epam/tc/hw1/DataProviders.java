package com.epam.tc.hw1;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "addition data")
    public static Object[][] additionData() {

        return new Object[][]{{1, 1, 2}, {2, 2, 4}, {-2, -3, -5}};
    }

    @DataProvider(name = "subtraction data")
    public static Object[][] subtractionData() {

        return new Object[][]{{1, 1, 0}, {2, 1, 1}, {-2, -3, 1}};
    }

    @DataProvider(name = "division data")
    public static Object[][] divisionData() {

        return new Object[][]{{1, 1, 1}, {2, 1, 2}, {-3, -2, 1.5}};
    }

    @DataProvider(name = "multiplication data")
    public static Object[][] multiplicationData() {

        return new Object[][]{{1, 1, 1}, {2, 2, 4}, {-2, -3, 6}};
    }

}
