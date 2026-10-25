import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueAndDequeDemo {
    public static void main(String[] args) {
        String developer = "Khushi Ahirwar";
        System.out.println("Collections Framework - Queue & Deque Demo");
        System.out.println("Maintained by : " + developer);
        System.out.println("----------------------------------------------");

        System.out.println("--- 1. Standard FIFO Queue (LinkedList) ---");
        Queue<String> lineQueue = new LinkedList<>();

        lineQueue.offer("Customer 1");
        lineQueue.offer("Customer 2");
        lineQueue.offer("Customer 3");

        System.out.println("Queue Elements : " + lineQueue);
        System.out.println("Head element (peek) : " + lineQueue.peek());

        while (!lineQueue.isEmpty()) {
            System.out.println("Serving & removing (poll): " + lineQueue.poll());
        }

        System.out.println("\n--- 2. Double-Ended Queue (ArrayDeque) ---");
        Deque<String> deck = new ArrayDeque<>();

        deck.addFirst("Middle");
        deck.addFirst("Front");
        deck.addLast("Rear");

        System.out.println("Deque state : " + deck);
        System.out.println("First element : " + deck.peekFirst());
        System.out.println("Last element  : " + deck.peekLast());

        System.out.println("Removed from front : " + deck.pollFirst());
        System.out.println("Removed from rear  : " + deck.pollLast());
        System.out.println("Remaining Deque    : " + deck);

        System.out.println("\n--- 3. Using Deque as LIFO Stack ---");
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack top (peek): " + stack.peek());
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
