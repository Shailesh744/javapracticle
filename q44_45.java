class UserThread extends Thread {
    private String message;

    public UserThread(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        UserThread thread1 = new UserThread("User defined thread using Thread class.");
        thread1.start();

        UserThread thread2 = new UserThread("User defined thread using Runnable interface.");
        Thread thread = new Thread(thread2);
        thread.start();
    }
}
