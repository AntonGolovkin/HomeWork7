package ru.geekbrains.homework7;

public class Cat {
    private String name;
    private int appetit;
    private boolean hungry;


    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public int getAppetit() {
        return appetit;
    }

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        this.hungry = true;
    }
    public void eat(Plate plate){
        if (plate.getFood() >= appetit) {
            plate.setFood(plate.getFood() - appetit);
            hungry = false;
            System.out.println(name + " Покушал!");
        }else {
            hungry = true;
            System.out.println(name + " Не смог покушать еда закончилась!");
        }
    }

    public void info(){
        System.out.println(name + " " + hungry);
    }

}
