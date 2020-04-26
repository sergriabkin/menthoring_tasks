package com.company.java8.task4;

import java.util.stream.Stream;

public enum Sign {

    PLUS("+"), MINUS("-");

    private String value;

    Sign(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Sign getSign(String valueOfSign) {
        return Stream.of(values()).filter(s -> s.getValue().equals(valueOfSign)).findFirst().orElseThrow();
    }
}
