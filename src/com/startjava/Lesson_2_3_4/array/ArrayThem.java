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
            len--;
            numbers[i] = numbers[len];
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
        int multiplicationNum = 1;
        for(int i = 1; i < len - 1; i++) {
            multiplicationNum *= numbers[i];
            System.out.print(i + (i == len - 2 ? " = " + multiplicationNum : " * "));
        }

        System.out.println("\n\n3. Удаление элементов массива");
        double[] numbers3 = new double[15];
        len = numbers3.length;
        for(int i = 0; i < len; i++) {
            numbers3[i] = Math.random();
        }
        System.out.println("Исходный массив:");
        printArray(numbers3, 7);
        int countZeroCell = 0;
        double valueMiddleCell = numbers3[len / 2];
        System.out.println(valueMiddleCell);
        for(int i = 0; i < len; i++) {
            if(numbers3[i] > valueMiddleCell) {
                numbers3[i] = 0;
                countZeroCell++;
            }
        }
        System.out.println("Измененный массив:");
        printArray(numbers3, 7);
        System.out.println("Количество обнуленных ячеек: " + countZeroCell);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] arrLetters = new char[26];
        len = arrLetters.length;
        for(int i = 0; i < len; i++) {
            arrLetters[i] = (char) (i + 65);
        }
        for(int i = 0; i < len; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(arrLetters[len - 1 - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        int[] numbers4 = new int[30];
        len = numbers4.length;
        for(int i = 0; i < len; i++) {
            boolean uniqueness = false;
            do {
                for(int j = 0; j < i; j++) {
                    if (numbers4[i] == numbers4[j]) {
                        numbers4[i] = 60 + (int) (Math.random() * 40);
                        uniqueness = true;
                        break;
                    }
                    uniqueness = false;
                }
            } while (uniqueness);
        }
        for(int i = numbers4.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(numbers4[j] > numbers4[j + 1]) {
                    int tmp = numbers4[j];
                    numbers4[j] = numbers4[j + 1];
                    numbers4[j + 1] = tmp;
                }
            }
        }
        printArray(numbers4, 10);

        System.out.println("\n6. Сдвиг элементов массива");
        String[] arrString = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        len = arrString.length;
        int counter = 0;
        for(String string : arrString) {
            if(!string.isBlank()) {
                counter++;
            }
        }
        String[] changedArrString = new String[counter];
        int insert = 0;
        int i = 0;
        while(i < len) {
            counter = 1;
            if(!arrString[i].isBlank()) {
                int j = i + 1;
                while(!arrString[j].isBlank()) {
                    counter++;
                    j++;
                }
                System.arraycopy(arrString, i, changedArrString, insert, counter);
                insert += counter;
            }
            i += counter;
        }
        printArray(arrString);
        printArray(changedArrString);
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

    private static void printArray(double[] numbers, int returnNum) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.printf("%.3f" + " ", numbers[i]);
            if(i == returnNum) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printArray(int[] numbers, int returnNum) {
        for(int i = 0; i < numbers.length; i++) {
            if((i % returnNum != 0) && (i != 0)) {
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

