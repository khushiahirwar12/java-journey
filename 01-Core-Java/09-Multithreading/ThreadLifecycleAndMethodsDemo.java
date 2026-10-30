class WorkerTask extends Thread {
    public WorkerTask(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " running with Priority: " + getPriority());
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " processing step " + i);
                Thread.sleep(400);
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted during sleep.");
        }
        System.out.println(getName() + " execution finished.");
    }
}

class YieldingTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " yielding at step " + i);
            Thread.yield();
        }
    }
}

public class ThreadLifecycleAndMethodsDemo {
    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("Thread Lifecycle & Core Methods Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("----------------------------------------------");

        WorkerTask t1 = new WorkerTask("Priority-High-Thread");
        WorkerTask t2 = new WorkerTask("Interruptible-Thread");
        Thread t3 = new Thread(new YieldingTask(), "Yield-Thread");

        System.out.println("State before start (t1): " + t1.getState());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("State after start (t1): " + t1.getState());
        System.out.println("Is t1 alive? " + t1.isAlive());

        try {
            Thread.sleep(200);
            t2.interrupt();

            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("State after completion (t1): " + t1.getState());
        System.out.println("Is t1 alive now? " + t1.isAlive());
        System.out.println("Main thread finished successfully.");
    }
}
