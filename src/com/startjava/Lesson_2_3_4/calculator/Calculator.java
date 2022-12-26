package com.startjava.Lesson_2_3_4.calculator;

public class Calculator {

    public static int calculate(String expression) {
        String[] partsExpression = expression.split(" ");
        try {
            int number1 = Integer.parseInt(partsExpression[0]);
            int number2 = Integer.parseInt(partsExpression[2]);
                if (number1 < 0 || number2 < 0) {
                    System.out.println("Числа не могут быть отрицательными");
                    return 0;
            }
            return switch (partsExpression[1].charAt(0)) {
                case '+' -> Math.addExact(number1, number2);
                case '-' -> Math.subtractExact(number1, number2);
                case '*' -> Math.multiplyExact(number1, number2);
                case '%' -> Math.floorMod(number1, number2);
                case '/' -> number1 / number2;
                case '^' -> (int) Math.pow(number1, number2);
                default -> {
                    System.out.println("Введите корректный знак операции");
                    yield 0;
                }
            };
        } catch (Exception e) {
            System.out.println("Ошибка ввода данных");
            return 0;
        }
    }
}

