public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n--- Relational Operators ---");
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        System.out.println("\n--- Logical Operators ---");
        boolean condition1 = (a > 5); 
        boolean condition2 = (b > 5); 
        System.out.println("condition1 && condition2 : " + (condition1 && condition2));
        System.out.println("condition1 || condition2 : " + (condition1 || condition2));
        System.out.println("!condition1              : " + (!condition1));

        System.out.println("\n--- Increment & Decrement ---");
        int count = 5;
        System.out.println("Post-increment (count++): " + (count++));
        System.out.println("Pre-increment  (++count): " + (++count));
    }
}
