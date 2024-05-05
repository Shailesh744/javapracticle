import UserDefinedPackage.MyClass1;

public class MainClass {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        obj.displayPublic();    // Public method can be accessed from anywhere
        obj.displayProtected(); // Protected method can be accessed within the same package
        obj.displayDefault();   // Default method can be accessed within the same package
        // obj.displayPrivate(); // Private method cannot be accessed outside the class
    }
}
