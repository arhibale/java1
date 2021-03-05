package ru.geekbrains.homework2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array01 = {1, 0, 1, 1, 0, 0, 1, 0};
        invertArray(array01);

        System.out.println("------------------------");

        int[] emptyArray = new int[8];
        fillingInTheArray(emptyArray);

        System.out.println("------------------------");

        int[] arrayWithNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        lessThanSix(arrayWithNumbers);

        System.out.println("------------------------");

        int[][] diagonalArray = new int[10][10];
        diagonals(diagonalArray);

        System.out.println("------------------------");

        int[] anArbitraryArray = {1, 22, 412, 124, 4, 42, 21, 2};
        theLargestNumber(anArbitraryArray);

        System.out.println("------------------------");

        int[] anotherArbitraryArray = {1, 1, 1, 1, 3, 1};
        System.out.println(theSumOfTheLeftAndRight(anotherArbitraryArray));

        System.out.println("------------------------");
        //Как бы я не старался, самостоятельно 7-е задание я осилить не смог.
    }

    public static void invertArray(int[] array) {
        System.out.println(Arrays.toString(array));
        for(int a = 0; a < array.length; a++) {
            if(array[a] == 0) {
                array[a] = 1;
            } else {
                array[a] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillingInTheArray(int[] array) {
        for(int a = 0; a < array.length; a++) {
            array[a] = a * 3;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void lessThanSix(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int a = 0; a < array.length; a++) {
            if (array[a] < 6) {
                array[a] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void diagonals(int[][] array) {
        int arrayLength = array.length - 1;
        for(int a = 0; a <= arrayLength; a++) {
            for(int b = 0; b <= arrayLength; b++) {
                array[a][a] = 1;
                array[a][arrayLength - a] = 1;
                System.out.print(array[a][b] + " ");
            }
            System.out.println();
        }
    }

    public static void theLargestNumber(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
    }

    public static boolean theSumOfTheLeftAndRight(int[] array) {
        //Я не понял что имелось в виду под правой и левой стороной массива. Где граница?
        //И пошёл по своему, вводя границу между правой и левой стороной, которую можно менять.
        int border = array.length - 2;
        int sumLeft = 0;
        int sumRight = 0;
        for(int a = 0; a < border; a++) {
            sumLeft = sumLeft + array[a];
        }
        for(int a = border; a < array.length; a++) {
            sumRight = sumRight + array[a];
        }
        return sumLeft == sumRight;
    }
}