package ru.geekbrains.homework7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(40);

        Cat[] cats = {
                new Cat("Фернандо", 15, false),
                new Cat("Ролант", 1, true),
                new Cat("Ульфрик", 13, false),
                new Cat("Небожитель", 17, false),
                new Cat("Спидвагон", 24, false),
        };

        for (Cat cat : cats) {
            System.out.println(
                    plate.getInfo() + " \n" +
                    cat.toEat(plate) + " \n"
            );
            plate.addFood(6);
        }
    }
}