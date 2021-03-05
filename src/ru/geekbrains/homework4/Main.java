package ru.geekbrains.homework4;

public class Main {

    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
        initMap();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int a = 0; a < map.length; a++) {
            for (int b = 0; b < map.length; b++) {
                map[a][b] = DOT_EMPTY;
            }
        }
    }

}
