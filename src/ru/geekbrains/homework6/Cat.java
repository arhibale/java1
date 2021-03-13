package ru.geekbrains.homework6;

public class Cat extends Animal{
    public Cat(String name, int runDistanceLimit, int swimDistanceLimit) {
        super(name, runDistanceLimit, swimDistanceLimit);
    }

    @Override
    public String toRun(int distance) {
        if (distance > getRunDistanceLimit()) {
            return "Кот " + getName() + " не смог пробежать " + distance + " м.";
        } else {
            return "Кот " + getName() + " пробежал " + distance + " м.";
        }
    }

    @Override
    public String toSwim(int distance) {
        return "Кот " + getName() + " не полез в воду. Он не хочет плыть.";
    }
}
