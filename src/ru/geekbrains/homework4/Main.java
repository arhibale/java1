package ru.geekbrains.homework4;

public class Main {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '`';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
        printMap();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int a = 0; a < SIZE; a++) {
            for (int b = 0; b < SIZE; b++) {
                map[a][b] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int a = 0; a <= SIZE; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a = 0; a < SIZE; a++) {
            System.out.print((a + 1) + " ");
            for (int b = 0; b < SIZE; b++) {
                System.out.print(map[a][b] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
