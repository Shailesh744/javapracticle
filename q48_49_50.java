class MyThread implements Runnable {
    Thread t;

    MyThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}

public class ThreadDemo {
    public static void main(String args[]) {
        MyThread mt = new MyThread();

        try {
            System.out.println("Main Thread: " + Thread.currentThread());
            System.out.println("Child thread alive: " + mt.t.isAlive());

            // Wait for threads to finish
            mt.t.join();

            System.out.println("Child thread joined.");
            System.out.println("Child thread alive: " + mt.t.isAlive());

            // Suspend, resume, and stop thread
            mt.t.suspend();
            System.out.println("Child thread suspended.");
            Thread.sleep(2000);

            mt.t.resume();
            System.out.println("Child thread resumed.");
            Thread.sleep(2000);

            mt.t.stop();
            System.out.println("Child thread stopped.");

            // Wait, notify, notifyAll
            synchronized (mt.t) {
                System.out.println("Main thread trying to call wait()");
                mt.t.wait(1000);
                System.out.println("Main thread woke up");
                mt.t.notify();
                mt.t.notifyAll();
            }

            mt.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
