import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        String developer = "Khushi Ahirwar";
        System.out.println("Collections Framework - ArrayList Demo");
        System.out.println("Maintained by : " + developer);
        System.out.println("----------------------------------------------");

        List<String> studentList = new ArrayList<>();

        studentList.add("Khushi");
        studentList.add("Aman");
        studentList.add("Rohan");
        studentList.add("Sneha");
        studentList.add("Pooja");

        System.out.println("Initial List: " + studentList);
        System.out.println("Total Students: " + studentList.size());

        studentList.add(2, "Divya");
        System.out.println("\nAfter inserting 'Divya' at index 2: " + studentList);

        String firstStudent = studentList.get(0);
        System.out.println("Element at index 0: " + firstStudent);

        studentList.set(1, "Aman Verma");
        System.out.println("After updating index 1: " + studentList);

        studentList.remove("Sneha");
        studentList.remove(3);
        System.out.println("After removals: " + studentList);

        System.out.println("Contains 'Khushi'? " + studentList.contains("Khushi"));

        Collections.sort(studentList);
        System.out.println("\nSorted List (Alphabetical): " + studentList);

        System.out.println("\n--- 1. Iteration using Enhanced For Loop ---");
        for (String name : studentList) {
            System.out.println("Student: " + name);
        }

        System.out.println("\n--- 2. Iteration using Iterator ---");
        Iterator<String> itr = studentList.iterator();
        while (itr.hasNext()) {
            System.out.println("Item: " + itr.next());
        }

        studentList.clear();
        System.out.println("\nList empty after clear()? " + studentList.isEmpty());
    }
}
