package com.company.java8;

import com.company.java8.task1.Task1;
import com.company.java8.task2.Task2;
import com.company.java8.task3.Task3;
import com.company.java8.task4.Task4;
import com.company.java8.task5.Task5;
import com.company.java8.task6.Task6;
import com.company.java8.task7.Task7;
import com.company.java8.task8.Task8;

import java.util.stream.Stream;

public class TasksRunner {
    public static void main(String[] args) {
        Stream.of(
                new Task1(),
                new Task2(),
                new Task3(),
                new Task4(),
                new Task5(),
                new Task6(),
                new Task7(),
                new Task8()
        )
                .forEach(Task::performTask);
    }
}
