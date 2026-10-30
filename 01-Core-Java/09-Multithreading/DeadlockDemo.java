public class DeadlockDemo {
    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("Multithreading - Deadlock & Deadlock Avoidance Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("--------------------------------------------------");

        String resource1 = "Resource-A";
        String resource2 = "Resource-B";

        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked " + resource1);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 interrupted.");
                }

                System.out.println("Thread 1: Waiting to lock " + resource2 + "...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Acquired both locks successfully.");
                }
            }
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 2: Locked " + resource1 + " (Ordered locking prevents deadlock)");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Thread 2 interrupted.");
                }

                System.out.println("Thread 2: Waiting to lock " + resource2 + "...");
                synchronized (resource2) {
                    System.out.println("Thread 2: Acquired both locks successfully.");
                }
            }
        }, "Thread-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Execution completed safely without entering deadlock state.");
    }
}
