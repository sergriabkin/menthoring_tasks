package com.company.java8.task2;

import com.company.java8.Task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task2 implements Task {

    private List<Person> personList;

    @Override
    public void performTask(){
        initPersonList();
        System.out.println("Sorted by name:");
        printSorted(byName());
        System.out.println("Sorted by age:");
        printSorted(byAge());
    }

    private void initPersonList() {
        personList = new ArrayList<>();
        personList.add(new Person("Ivan", 25));
        personList.add(new Person("Petr", 30));
        personList.add(new Person("Alex", 27));
        personList.add(new Person("Helen", 23));
        personList.add(new Person("Mark", 32));
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 26));
    }

    private void printSorted(Comparator<Person> comparator) {
        personList.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

    private Comparator<Person> byName(){
        return Comparator.comparing(Person::getName);
    }

    private Comparator<Person> byAge(){
        return Comparator.comparingInt(Person::getAge);
    }

}
