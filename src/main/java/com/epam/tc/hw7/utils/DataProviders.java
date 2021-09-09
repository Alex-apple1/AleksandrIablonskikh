package com.epam.tc.hw7.utils;

import java.io.IOException;
import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "metalsAndColorsData")
    public static Object[][] metalsAndColorsDataSet() throws IOException {
        return JsonDataParser.jsonMetalsAndColorsParser("src/test/resources/JDI_ex8_metalsColorsDataSet.json");
    }
}
