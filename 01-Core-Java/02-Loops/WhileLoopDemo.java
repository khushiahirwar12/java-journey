public class WhileLoopDemo {
    public static void main(String[] args) {

        System.out.println("--- 1. Basic Counter ---");
        int count = 1;
        while (count <= 5) {
            System.out.println("Counter: " + count);
            count++;
        }

        System.out.println("\n--- 2. Sum of Numbers (1 to 10) ---");
        int num = 1;
        int sum = 0;
        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("Total Sum: " + sum);

        System.out.println("\n--- 3. Reverse a Number ---");
        int originalNumber = 12345;
        int temp = originalNumber;
        int reversedNumber = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            temp /= 10;
        }
        System.out.println("Original: " + originalNumber);
        System.out.println("Reversed: " + reversedNumber);

        System.out.println("\n--- 4. Even Numbers (2 to 20) ---");
        int even = 2;
        while (even <= 20) {
            System.out.print(even + " ");
            even += 2;
        }
        System.out.println();
    }
}
