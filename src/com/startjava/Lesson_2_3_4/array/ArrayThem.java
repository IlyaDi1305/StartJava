package com.startjava.Lesson_2_3_4.array;

public class ArrayThem {
    
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] numbers = {1, 7, 4, 5, 3, 2, 6};
        int len = numbers.length;
        System.out.println("Исходный массив:");
        printArray(numbers);
        for(int i = 0; i <= len / 2; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[--len];
            numbers[len] = tmp;
        }
        System.out.println("Массив после модификации:");
        printArray(numbers);

        System.out.println("\n2. Вывод произведения элементов массива");
        numbers = new int[10];
        len = numbers.length;
        for(int i = 0; i < len; i++) {
            numbers[i] = i;
        }
        int multiplicationNumbers = 1;
        for(int i = 1; i < len - 1; i++) {
            multiplicationNumbers *= numbers[i];
            System.out.print(i + (i < len - 2 ? " * " : " = " + multiplicationNumbers));
        }
        System.out.println("\n" + numbers[0] + numbers[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] numbers3 = new double[15];
        len = numbers3.length;
        for(int i = 0; i < len; i++) {
            numbers3[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printArray(numbers3, 7);
        int numberZeroedCells = 0;
        double valueMiddleCell = numbers3[len / 2];
        System.out.println("Значение из средней ячейки массива: " + valueMiddleCell);
        for(int i = 0; i < len; i++) {
            if(numbers3[i] > valueMiddleCell) {
                numbers3[i] = 0;
                numberZeroedCells++;
            }
        }
        System.out.println("Измененный массив:");
        printArray(numbers3, 7);
        System.out.println("Количество обнуленных ячеек: " + numberZeroedCells);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] abc = new char[26];
        len = abc.length;
        for(int i = 0; i < len; i++) {
            abc[i] = (char) ('A' + i);
        }
        for(int i = 0; i < len; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(abc[len - 1 - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] uniqueNumbers = new int[30];
        len = uniqueNumbers.length;
        for(int i = 0; i < len; i++) {
            boolean unique = false;
            do {
                for(int j = 0; j < i; j++) {
                    if (uniqueNumbers[i] == uniqueNumbers[j]) {
                        uniqueNumbers[i] = 60 + (int) (Math.random() * 40);
                        unique = true;
                        break;
                    }
                    unique = false;
                }
            } while (unique);
        }
        for(int i = uniqueNumbers.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(uniqueNumbers[j] > uniqueNumbers[j + 1]) {
                    int tmp = uniqueNumbers[j];
                    uniqueNumbers[j] = uniqueNumbers[j + 1];
                    uniqueNumbers[j + 1] = tmp;
                }
            }
        }
        printArray(uniqueNumbers, 10);

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] srcArray = {" ", "AA", "", "BBB", "CC", "D", " ", "E", "FF", "G", ""};
        int length = 0;
        for (String s : srcArray) {
            if (!s.isBlank()) {
                length++;
            }
        }
        String[] destArray = new String[length];
        length = srcArray.length;
        for (int i = 0, j = 0; i < length; i++) {
            int stringNumber = 0;
            while ((!srcArray[i].isBlank()) && (i < length - 1)) {
                stringNumber++;
                i++;
            }
            System.arraycopy(srcArray, i - stringNumber, destArray, j, stringNumber);
            j += stringNumber;
        }
        printArray(srcArray);
        printArray(destArray);
    }

    private static void printArray(int[] numbers) {
        for(int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void printArray(double[] numbers) {
        for(double number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void printArray(double[] numbers, int returnNumber) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.printf("%.3f" + " ", numbers[i]);
            if(i == returnNumber) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printArray(int[] numbers, int returnNumber) {
        for(int i = 0; i < numbers.length; i++) {
            if((i % returnNumber != 0) && (i != 0)) {
                System.out.print(numbers[i] + " " );
            } else {
                System.out.println();
            }
        }
    }

    private static void printArray(String[] arrString) {
        for(String string : arrString) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}

