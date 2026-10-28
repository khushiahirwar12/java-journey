import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class CustomResource implements AutoCloseable {
    private String resourceName;

    public CustomResource(String resourceName) {
        this.resourceName = resourceName;
        System.out.println("Resource opened: " + resourceName);
    }

    public void doWork() {
        System.out.println("Processing data using: " + resourceName);
    }

    @Override
    public void close() {
        System.out.println("Resource closed automatically: " + resourceName);
    }
}

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("Try-with-Resources (ARM) Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("----------------------------------------------");

        try (CustomResource res = new CustomResource("DatabaseConnection")) {
            res.doWork();
        }

        String fileName = "sample_test.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, Java ARM feature test.");
        } catch (IOException e) {
            System.out.println("Write failed: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("File content: " + line);
            }
        } catch (IOException e) {
            System.out.println("Read failed: " + e.getMessage());
        }

        System.out.println("Execution finished cleanly.");
    }
}
