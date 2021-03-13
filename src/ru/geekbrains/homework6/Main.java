package ru.geekbrains.homework6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Ролант", 100, 0);
        Animal dog = new Dog("Луна", 400, 10);

        System.out.println(
                cat.toRun(90) + "\n" + cat.toSwim(5)
        );

        System.out.println(
                dog.toRun(100) + "\n" + dog.toSwim(5)
        );
    }
}