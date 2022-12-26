package com.startjava.Lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] agre) {
        Scanner scan = new Scanner(System.in);
        String userResponse = "да";
        while (!userResponse.equals("нет")) {
            if (userResponse.equals("да")) {
                System.out.print("Введите математическое выражение: ");
                System.out.println(Calculator.calculate(scan.nextLine()));
            }
            System.out.print("Хотите продолжить вычисления? [да/нет]: ");
            userResponse = scan.nextLine();
        }
    }
}