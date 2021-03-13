package ru.geekbrains.homework6;

public abstract class Animal {
    private final String name;
    private final int runDistanceLimit;
    private final int swimDistanceLimit;

    public Animal(String name, int runDistanceLimit, int swimDistanceLimit) {
        this.name = name;
        this.runDistanceLimit = runDistanceLimit;
        this.swimDistanceLimit = swimDistanceLimit;
    }

    public abstract String toRun(int distance);

    public abstract String toSwim(int distance);

    public String getName() {
        return name;
    }

    public int getRunDistanceLimit() {
        return runDistanceLimit;
    }

    public int getSwimDistanceLimit() {
        return swimDistanceLimit;
    }
}