// Superclass
class Animal {
    // Method that will be overridden
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass 1
class Dog extends Animal {
    // Overriding eat() method
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

// Subclass 2
class Cat extends Animal {
    // Overriding eat() method using super keyword
    @Override
    void eat() {
        super.eat();
        System.out.println("Cat is eating");
    }
}

// Abstract class with abstract method
abstract class Bird {
    abstract void eat();
}

// Concrete class implementing abstract method
class Sparrow extends Bird {
    // Overriding abstract method
    @Override
    void eat() {
        System.out.println("Sparrow is eating");
    }
}

// Interface
interface Fish {
    // Interface method
    void eat();
}

// Class implementing interface
class Shark implements Fish {
    // Implementing interface method
    @Override
    public void eat() {
        System.out.println("Shark is eating");
    }
}

public class Main {
    public static void main(String[] args) {
        // Dynamic method dispatching
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.eat(); // Output: Animal is eating
        dog.eat();    // Output: Dog is eating
        cat.eat();    // Output: Animal is eating, Cat is eating

        // Abstract method overriding
        Bird sparrow = new Sparrow();
        sparrow.eat(); // Output: Sparrow is eating

        // Interface method overriding
        Fish fish = new Shark();
        fish.eat();    // Output: Shark is eating
    }
}
