package ru.geekbrains.homework4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '`';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

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

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            map[x][y] = DOT_X;
        } while (!isCellValid(x,y));
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
            map[x][y] = DOT_O;
        } while (!isCellValid(x,y));
        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }


}
