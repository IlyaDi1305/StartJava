package com.startjava.Lesson_1.finale;

public class Calculator {
    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        char sign = '^';
        int result = 1;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            for (int i = b; i > 0; i--) {
                result  *= a;
            }
        } else if (sign == '%') {
            result = a % b;
        } 
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}
