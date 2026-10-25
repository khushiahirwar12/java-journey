import java.util.Collections;
import java.util.PriorityQueue;

class Patient implements Comparable<Patient> {
    private String name;
    private int severityScore;

    Patient(String name, int severityScore) {
        this.name = name;
        this.severityScore = severityScore;
    }

    public String getName() {
        return name;
    }

    public int getSeverityScore() {
        return severityScore;
    }

    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.severityScore, this.severityScore);
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severityScore + ")";
    }
}

public class PriorityQueueDemo {
    public static void main(String[] args) {
        String developer = "Khushi Ahirwar";
        System.out.println("Collections Framework - PriorityQueue Demo");
        System.out.println("Maintained by : " + developer);
        System.out.println("----------------------------------------------");

        System.out.println("--- 1. Default Min-Heap (Natural Ordering) ---");
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(45);
        minHeap.offer(12);
        minHeap.offer(89);
        minHeap.offer(3);
        minHeap.offer(27);

        System.out.println("Head element (peek lowest): " + minHeap.peek());

        System.out.print("Processing in ascending order: ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();

        System.out.println("\n--- 2. Max-Heap using Collections.reverseOrder() ---");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(45);
        maxHeap.offer(12);
        maxHeap.offer(89);
        maxHeap.offer(3);
        maxHeap.offer(27);

        System.out.println("Head element (peek highest): " + maxHeap.peek());

        System.out.print("Processing in descending order: ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();

        System.out.println("\n--- 3. Custom Object Priority (Emergency Room Triage) ---");
        PriorityQueue<Patient> emergencyQueue = new PriorityQueue<>();

        emergencyQueue.offer(new Patient("Aman", 3));
        emergencyQueue.offer(new Patient("Khushi", 9));
        emergencyQueue.offer(new Patient("Rohan", 5));
        emergencyQueue.offer(new Patient("Sneha", 8));

        while (!emergencyQueue.isEmpty()) {
            System.out.println("Treating critical patient: " + emergencyQueue.poll());
        }
    }
}
