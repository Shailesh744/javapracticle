class Demo {
    int num;

    // Default constructor
    Demo() {
        num = 100;
    }

    // Parameterized constructor
    Demo(int n) {
        num = n;
    }

    // Function to initialize data
    void initializeData(int n) {
        num = n;
    }

    // Function to demonstrate object initialization
    void initDataFromObject(Demo obj) {
        num = obj.num;
    }

    // Function with argument and return value
    int square(int x) {
        return x * x;
    }

    // Function without argument and return value
    void displayMessage() {
        System.out.println("Hello, world!");
    }

    // Function with argument and no return value
    void displayNumber(int n) {
        System.out.println("Number: " + n);
    }

    // Demonstrate 'this' keyword
    void display() {
        System.out.println("Using this keyword: " + this.num);
    }
}

class SubDemo extends Demo {
    // Demonstrate 'super' keyword
    void display() {
        super.display();
        System.out.println("Using super keyword: " + super.num);
    }
}

public class Main {
    public static void main(String[] args) {
        // Demonstrating class and object nature
        Demo obj1 = new Demo();
        Demo obj2 = new Demo(200);

        // Data initialization through default constructor
        System.out.println("Default constructor: " + obj1.num);

        // Data initialization through parameterized constructor
        System.out.println("Parameterized constructor: " + obj2.num);

        // Data initialization through function
        Demo obj3 = new Demo();
        obj3.initializeData(300);
        System.out.println("Data initialized through function: " + obj3.num);

        // Data initialization through object
        Demo obj4 = new Demo();
        obj4.initDataFromObject(obj2);
        System.out.println("Data initialized through object: " + obj4.num);

        // Data initialization through argument with the help of object and function
        Demo obj5 = new Demo();
        obj5.initDataFromObject(obj2);
        obj5.initializeData(400);
        System.out.println("Data initialized through argument with object and function: " + obj5.num);

        // Function with argument and return value
        int result = obj1.square(5);
        System.out.println("Square of 5: " + result);

        // Function without argument and return value
        obj1.displayMessage();

        // Function with argument and no return value
        obj1.displayNumber(123);

        // Demonstrating 'this' keyword
        obj1.display();

        // Demonstrating 'super' keyword
        SubDemo subObj = new SubDemo();
        subObj.display();
    }
}
