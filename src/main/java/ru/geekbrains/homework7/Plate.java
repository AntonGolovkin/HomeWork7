package ru.geekbrains.homework7;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food > 0) {
            this.food = food;
        }
    }

    public Plate(int food) {
        this.food = food;
    }
}
