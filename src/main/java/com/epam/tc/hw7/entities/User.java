package com.epam.tc.hw7.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum User {
    ROMAN("Roman", "Jdi1234", "ROMAN IOVLEV");

    private final String name;
    private final String password;
    private final String fullName;

}
