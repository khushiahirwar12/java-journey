public class RecursionDemo {

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumOfArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumOfArray(arr, index + 1);
    }

    public static void main(String[] args) {
        System.out.print("Countdown from 5: ");
        printNumbers(5);
        System.out.println();

        int num = 5;
        System.out.println("Factorial of " + num + ": " + factorial(num));

        System.out.print("Fibonacci series up to 7 terms: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        int[] sampleArr = {2, 4, 6, 8, 10};
        System.out.println("Recursive sum of array: " + sumOfArray(sampleArr, 0));
    }
}
