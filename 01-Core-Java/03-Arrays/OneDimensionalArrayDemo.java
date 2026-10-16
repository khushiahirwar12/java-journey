import java.util.Scanner;

public class OneDimensionalArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {15, 42, 8, 23, 74, 31};
        System.out.println("Array length: " + numbers.length);
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        System.out.print("Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double avg = (double) sum / numbers.length;
        System.out.println("Total Sum: " + sum);
        System.out.println("Average: " + avg + "\n");

        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max + "\n");

        int target = 23;
        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Element " + target + " not found.");
        }
        System.out.println();

        System.out.print("Enter size of dynamic array: ");
        int size = sc.nextInt();
        int[] userArr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            userArr[i] = sc.nextInt();
        }

        System.out.print("Dynamic Array elements: ");
        for (int val : userArr) {
            System.out.print(val + " ");
        }
        System.out.println();

        sc.close();
    }
}
