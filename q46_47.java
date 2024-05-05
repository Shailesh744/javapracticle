class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread1");

        // Demonstrate getName, setName, getId, getPriority, and setPriority functions
        System.out.println("Before setting name, ID, and priority:");
        thread1.start();

        // Change name, ID, and priority
        thread1.setName("NewThreadName");
        thread1.setPriority(Thread.MAX_PRIORITY);

        System.out.println("\nAfter setting name, ID, and priority:");
        thread1.start();
    }
}
