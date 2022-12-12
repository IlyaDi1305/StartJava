package com.startjava.Lesson_1.base;

public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");
        byte core = 4 ;
        short ram = 8 ; //ГБ
        int frequencyRam = 2133; //MHz
        long graphic = 6451536; //МБ
        float cpu = 1.4f; //GHz;
        double versionOc = 13.0;
        char nameLetter = 'M';
        boolean activity = true;
        System.out.println(core + " Ядра\n" + 
                ram + " ГБ оперативной памяти\n" +
                frequencyRam + " MHz частота оперативной памяти\n" +
                graphic + " МБ графической памяти\n" +
                cpu + " GHz частота процессора\n" +
                versionOc + " версия ОС\n" +
                nameLetter + " Первый символ от Mac OS\n" +
                activity + " Состояние активности системы\n");

        System.out.println("2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        int goods = pricePen + priceBook;
        float discount = 0.11f;
        float sumDiscount = goods * discount;
        float discountPrice = goods - sumDiscount;
        System.out.println("Сумма скидки = " + sumDiscount + " руб");
        System.out.println("Общая стоимость = " + discountPrice + " руб\n");

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a        \n" + 
                "   J   a a  v   v  a a     \n" + 
                "J  J  aaaaa  V V  aaaaa    \n" + 
                " JJ  a     a  V  a     a \n");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807l;
        System.out.println("первоначальное значение: " + byteMax);
        System.out.println("значение после инкремента: " + ++byteMax);
        System.out.println("значение после декремента: " + --byteMax + "\n");
        System.out.println("первоначальное значение: " + shortMax);
        System.out.println("значение после инкремента: " + ++shortMax);
        System.out.println("значение после декремента: " + --shortMax + "\n");
        System.out.println("первоначальное значение: " + intMax);
        System.out.println("значение после инкремента: " + ++intMax);
        System.out.println("значение после декремента: " + --intMax + "\n");
        System.out.println("первоначальное значение: " + longMax);
        System.out.println("значение после инкремента: " + ++longMax);
        System.out.println("значение после декремента: " + --longMax + "\n");
        
        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        int c = a;
        System.out.println("с помощью третьей переменной \n" +
                "исходные значения переменных a: " + a + "  b: " + b);
        a = b;
        b = c;
        System.out.println("новые значения переменных a: " + a + "  b: " + b);

        System.out.println("\nс помощью арифметических операций \n" +
                "исходные значения переменных a: " + a + "  b: " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("новые значения переменных a: " + a + "  b: " + b);

        System.out.println("\nс помощью побитовой операции ^ \n" +
                "исходные значения переменных a: " + a + "  b: " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("новые значения переменных a: " + a + "  b: " + b + "\n");

        System.out.println("6. Вывод символов и их кодов");
        char ch35 = '#';
        char ch38 = '&';
        char ch64 = '@';
        char ch94 = '^';
        char ch95 = '_';
        System.out.println("код: " + (int)ch35 + " символ: " + ch35);
        System.out.println("код: " + (int)ch38 + " символ: " + ch38);
        System.out.println("код: " + (int)ch64 + " символ: " + ch64);
        System.out.println("код: " + (int)ch94 + " символ: " + ch94);
        System.out.println("код: " + (int)ch95 + " символ: " + ch95 + "\n");

        System.out.println("7. Вывод количества сотен, десятков и единиц числа");
        int numN = 123;
        int numX = numN / 100;
        int numY = numN % 100 / 10;
        int numZ = numN % 10;
        System.out.println("Число " + numN + " содержит:\n" +
                (numX) + " сотен\n" + (numY) + " десятков\n"+ (numZ) + " единиц\n");
        
        System.out.println("8. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char left = '(';
        char right = ')';
        char underscore = '_';
        System.out.println("    " + slash + backSlash + "\n" + 
                "   " + slash + "  " + backSlash +  "\n" + 
                "  " + slash + underscore+left + " "+ right + backSlash + "\n" + 
                " " + slash + "      " + backSlash + "\n" + 
                slash +underscore + underscore + underscore + underscore +
                slash + backSlash + 
                underscore + underscore + backSlash + "\n");

        System.out.println("9. Вывод произведения и суммы цифр числа");
        numN = 345;
        int hundreds = numN / 100;
        int tens = numN % 100 / 10;
        int ones = numN % 10;
        int productDigits = hundreds * tens * ones;
        int sumDigits = hundreds + tens + ones;
        System.out.println("сумма числа " + numN + " = " + sumDigits + "\nих произведение = " + 
                productDigits + "\n");

        System.out.println("10. Вывод времени");
        int numSec = 86399;
        int hour = numSec / 3600;
        int min = numSec / 60 % 60;
        int sec = numSec % 60;
        System.out.println(hour + ":" + min + ":" + sec + "\n");
    }
}
