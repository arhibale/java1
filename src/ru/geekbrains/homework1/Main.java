package ru.geekbrains.homework1;

public class Main {
    public static void main(String[] args) {
        // 1 Задание
        byte a = 127;
        short b = 1032;
        int c = 10103;
        long d = 10203010230L;
        float e = 1.42f;
        double f = 12.3;
        char g = '#';
        boolean n = true;

        // 2 Задание
        System.out.println(toCalculate(3.2f,12.3f,44.2f,2.2f));

        // 4 Задание
        System.out.println(sumFrom10to20(10,11));

        // 5 Задание
        positiveOrNegative(-4);

        // 6 Задание
        System.out.println(negativeNumber(0));

        // 7 Задание
        yourName("Artem");

        // 8 Задание
        leapYear(2023);
        leapYear2(2023);
    }

    public static float toCalculate(float numberOne, float numberTwo, float numberThree, float numberFour) {
        return numberOne * (numberTwo +(numberThree / numberFour));
    }

    public static boolean sumFrom10to20(int numberOne, int numberTwo) {
        int sum = numberOne + numberTwo;
        return sum >= 10 && sum <= 20;
    }

    public static void positiveOrNegative(int number) {
        if(number >= 0) {
            System.out.println("The number " + number + " is positive!");
        } else {
            System.out.println("The number " + number + " is negative!");
        }
    }

    public static boolean negativeNumber(int number) {
        return number < 0;
    }

    public static void yourName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void leapYear(int year) {
        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " is a leap year!");
        } else if(year % 4 == 0 && year % 100 == 0) {
            System.out.println(year + " is not a leap year!");
        } else if(year % 4 == 0) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }

    //Не все правильно показывает
    public static void leapYear2(int year) {
        if((year % 4 == 0 && year % 400 == 0) || year % 100 != 0) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }
}