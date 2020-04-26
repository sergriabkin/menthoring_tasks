package com.company.java8;

import com.company.java8.task1.Task1;
import com.company.java8.task2.Task2;
import com.company.java8.task3.Task3;
import com.company.java8.task4.Task4;
import com.company.java8.task5.Task5;

import java.util.stream.Stream;

public class TasksRunner {
    public static void main(String[] args) {
        Stream.of(
                new Task1(),
                new Task2(),
                new Task3(),
                new Task4(),
                new Task5()
        )
                .forEach(Task::performTask);
    }
}
