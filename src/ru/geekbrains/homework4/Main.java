package ru.geekbrains.homework4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static char[][] map;

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symbol) {
        if (verticals(symbol)) {
            return true;
        } else {
            return diagonals(symbol);
        }
    }

    public static boolean verticals(char symbol) {
        int mapLength = map.length - 1;
        int dotsToWin = 0;
        for (int a = 0; a <= mapLength; a++) {
            for (int b = 0; b <= mapLength; b++) {
                if (map[a][b] == symbol) {
                    dotsToWin++;
                    if (dotsToWin == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    dotsToWin = 0;
                }
            }
            dotsToWin = 0;
            for (int b = 0; b <= mapLength; b++) {
                if (map[b][a] == symbol) {
                    dotsToWin++;
                    if (dotsToWin == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    dotsToWin = 0;
                }
            }
            dotsToWin = 0;
        }
        return false;
    }

    public static boolean diagonals(char symbol) {
        int mapLength = map.length - 1;
        int dotsToWin = 0;
        for (int a = 0; a <= mapLength; a++) {
            for (int b = 0; b <= mapLength; b++) {
                if (map[b][b] == symbol) {
                    dotsToWin++;
                    if (dotsToWin == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    dotsToWin = 0;
                }
            }
            dotsToWin = 0;
            for (int b = 0; b <= mapLength; b++) {
                if (map[b][mapLength - b] == symbol) {
                    dotsToWin++;
                    if (dotsToWin == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    dotsToWin = 0;
                }
            }
            dotsToWin = 0;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return true;
        return map[y][x] != DOT_EMPTY;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}