package com.startjava.Lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String option;
        do {
            guessNumber.guess();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]:");
                option = scanner.next();
            } while (!"no".equals(option) && !"yes".equals(option));
        } while (!"no".equals(option));
    }
}