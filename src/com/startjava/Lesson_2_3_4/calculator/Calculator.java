package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {
    private int number1;
    private int number2;
    private char mathSign;

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public char getMathSign() {
        return mathSign;
    }

    public void setExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        number1 = Integer.parseInt(partsExpression[0]);
        mathSign = partsExpression[1].charAt(0);
        number2 = Integer.parseInt(partsExpression[2]);
    }

    public double calculate() {
        switch (mathSign) {
            case '+':
                return Math.addExact(number1, number2);
            case '-':
                return Math.subtractExact(number1, number2);
            case '*':
                return Math.multiplyExact(number1, number2);
            case '%':
                return Math.floorMod(number1, number2);
            case '/':
                return (double) number1 / number2;
            case '^':
                return Math.pow(number1, number2);
        }
        return 0;
    }
}

