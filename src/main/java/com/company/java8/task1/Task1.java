package com.company.java8.task1;

import com.company.java8.Task;

public class Task1 implements Task {

    private Runnable action1;
    private Runnable action2;

    @Override
    public void performTask(){
        initActions();
        startThreads();
    }

    private void initActions() {
        action1 = ()  -> System.out.println("greetings from thread 1");
        action2 = ()  -> System.out.println("greetings from thread 2");
    }

    private void startThreads() {
        new Thread(action1).start();
        new Thread(action2).start();
    }

}
