package com.company.java8.task7;

import com.company.java8.Task;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task7 implements Task {

    @Override
    public void performTask() {
        IntSummaryStatistics summaryStatistics = Stream.iterate(0, i -> i + 10)
                .limit(1_000_000)
                .collect(Collectors.summarizingInt(Integer::intValue));
        long sum = summaryStatistics.getSum();
        long count = summaryStatistics.getCount();
        double average = summaryStatistics.getAverage();
        int min = summaryStatistics.getMin();
        int max = summaryStatistics.getMax();

        System.out.println("Task 7: ");
        System.out.println(String.format("sum: %d, count: %d, average: %f, min: %d, max: %d", sum, count, average, min, max));
    }

}
