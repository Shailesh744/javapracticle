// Interface for multiple inheritance
interface Interface1 {
    void method1();
}

interface Interface2 {
    void method2();
}

// Implementing multiple interfaces
class MyClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method1 called");
    }

    public void method2() {
        System.out.println("Method2 called");
    }
}

// Interface for dynamic dispatching
interface DynamicInterface {
    void dynamicMethod();
}

// Implementing the dynamic dispatching interface
class DynamicDispatch implements DynamicInterface {
    public void dynamicMethod() {
        System.out.println("Dynamic method called");
    }
}

public class Main {
    public static void main(String[] args) {
        // Multiple inheritance example
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();

        // Dynamic dispatching example
        DynamicInterface dynamicObj = new DynamicDispatch();
        dynamicObj.dynamicMethod();
    }
}
