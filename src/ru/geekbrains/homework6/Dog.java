package ru.geekbrains.homework6;

public class Dog extends Animal{
    public Dog(String name, int runDistanceLimit, int swimDistanceLimit) {
        super(name, runDistanceLimit, swimDistanceLimit);
    }

    @Override
    public String toRun(int distance) {
        if (distance > getRunDistanceLimit()) {
            return "Собака " + getName() + " не смог пробежать " + distance + " м.";
        } else {
            return "Собака " + getName() + " пробежал " + distance + " м.";
        }
    }

    @Override
    public String toSwim(int distance) {
        if (distance > getSwimDistanceLimit()) {
            return "Собака " + getName() + " не смог проплыть " + distance + " м.";
        } else {
            return "Собака " + getName() + " проплыл " + distance + " м.";
        }
    }
}
