package OOPS.Pillars.Abstraction.Keyword;

abstract class Animal {
    // Abstract method
    abstract void sound();

    // Non-abstract method
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    // Implementing the abstract method
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Animal animal = new Animal();  // This will cause a compilation error

        Dog dog = new Dog();  // Creating an object of the subclass
        dog.sound();  // Output: The dog barks.
        dog.sleep();  // Output: This animal is sleeping.

        Animal an = new Animal() {
            @Override
            void sound() {
                System.out.println("hh");
            }
        };

        an.sound();
    }
}
