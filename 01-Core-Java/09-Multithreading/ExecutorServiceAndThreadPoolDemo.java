import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CalculationTask implements Callable<Integer> {
    private int number;

    public CalculationTask(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " calculating square for: " + number);
        Thread.sleep(300);
        return number * number;
    }
}

public class ExecutorServiceAndThreadPoolDemo {
    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("Multithreading - ExecutorService & Thread Pool Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("--------------------------------------------------");

        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.execute(() -> {
            System.out.println(Thread.currentThread().getName() + " executing Runnable fire-and-forget task.");
        });

        Future<Integer> future1 = executor.submit(new CalculationTask(5));
        Future<Integer> future2 = executor.submit(new CalculationTask(8));

        try {
            int result1 = future1.get();
            int result2 = future2.get();

            System.out.println("Result 1 from Future: " + result1);
            System.out.println("Result 2 from Future: " + result2);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Task execution failed: " + e.getMessage());
        } finally {
            executor.shutdown();
            System.out.println("ExecutorService shut down gracefully.");
        }
    }
}
