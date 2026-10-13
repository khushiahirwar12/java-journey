
public class ForLoopDemo {

    public static void main(String[] args) {

        System.out.println("--- Counting 1 to 5 ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        System.out.println("\n--- Sum of first 10 numbers ---");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        System.out.println("\n--- Table of 5 ---");
        int tableOf = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableOf + " x " + i + " = " + (tableOf * i));
        }

        System.out.println("\n--- Reverse Countdown ---");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + "...");
        }
        System.out.println("Done!");
    }
}
