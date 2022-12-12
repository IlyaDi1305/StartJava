package com.startjava.Lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int sumEvenNumber = 0;
        int sumOddNumber = 0;
        int counter = -10;
        do {
            if (counter % 2 == 0) {
                sumEvenNumber += counter;
            } else {
                sumOddNumber += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEvenNumber +
                ", а нечетных = " + sumOddNumber);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = -1;
        int num2 = 5;
        int num3 = 10;
        int min = num1;
        int max = num2;
        if (max < num1) {
            max = num1;
        }
        if (max < num3) {
            max = num3;
        }
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        int i = 0;
        for (i = min++; min < max; min++) {
            System.out.printf("%d ", min);
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        num1 = 1234;
        int sumDigits = 0;
        while (num1 > 0) {
            int digit = num1 % 10;
            System.out.print(digit);
            sumDigits += digit;
            num1 /= 10;
        }
        System.out.println("\n" + sumDigits);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        for (i = 1; i < 24; i += 2) {
            for (int j = 0; j < 5; j++) {
                if (i < 24) {
                    System.out.printf("%3d", i);
                } else {
                    System.out.printf("%3d", 0);
                }
                i += 2;
            }
            System.out.println();
            i -= 2;
        }

        System.out.println("\n5.Проверка количества двоек на четность");
        num1 = 3242592;
        int numberTwos = 0;
        System.out.print("число " + num1);
        while (num1 > 0) {
            int digit = num1 % 10;
            if (digit == 2) {
                numberTwos++;
            }
            num1 /= 10;
        }
        String even = " нечетное ";
        if (numberTwos / 2 == 0) {
            even = " четное ";
        }
        System.out.println(" содержит" + even + "количество двоек");

        System.out.println("\n6. Отображение фигур в консоли");
        for (int lines = 1; lines <= 5; lines++) {
            for (int width = 1; width <= 10; width++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        int lines = 5;
        while (lines >= 1) {
            int width = 1;
            while (width <= lines) {
                System.out.print("#");
                width++;
            }
            System.out.println();
            lines--;
        }
        System.out.println();

        lines = 5;
        counter = 2;
        do {
            int width = 1;
            do {
                System.out.print("$");
                width++;
            } while (width < counter);
            if (lines > 3) {
                counter++;
            } else {
                counter--;
            }
            System.out.println();
            lines--;
        } while (lines > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%5s%8s", "Dec", "Char");
        System.out.println();
        for (i = 1; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%5d%8c%n", i, i);
            }
        }
        for (i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%5d%8c%n", i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        num1 = 1234321;
        int reversNum = 0;
        int cuttingNum = num1;
        while (cuttingNum > 0) {
            int digit = cuttingNum % 10;
            reversNum = reversNum * 10 + digit;
            cuttingNum /= 10;
        }
        if (reversNum == num1) {
            System.out.println("число " + num1 + " является палиндромом");
        } else {
            System.out.println("число " + num1 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        num1 = 224512;
        cuttingNum = num1;
        int sumFirstPart = 0;
        int sumSecondPart = 0;
        for (i = 6; i > 0; i--) {
            int digit = cuttingNum % 10;
            cuttingNum /= 10;
            if (i > 3) {
                sumFirstPart += digit;
            }
            if (i <= 3) {
                sumSecondPart += digit;
            }
        }
        System.out.println("Сумма цифр " + num1 / 1000 + " = " + sumFirstPart);
        System.out.println("Сумма цифр " + num1 % 1000 + " = " + sumSecondPart);
        if (sumFirstPart == sumSecondPart) {
            System.out.println("Число счастливое !");
        } else {
            System.out.println("Число не счастливое");
        }

        System.out.println("\n 10. Вывод таблицы умножения Пифагора");
        int j;
        System.out.print("   |");
        for (i = 2; i < 10; i++)
            System.out.printf("%2d ", i);
        System.out.print("\n---|-------");
        System.out.print("----------------\n");
        for (i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for (j = 2; j < 10; j++)
                System.out.printf("%2d ", i * j);
            System.out.println();
        }
    }
}