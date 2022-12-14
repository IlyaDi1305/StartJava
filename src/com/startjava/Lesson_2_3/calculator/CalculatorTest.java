package com.startjava.Lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        String option;
        do {
            System.out.print("Введите первое число: ");
            calculator.setA(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scan.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(scan.nextInt());
            calculator.calculate();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                option = scan.next();
            } while(!"no".equals(option) && !"yes".equals(option));
        } while(!"no".equals(option));
    }
}