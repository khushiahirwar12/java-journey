import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityDemo {
    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("java.util.Collections Utility Class Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("----------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(50);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Initial List: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted List (Ascending): " + numbers);

        int searchKey = 30;
        int index = Collections.binarySearch(numbers, searchKey);
        System.out.println("Binary search for " + searchKey + " found at index: " + index);

        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        System.out.println("Max element : " + Collections.max(numbers));
        System.out.println("Min element : " + Collections.min(numbers));
        System.out.println("Frequency of 30: " + Collections.frequency(numbers, 30));

        Collections.replaceAll(numbers, 30, 99);
        System.out.println("After replacing 30 with 99: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);

        List<Integer> testList = new ArrayList<>();
        testList.add(100);
        testList.add(200);

        boolean areDisjoint = Collections.disjoint(numbers, testList);
        System.out.println("Are numbers and testList completely distinct? " + areDisjoint);

        List<Integer> readOnlyList = Collections.unmodifiableList(numbers);
        System.out.println("Read-only view created successfully: " + readOnlyList);

        try {
            readOnlyList.add(77);
        } catch (UnsupportedOperationException e) {
            System.out.println("Exception caught: Cannot modify unmodifiable collection view.");
        }
    }
}
