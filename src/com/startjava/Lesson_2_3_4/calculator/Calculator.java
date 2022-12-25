package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        int number1 = Integer.parseInt(partsExpression[0]);
        int number2 = Integer.parseInt(partsExpression[2]);
        switch (partsExpression[1].charAt(0)) {
            case '+':
                return Math.addExact(number1, number2);
            case '-':
                return Math.subtractExact(number1, number2);
            case '*':
                return Math.multiplyExact(number1, number2);
            case '%':
                return Math.floorMod(number1, number2);
            case '/':
                return number1 / number2;
            case '^':
                return (int) Math.pow(number1, number2);
        }return 0;
    }
}

