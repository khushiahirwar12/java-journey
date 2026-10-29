class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class task step: " + i + " | Name: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Task step: " + i + " | Name: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Runnable interrupted: " + e.getMessage());
            }
        }
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("Multithreading - Thread Creation Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("----------------------------------------------");

        MyThread thread1 = new MyThread();
        thread1.setName("Worker-Thread");

        Thread thread2 = new Thread(new MyRunnable(), "Worker-Runnable");

        Thread thread3 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Lambda Task step: " + i + " | Name: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Lambda thread interrupted: " + e.getMessage());
                }
            }
        }, "Worker-Lambda");

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main interrupted while joining: " + e.getMessage());
        }

        System.out.println("All threads finished. Main thread ends.");
    }
}
