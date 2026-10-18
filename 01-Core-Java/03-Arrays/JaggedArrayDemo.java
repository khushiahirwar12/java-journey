import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperationsDemo {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array: " + Arrays.toString(arr));

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array (Bubble Sort): " + Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));

        int[] data = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        boolean[] visited = new boolean[data.length];

        System.out.println("\nElement Frequency Count:");
        for (int i = 0; i < data.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(data[i] + " occurs " + count + " time(s)");
        }

        int[] dupArr = {10, 20, 20, 30, 40, 40, 50};
        System.out.print("\nDuplicates in array: ");
        boolean foundDuplicate = false;
        for (int i = 0; i < dupArr.length; i++) {
            for (int j = i + 1; j < dupArr.length; j++) {
                if (dupArr[i] == dupArr[j]) {
                    System.out.print(dupArr[i] + " ");
                    foundDuplicate = true;
                    break;
                }
            }
        }
        if (!foundDuplicate) {
            System.out.print("None");
        }
        System.out.println();
    }
}
