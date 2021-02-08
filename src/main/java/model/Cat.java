package model;

public class Cat extends Animal {


    public Cat() {
    }

    @Override
    public String doNoise() {
        return "Мяу";
    }

    public String catHountsMouse() {
        return "Cat catches mouse!";
    }
}
