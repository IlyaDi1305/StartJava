package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] agre) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String userResponse = "да";
        while (!userResponse.equals("нет")) {
            if (userResponse.equals("да")) {
                System.out.print("Введите математическое выражение: ");
                String enteredExpression = scan.nextLine();
                calc.setExpression(enteredExpression);
                System.out.println(enteredExpression + " = " + calc.calculate());
            }
            System.out.print("Хотите продолжить вычисления? [да/нет]: ");
            userResponse = scan.nextLine();
        }
    }
}