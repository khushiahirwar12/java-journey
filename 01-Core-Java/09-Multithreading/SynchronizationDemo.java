class BankAccount {
    private int balance = 1000;

    public synchronized void withdrawUsingMethod(int amount) {
        String threadName = Thread.currentThread().getName();
        if (balance >= amount) {
            System.out.println(threadName + " entering. Current balance: " + balance);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
            balance -= amount;
            System.out.println(threadName + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(threadName + " failed: Insufficient funds. Balance: " + balance);
        }
    }

    public void withdrawUsingBlock(int amount) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " preparing to withdraw...");

        synchronized (this) {
            if (balance >= amount) {
                System.out.println(threadName + " entered synchronized block. Balance: " + balance);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
                balance -= amount;
                System.out.println(threadName + " exiting block. Remaining balance: " + balance);
            } else {
                System.out.println(threadName + " block check failed: Low balance. Balance: " + balance);
            }
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("Multithreading - Synchronization Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("----------------------------------------------");

        BankAccount account1 = new BankAccount();

        Thread t1 = new Thread(() -> account1.withdrawUsingMethod(700), "User-1");
        Thread t2 = new Thread(() -> account1.withdrawUsingMethod(700), "User-2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
        }

        System.out.println("Final balance for Account 1: " + account1.getBalance());
        System.out.println("----------------------------------------------");

        BankAccount account2 = new BankAccount();

        Thread t3 = new Thread(() -> account2.withdrawUsingBlock(600), "User-3");
        Thread t4 = new Thread(() -> account2.withdrawUsingBlock(600), "User-4");

        t3.start();
        t4.start();

        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted: " + e.getMessage());
        }

        System.out.println("Final balance for Account 2: " + account2.getBalance());
    }
}
