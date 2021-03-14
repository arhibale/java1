package ru.geekbrains.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String toEat(Plate plate) {
        if (!satiety) {
            if (plate.decreaseFood(appetite)) {
                satiety = true;
                return "Кот " + name + " съел " + appetite + " еды.";
            } else {
                return "Коту " + name + " недостаточно еды в миске. Он отворачиваеться и уходит ничего не съев.";
            }
        } else {
            return "Кот " + name + " сыт и не хочет есть.";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}