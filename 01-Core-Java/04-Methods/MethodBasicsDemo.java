public class MethodBasicsDemo {

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java Methods.");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int findMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void modifyValue(int val) {
        val = val + 50;
        System.out.println("Inside modifyValue method: " + val);
    }

    public static void main(String[] args) {
        greetUser("Coder");

        int sumResult = add(25, 45);
        System.out.println("Sum of 25 and 45: " + sumResult);

        int checkNumber = 14;
        System.out.println("Is " + checkNumber + " even? " + isEven(checkNumber));

        int max = findMax(89, 42);
        System.out.println("Maximum between 89 and 42: " + max);

        int original = 100;
        System.out.println("\nOriginal before method call: " + original);
        modifyValue(original);
        System.out.println("Original after method call (Call by Value): " + original);
    }
}
