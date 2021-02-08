package model;

public class Dog extends Animal {

    public Dog() {
    }

    @Override
    public String doNoise() {
        return "Гав";
    }

    public String dogHuntsFoxes () {
        return "Dog hunts Foxes!";
    }
}
