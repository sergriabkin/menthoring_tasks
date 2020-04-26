package com.company.java8.task4;

@FunctionalInterface
public interface ThreeFunction <T, U, V, W> {
    T apply(U arg1, V arg2, W arg3);
}
