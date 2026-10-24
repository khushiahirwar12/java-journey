import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        String developer = "Khushi Ahirwar";
        System.out.println("Collections Framework - HashMap Demo");
        System.out.println("Maintained by : " + developer);
        System.out.println("----------------------------------------------");

        Map<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Khushi", 95);
        studentMarks.put("Aman", 88);
        studentMarks.put("Rohan", 76);
        studentMarks.put("Sneha", 92);
        studentMarks.put("Aman", 90);

        System.out.println("Initial HashMap (Keys are unique, duplicate 'Aman' updated):");
        System.out.println(studentMarks);

        System.out.println("\nMarks for Khushi: " + studentMarks.get("Khushi"));
        System.out.println("Marks for Pooja (Defaulted): " + studentMarks.getOrDefault("Pooja", 0));

        System.out.println("Contains key 'Rohan'? " + studentMarks.containsKey("Rohan"));
        System.out.println("Contains value 95? " + studentMarks.containsValue(95));

        studentMarks.putIfAbsent("Sneha", 99);
        studentMarks.putIfAbsent("Pooja", 84);
        System.out.println("\nAfter putIfAbsent checks:");
        System.out.println(studentMarks);

        studentMarks.remove("Rohan");
        System.out.println("After removing Rohan: " + studentMarks);

        System.out.println("\n--- 1. Iterating using EntrySet (Key + Value) ---");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println("Student: " + entry.getKey() + " -> Marks: " + entry.getValue());
        }

        System.out.println("\n--- 2. Iterating over Keys ---");
        for (String name : studentMarks.keySet()) {
            System.out.println("Key: " + name);
        }

        System.out.println("\n--- 3. Iterating over Values ---");
        for (Integer mark : studentMarks.values()) {
            System.out.println("Score: " + mark);
        }

        System.out.println("\nTotal entries: " + studentMarks.size());
    }
}
