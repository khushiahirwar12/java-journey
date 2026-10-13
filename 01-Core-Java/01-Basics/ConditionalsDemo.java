import java.util.Scanner;

public class ConditionalsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Status: Eligible to vote.");
        } else {
            System.out.println("Status: Not eligible to vote.");
        }
        System.out.print("Enter exam score (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        String result = (score >= 50) ? "Passed" : "Needs Improvement";
        System.out.println("Result: " + result);

        scanner.close();
    }
}
