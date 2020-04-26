package com.company.java8.task3;

@FunctionalInterface
public interface Combinator<T, U, V> {

    static void staticPrint(String message){
        System.out.println(message);
    };

    default void defaultPrint(String message){
        System.out.println(message);
    };

    T combine(U arg1, V arg2);
}
