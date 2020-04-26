package com.company.java8.task4;

import com.company.java8.Task;

import java.time.LocalDate;

public class Task4 implements Task {

    @Override
    public void performTask() {
        String result = new Calculator().calculate("33+22");
        System.out.println("Task 4.1 result: " + result);
        LocalDate generatedDate = new DateGenerator().toDate(2020, 4, 26);
        System.out.println("Task 4.2 result: " + generatedDate);
    }

}
