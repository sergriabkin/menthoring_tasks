package com.company.java8;

import com.company.java8.task1.Task1;
import com.company.java8.task2.Task2;

import java.util.List;

public class TasksRunner {
    public static void main(String[] args) {
        List.of(
                new Task1(),
                new Task2()
        )
                .forEach(Task::performTask);
    }
}
