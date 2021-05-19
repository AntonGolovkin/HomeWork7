package ru.geekbrains.homework7;

public class MainApp {

    public static void main(String[] args) {
        
        Plate plate = new Plate(100);

        Cat[] cat = {new Cat("Барсик", 20),
                     new Cat("Пушок", 25),
                     new Cat("Уголек", 6),
                     new Cat("Дымок", 38),
                     new Cat("Черныш", 31)};


        for (int i = 0; i < cat.length; i++) {

            cat[i].eat(plate);

        }
        System.out.println("");
        
    }
}
