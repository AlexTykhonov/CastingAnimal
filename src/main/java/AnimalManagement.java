import model.Animal;
import model.Cat;
import model.Dog;

import javax.sound.midi.Soundbank;


// 2) создай тестовый класс, в котором определи всех представителей класса Animal
// 3) создай метод, который будет принимать представителя Animal и
// 3.1) будет вызывать метод doNoise
// 3.2) и в этом же методе будет вызывать специфичный метод для животного(используй низходящий кастинг)

public class AnimalManagement {

    public static void main(String[] args) {

        System.out.println("- - - - - This is how Casting works! - - - - - ");
        Animal animalCat = new Cat();
        System.out.println("Animal animalCat = new Cat();");
        System.out.println(animalCat.doNoise());
        System.out.println(((Cat) animalCat).catHountsMouse());
        System.out.println();

        Animal animalDog = new Dog();
        System.out.println("Animal animalDog = new Dog();");
        System.out.println(animalDog.doNoise());
        System.out.println(((Dog) animalDog).dogHuntsFoxes());
        System.out.println();

        System.out.println("- - - - - The same through method - - - - -");
    }

    public String anyAnimalSound(Animal animal) {
        return animal.doNoise();
    }
}
