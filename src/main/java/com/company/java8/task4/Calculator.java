package com.company.java8.task4;

public class Calculator {

    private ThreeFunction<String, Integer, Sign, Integer> calculator;

    public Calculator() {
        init();
    }

    private void init() {
        calculator = (number1, sign, number2) -> {
            int result = 0;

            if (sign.equals(Sign.MINUS)) {
                result = number1 - number2;
            } else if (sign.equals(Sign.PLUS)) {
                result = number1 + number2;
            }

            return "result of operation " + number1 + sign.getValue() + number2 + " is: " + result;
        };
    }

    public String calculate(String expression) {
        if (expression.matches("(\\d+)([+-])(\\d+)")) {
            String[] numbers = expression.split("[+-]");
            int number1 = Integer.parseInt(numbers[0]);
            int number2 = Integer.parseInt(numbers[1]);
            Sign sign = Sign.getSign(expression.replaceAll("[^+-]", ""));
            return calculator.apply(number1, sign, number2);
        }
        return "bad expression: " + expression;
    }


}
