package ru.geekbrains.homework3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        //guessTheNumber();
        guessTheWord();

        scanner.close();
    }

    private static void guessTheNumber() {
        do {
            int attempt = 3;
            int randomNumber = random.nextInt(10);
            while (true) {
                System.out.println("Угадайте число от 0 до 9. Количество попыток: " + attempt + " /// " + randomNumber);
                int userNumber = scanner.nextInt();
                if (userNumber == randomNumber) {
                    System.out.println("Вы угадали! Загаданное число: " + randomNumber);
                    break;
                } else if (attempt == 1) {
                    System.out.println("Вы проиграли! Загаданное число: " + randomNumber);
                    break;
                } else if (userNumber > randomNumber) {
                    attempt--;
                    System.out.println("Вы не угадали! Загаданное число меньше!");
                } else {
                    attempt--;
                    System.out.println("Вы не угадали! Загаданное число больше.");
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        } while (scanner.nextInt() == 1);
    }

    private static void guessTheWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        do {
            String theHiddenWord = words[random.nextInt(words.length)];
            while (true) {
                System.out.println("\nУгадайте загаданное слово! Тема: еда. /// " + theHiddenWord);
                String userWord = scanner.next();
                if (userWord.equals(theHiddenWord)) {
                    System.out.println("\nВы угадали! Загаданное слово: " + theHiddenWord);
                    break;
                } else if (userWord.equals("exit")) {
                    break;
                } else {
                    System.out.println("\nВы не угадали! Для выхода введите: exit");
                    printWord(userWord, theHiddenWord);
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        } while (scanner.nextInt() == 1);
    }

    private static void printWord(String userWord, String theHiddenWord) {
        String[] arrayWord = new String[15];
        for (int a = 0; a < theHiddenWord.length(); a++) {
            if (a >= userWord.length()) {
                break;
            }
            if (userWord.charAt(a) == theHiddenWord.charAt(a)) {
                arrayWord[a] = String.valueOf(theHiddenWord.charAt(a));
            }
        }
        for (int a = 0; a < arrayWord.length; a++) {
            if (arrayWord[a] == null) {
                arrayWord[a] = "#";
            }
        }
        for (String s : arrayWord) {
            System.out.print(s + " ");
        }
    }
}