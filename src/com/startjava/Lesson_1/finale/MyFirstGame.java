package com.startjava.Lesson_1.finale;

public class MyFirstGame {
    public static void main(String[] args) {
        int numComputer = 42;
        int numPlayer = 55;
        while (numPlayer != numComputer) {
            if (numPlayer < numComputer) {
                System.out.println("число " + numPlayer + " больше того, что загадал компьютер");
                numPlayer++;
            } else {
                System.out.println("число " + numPlayer + " меньше того, что загадал компьютер");
                numPlayer--;
            }
        }
        System.out.println("Вы победили !");
    }
}