class SharedDataBuffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted: " + e.getMessage());
            }
        }
        this.data = value;
        this.hasData = true;
        System.out.println("Produced item: " + value);
        notify();
    }

    public synchronized void consume() {
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted: " + e.getMessage());
            }
        }
        System.out.println("Consumed item: " + data);
        this.hasData = false;
        notify();
    }
}

class Producer implements Runnable {
    private SharedDataBuffer buffer;

    public Producer(SharedDataBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Producer sleep interrupted.");
            }
        }
    }
}

class Consumer implements Runnable {
    private SharedDataBuffer buffer;

    public Consumer(SharedDataBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Consumer sleep interrupted.");
            }
        }
    }
}

public class InterThreadCommunicationDemo {
    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("Multithreading - Inter-Thread Communication Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("--------------------------------------------------");

        SharedDataBuffer buffer = new SharedDataBuffer();

        Thread producerThread = new Thread(new Producer(buffer), "Producer-Thread");
        Thread consumerThread = new Thread(new Consumer(buffer), "Consumer-Thread");

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Producer-Consumer processing finished successfully.");
    }
}
