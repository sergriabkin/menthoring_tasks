package com.company.java8.task8;

import com.company.java8.Task;

public class Task8 implements Task {

    @Override
    public void performTask() {

        Tree tree = new Tree(0,
                new Tree(1, new Tree(11), new Tree(12)),
                new Tree(2, new Tree(21), new Tree(22))
        );

        System.out.println("Task 8:");
        System.out.println("Get all values in the tree: ");
        tree.getAllValues().forEach(System.out::println);
        System.out.println("Get even values: ");
        tree.getEvenValues().forEach(System.out::println);
        System.out.println("Sum of even values: ");
        tree.sumOfEvenValues().ifPresent(System.out::println);
        System.out.println("Does it contain 13?: ");
        System.out.println(tree.isContains13());

    }

}
