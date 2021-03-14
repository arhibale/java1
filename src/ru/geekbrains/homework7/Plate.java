package ru.geekbrains.homework7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int i) {
        if (food >= i) {
            food -= i;
            return true;
        }
        return false;
    }

    public void addFood(int i) {
        if (i >= 0) {
            food += i;
        }
    }

    public String getInfo() {
        return "В миске " + food + " еды.";
    }
}