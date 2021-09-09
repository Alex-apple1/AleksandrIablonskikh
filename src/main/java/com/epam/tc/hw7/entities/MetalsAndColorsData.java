package com.epam.tc.hw7.entities;

import com.epam.jdi.tools.DataClass;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MetalsAndColorsData extends DataClass<MetalsAndColorsData> {

    private final List<String> summary;
    private final List<String> elements;
    private final String color;
    private final String metals;
    private final List<String> vegetables;

}
