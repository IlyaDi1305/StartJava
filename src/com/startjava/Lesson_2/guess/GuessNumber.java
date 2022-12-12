package com.startjava.Lesson_2.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player2;
    }

    void guess() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;
        int guess;
        do {
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
            System.out.println("Ход игрока: " + currentPlayer.getName() + ":");
            System.out.print("Введите число: ");
            guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Число " + guess + " больше того, что загадал компьютер");
            } else if (guess < randomNumber) {
                System.out.println("Число " + guess + " меньше того, что загадал компьютер");
            }
        } while (guess != randomNumber);
        System.out.println("Победил игрок: " + currentPlayer.getName());
    }
}