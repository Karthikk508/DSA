package Udemy.Abstraction;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Anonymous class is created and extended
        //        Animal dog = new Animal("dog","30",60.2) {
        //            @Override
        //            public void move(String speed) {
        //
        //            }
        //
        //            @Override
        //            public void makeNoise() {
        //
        //                System.out.println("WOof");
        //
        //            }
        //        };
        //dog.makeNoise();

        Dog dog1 = new Dog("Cat","large",200.0);
        dog1.makeNoise();
        doAnimalStuff(dog1);

        Fish fish = new Fish("Fish","Medium",20);
        fish.move("Slow");
        fish.makeNoise();

        ArrayList<Animal> animals =  new ArrayList<>();

        animals.add(dog1);
        animals.add(fish);
        animals.add(new Dog("Sherfman","small",40));
        animals.add(new Dog("dabour","medium",40));
        animals.add(new Fish("catla","large",40));

        animals.add(new Horse("brown","large",1000));

        Horse horse = new Horse("white","medium",500);
        horse.shedHairs();
        horse.makeNoise();

        for (Animal animal : animals)
        {
            doAnimalStuff(animal);

            if(animal instanceof Mammals currentMammal)
            {
                currentMammal.shedHairs();
                currentMammal.makeNoise();
            }
        }
    }
    private static void doAnimalStuff (Animal animal)
    {
        animal.makeNoise();
        animal.move("Slow");
    }
}
