import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUncheckedDemo {

    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        FileReader reader = new FileReader(file);
    }

    public static void performDivision(int a, int b) {
        int result = a / b;
        System.out.println("Division result: " + result);
    }

    public static void printArrayElement(int[] arr, int index) {
        System.out.println("Element: " + arr[index]);
    }

    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("Checked vs Unchecked Exceptions Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("----------------------------------------------");

        try {
            readFile("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        try {
            performDivision(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        try {
            int[] data = {1, 2, 3};
            printArrayElement(data, 5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        System.out.println("Program completed without crashing.");
    }
}
