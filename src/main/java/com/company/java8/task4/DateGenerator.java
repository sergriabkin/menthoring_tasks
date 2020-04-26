package com.company.java8.task4;

import java.time.LocalDate;

public class DateGenerator {

    private ThreeFunction<LocalDate, Integer, Integer, Integer> generator;

    public DateGenerator() {
        generator = LocalDate::of;
    }

    public LocalDate toDate(int year, int month, int day) {
        return generator.apply(year, month, day);
    }

}
