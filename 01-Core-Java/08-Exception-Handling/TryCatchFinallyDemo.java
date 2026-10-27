
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("Exception Handling - Try Catch Finally Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("----------------------------------------------");

        System.out.println("--- 1. Basic Arithmetic Exception Handling ---");
        try {
            int numerator = 50;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Caught ArithmeticException: Division by zero is undefined.");
        } finally {
            System.out.println("Finally block executed: Cleanup for case 1 complete.");
        }

        System.out.println("\n--- 2. Multi-Catch Block Handling ---");
        try {
            int[] numbers = {10, 20, 30};
            String text = null;

            int value = numbers[1];
            System.out.println("Accessed value: " + value);

            int textLength = text.length();
            System.out.println("Length: " + textLength);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Invalid index accessed.");
        } catch (NullPointerException ex) {
            System.out.println("Caught NullPointerException: Attempted method call on null reference.");
        } catch (Exception ex) {
            System.out.println("Caught General Exception: " + ex.getMessage());
        } finally {
            System.out.println("Finally block executed: Resources safely released.");
        }

        System.out.println("\n--- 3. Nested Try-Catch Block ---");
        try {
            int[] sampleArray = new int[3];

            try {
                int invalidCalculation = 100 / 0;
            } catch (ArithmeticException innerEx) {
                System.out.println("Inner Catch: Handled inner arithmetic error.");
            }

            sampleArray[5] = 42;

        } catch (ArrayIndexOutOfBoundsException outerEx) {
            System.out.println("Outer Catch: Handled outer array boundary error.");
        } finally {
            System.out.println("Outer Finally block: Flow terminated gracefully.");
        }
    }
}
