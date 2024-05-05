interface Animal {
    void eat();
}

interface Mammal {
    void move();
}

class Dog implements Animal, Mammal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void move() {
        System.out.println("Dog is moving");
    }
}

class Cat implements Animal, Mammal {
    public void eat() {
        System.out.println("Cat is eating");
    }

    public void move() {
        System.out.println("Cat is moving");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat(); // Dog is eating

        animal = new Cat();
        animal.eat(); // Cat is eating

        Mammal mammal = new Dog();
        mammal.move(); // Dog is moving

        mammal = new Cat();
        mammal.move(); // Cat is moving
    }
}
