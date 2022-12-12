package com.startjava.Lesson_1.base;

public class IfElseStatement {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 43;
        if (age > 20) {
            System.out.println("Вам больше 20");
        } else {
            System.out.println("Вам меньше 20");
        }
        String gender = "man";
        if (gender != "man") {
            System.out.println("Вы женщина!");
        } else {
            System.out.println("Вы мужчина!");
        }
        float height = 1.80f;
        if (height < 1.88f) {
            System.out.println("Вам потребуется помощь, чтобы достать до верхнего ящика");
        } else {
            System.out.println("Вы сможете достать до верхнего ящика");
        }
        char capitalLetter = "Ilia".charAt(0);
        if (capitalLetter == 'M') {
            System.out.println("Первая буква вашего имени  \"М\" вы молодец!\n");
        } else if (capitalLetter == 'I') {
            System.out.println("Первая буква вашего имени \"I\"\n");
        } else {
            System.out.println("\"M\" и \"I\" Не первые буквы вашего имени\n");
        }

        System.out.println("2. Поиск max и min числа");
        int num1 = 322;
        int num2 = 575;
        if (num1 < num2) {
            System.out.println("max: " + num2 + "\nmin: " + num1);
        } else if (num1 > num2) {
            System.out.println("max: " + num1 + "\nmin: " + num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }

        System.out.println("\n3. Работа с числом");
        num1 = -15;
        System.out.println("Исходное число: " + num1);
        if (num1 != 0) {
            if (num1 % 2 == 0) {
                System.out.println("четное");
            } else {
                System.out.println("нечетное");
            }
            if (num1 > 0) {
                System.out.println("положительное\n");
            } else {
                System.out.println("отрицательное\n");
            }
        }

        System.out.println("4. Поиск одинаковых цифр в числах");
        num1 = 321;
        num2 = 321;
        int hundredsNum1 = num1 / 100;
        int tensNum1 = num1 % 100 / 10;
        int onesNum1 = num1 % 10;
        int hundredsNum2 = num2 / 100;
        int tensNum2 = num2 % 100 / 10;
        int onesNum2 = num2 % 10;
        if (hundredsNum1 == hundredsNum2) {
            System.out.println("В сотых одинаковая цифра: " + hundredsNum1);
        } else {
            System.out.println("В сотых нет одинаковых цифр");
        }
        if (tensNum1 == tensNum2) {
            System.out.println("В десятых одинаковая цифра: " + tensNum1);
        } else {
            System.out.println("В десятых нет одинаковых цифр");
        }
        if (onesNum1 == onesNum2) {
            System.out.println("В единицах одинаковая цифра: " + onesNum1 + "\n");
        } else {
            System.out.println("В единицах нет одинаковых цифр\n");
        }

        System.out.println("5. Определение буквы, числа или символа по их коду");
        char someSymbol = '\u0057'; //W
        if (someSymbol >= 'a' && someSymbol <= 'z') {
            System.out.println(someSymbol + " маленькая буква");
        } else if (someSymbol >= 'A' && someSymbol <= 'Z') {
            System.out.println(someSymbol + " большая буква");
        } else if (someSymbol >= '0' && someSymbol <= '9') {
            System.out.println(someSymbol + " число");
        } else {
            System.out.println(someSymbol + " не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком");
        int deposit = 100000;
        float percent = 0.05f;
        if (deposit < 100000) {
        } else if (deposit >= 100000 && deposit <= 300000) {
            percent = deposit * 0.07f;
        } else if (deposit > 300000) {
            percent = deposit * 0.1f;
        }
        System.out.println(deposit + " руб - сумма вклада");
        System.out.println(percent + " руб - начисленный %");
        System.out.println(deposit + percent + " руб - итоговая сумма с %\n");

        System.out.println("7. Определение оценки по предметам");
        int historyPercent = 59;
        int programmingPercent = 91;
        int markHistory = 2;
        int markProgramming = 2;
        if (historyPercent <= 60) {
        } else if (historyPercent > 60 && historyPercent <= 73) {
            markHistory = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            markHistory = 4;
        } else if (historyPercent > 91) {
            markHistory = 5;
        }
        System.out.println(markHistory + " - история");
        if (programmingPercent <= 60) {
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            markProgramming = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            markProgramming = 4;
        } else if (programmingPercent > 91) {
            markProgramming = 5;
        }
        System.out.println(markProgramming + " - программирование");
        int averageMark = (markHistory + markProgramming) / 2;
        System.out.println("средний балл оценок по предметам " + averageMark);
        int averagePercent = (programmingPercent + historyPercent) / 2;
        System.out.println("средний % по предметам - " + averagePercent + "%\n");

        System.out.println("8. Расчет прибыли");
        int rent = 5000;
        int revenue = 13000;
        int costPrice = 9000;
        int profitYear = (revenue - costPrice - rent) * 12;
        if (profitYear > 0) {
            System.out.println("прибыль за год: +" + profitYear + " руб\n");
        } else {
            System.out.println("прибыль за год: " + profitYear + " руб\n");
        }

        System.out.println("9. Подсчет количества банкнот");
        int takeOff = 567;
        int hundredsTakeOff = (takeOff / 100) * 100;
        int tensTakeOff = (takeOff % 100 / 10) * 10;
        int onesTakeOff = takeOff % 10;
        int amount100 = 10;
        int amount10 = 5;
        int amount1 = 50;
        int nom100 = 100;
        int nom10 = 10;
        int nom1 = 1;
        int sum100 = amount100 * nom100;
        int sum10 = amount10 * nom10;
        int sum1 = amount1 * nom1;
        if (hundredsTakeOff <= sum100 && takeOff % 100 == 0 && takeOff <= 999) {
            System.out.println("Выдать - " + hundredsTakeOff / 100 + " купюр по " + nom100 + " USD");
        } else if (hundredsTakeOff <= sum100 && tensTakeOff <= sum10 && onesTakeOff <= sum1 && takeOff <= 999) {
            if (hundredsTakeOff != 0) {
                System.out.println("Выдать - " + hundredsTakeOff / 100 + " купюр по " + nom100 + " USD");
            }
            if (tensTakeOff != 0) {
                System.out.println("Выдать - " + tensTakeOff / 10 + " купюр по " + nom10 + " USD");
            }
            if (onesTakeOff != 0) {
                System.out.println("Выдать - " + onesTakeOff + " купюр по " + nom1 + " USD");
            }
            System.out.println("Выдаваемая сумма - " + takeOff + " USD");
        } else if (takeOff <= 999) {
            int exchange = tensTakeOff - sum10;
            int onesSum = exchange + onesTakeOff;
            int tenSum = (tensTakeOff / 10) - (onesSum / 10);
            System.out.println("Выдать - " + hundredsTakeOff / 100 + " купюр по " + nom100 + " USD");
            System.out.println("Выдать - " + tenSum + " купюр по " + nom10 + " USD");
            System.out.println("Выдать - " + onesSum + " купюр по " + nom1 + " USD");
            System.out.println("Выдаваемая сумма - " + takeOff +" USD");
        }
    }
}


