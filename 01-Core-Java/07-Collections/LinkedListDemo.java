import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        String developer = "Khushi Ahirwar";
        System.out.println("Collections Framework - LinkedList Demo");
        System.out.println("Maintained by : " + developer);
        System.out.println("----------------------------------------------");

        LinkedList<String> taskQueue = new LinkedList<>();

        taskQueue.add("Task 1: Code Review");
        taskQueue.add("Task 2: Bug Fixes");
        taskQueue.add("Task 3: Unit Testing");

        System.out.println("Initial Tasks: " + taskQueue);

        taskQueue.addFirst("Urgent: Production Hotfix");
        taskQueue.addLast("Task 4: Documentation");

        System.out.println("\nAfter adding first & last elements:");
        System.out.println(taskQueue);

        System.out.println("\nFirst Task (Peek) : " + taskQueue.getFirst());
        System.out.println("Last Task (Peek)  : " + taskQueue.getLast());

        String removedFirst = taskQueue.removeFirst();
        String removedLast = taskQueue.removeLast();

        System.out.println("\nExecuted & Removed First : " + removedFirst);
        System.out.println("Executed & Removed Last  : " + removedLast);

        System.out.println("\nRemaining Queue: " + taskQueue);

        System.out.println("\n--- Processing Remaining Tasks ---");
        while (!taskQueue.isEmpty()) {
            System.out.println("Processing: " + taskQueue.poll());
        }

        System.out.println("Queue size after processing: " + taskQueue.size());
    }
}
