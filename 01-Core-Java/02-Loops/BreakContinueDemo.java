public class BreakContinueDemo {
    public static void main(String[] args) {


        System.out.println("--- 1. Break Statement Demo ---");
        System.out.println("Loop 1 se 10 tak chalega, par 5 par break hoga:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("--- 2. Continue Statement Demo ---");
        System.out.println("Odd numbers printing (skip even numbers using continue):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("--- 3. Labeled Break (Nested Loops) ---");
        outerLoop:
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                if (row == 2 && col == 2) {
                    System.out.println("\nBreaking outerLoop at row=" + row + ", col=" + col);
                    break outerLoop;
                }
                System.out.print("[" + row + "," + col + "] ");
            }
            System.out.println();
        }
    }
}
