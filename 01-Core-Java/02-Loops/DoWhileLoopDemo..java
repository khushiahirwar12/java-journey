public class DoWhileLoopDemo {
    public static void main(String[] args) {

        System.out.println("--- 1. Basic Counter ---");
        int count = 1;
        do {
            System.out.println("Counter: " + count);
            count++;
        } while (count <= 5);

        System.out.println("\n--- 2. At Least Once Execution ---");
        int val = 10;
        do {
            System.out.println("Condition (val < 5) false hai, fir bhi ye line execute hui! Current val: " + val);
            val++;
        } while (val < 5);
        System.out.println("\n--- 3. Multiplication Table of 7 ---");
        int multiplier = 1;
        int tableNumber = 7;
        do {
            System.out.println(tableNumber + " x " + multiplier + " = " + (tableNumber * multiplier));
            multiplier++;
        } while (multiplier <= 10);

        System.out.println("\n--- 4. Simulated Menu-Driven Loop ---");
        int userChoice = 1;
        int step = 1;

        do {
            System.out.println("Processing transaction step: " + step);
            step++;

            if (step > 3) {
                userChoice = 0;
                System.out.println("User chose to exit (Choice set to 0).");
            }
        } while (userChoice != 0);

        System.out.println("Loop finished successfully!");
    }
}
