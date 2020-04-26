package com.company.java8.task3;

import com.company.java8.Task;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task3 implements Task {

    @Override
    public void performTask() {
        supplierTest();
        consumerTest();
        predicateTest();
        functionTest();
        combinatorTest1();
        combinatorTest2();
        combinatorDefaultTest();
        combinatorStaticTest();
    }

    private void combinatorTest1() {
        System.out.println("Own functional interface test using lambda:");
        Combinator<String, Integer, Boolean> combinator = (number, flag) -> number + " is " + (flag ? "good" : "bad");
        System.out.println(combinator.combine(3, true));
        System.out.println(combinator.combine(0, false));
    }

    private void combinatorTest2() {
        System.out.println("Own functional interface test using anonymous classes:");
        Combinator<Boolean, Integer, String> combinator = new Combinator<>() {
            @Override
            public Boolean combine(Integer number, String text) {
                return text.equals(number.toString());
            }
        };

        System.out.println((combinator.combine(100, "100") ? "passed" : "failed"));
    }

    private void combinatorDefaultTest() {
        System.out.println("Own functional interface default method test:");
        Combinator<String, String, String> combinator = (s1, s2) -> s1 + " " + s2;
        combinator.defaultPrint(combinator.combine("test", "passed"));
    }

    private void combinatorStaticTest() {
        System.out.println("Own functional interface static method test:");
        Combinator.staticPrint("test passed");
    }

    private void functionTest() {
        Function<String, String> function = String::trim;
        System.out.println(function.apply("        " + "function test"));
    }

    private void predicateTest() {
        Predicate<Integer> predicate = arg -> arg > 0;
        if (predicate.test(1)) {
            System.out.println("predicate test");
        }
    }

    private void consumerTest() {
        Consumer<String> consumer = System.out::println;
        consumer.accept("consumer test");
    }

    private void supplierTest() {
        Supplier<String> supplier = () -> "supplier test";
        System.out.println(supplier.get());
    }

}
