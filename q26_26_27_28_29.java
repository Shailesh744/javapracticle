// Parent class
class Animal {
    String name;

    // Constructor to initialize data
    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Single inheritance: Dog is a type of Animal
class Dog extends Animal {
    // Constructor to initialize data
    Dog(String name) {
        super(name); // Calling parent class constructor
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}

// Multilevel inheritance: BabyDog is a type of Dog
class BabyDog extends Dog {
    // Constructor to initialize data
    BabyDog(String name) {
        super(name); // Calling parent class constructor
    }

    void weep() {
        System.out.println(name + " is weeping");
    }
}

public class Main {
    public static void main(String[] args) {
        // Single inheritance
        Dog dog = new Dog("Buddy");
        dog.eat();
        dog.bark();

        // Multilevel inheritance
        BabyDog babyDog = new BabyDog("Max");
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();
    }
}
