public class Garbage {
    public static void main(String[] args) throws InterruptedException {
        Garbage obj1 = new Garbage();
        Garbage obj2 = new Garbage();
        obj1 = null;
        System.gc();
        System.out.println("Object garbage collected: " + this);
    }
}
