import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        String developer = "Khushi Ahirwar";
        System.out.println("Collections Framework - TreeMap (SortedMap) Demo");
        System.out.println("Maintained by : " + developer);
        System.out.println("--------------------------------------------------");

        TreeMap<Integer, String> employeeDirectory = new TreeMap<>();

        employeeDirectory.put(105, "Pooja");
        employeeDirectory.put(101, "Khushi");
        employeeDirectory.put(104, "Sneha");
        employeeDirectory.put(102, "Aman");
        employeeDirectory.put(103, "Rohan");

        System.out.println("TreeMap (Keys automatically sorted in ascending order):");
        System.out.println(employeeDirectory);

        System.out.println("\nLowest Employee ID (firstKey) : " + employeeDirectory.firstKey() + " -> " + employeeDirectory.get(employeeDirectory.firstKey()));
        System.out.println("Highest Employee ID (lastKey) : " + employeeDirectory.lastKey() + " -> " + employeeDirectory.get(employeeDirectory.lastKey()));

        System.out.println("\n--- NavigableMap Boundary Queries ---");
        System.out.println("Strictly lower than 103 (< 103)  : " + employeeDirectory.lowerEntry(103));
        System.out.println("Floor of 103 (<= 103)            : " + employeeDirectory.floorEntry(103));
        System.out.println("Ceiling of 103 (>= 103)          : " + employeeDirectory.ceilingEntry(103));
        System.out.println("Strictly higher than 103 (> 103) : " + employeeDirectory.higherEntry(103));

        System.out.println("\n--- SubMaps & Range Views ---");
        System.out.println("HeadMap (< 104)      : " + employeeDirectory.headMap(104));
        System.out.println("TailMap (>= 103)     : " + employeeDirectory.tailMap(103));
        System.out.println("SubMap [102, 105)    : " + employeeDirectory.subMap(102, 105));

        System.out.println("\nDescending Map View: " + employeeDirectory.descendingMap());

        System.out.println("\nPolled First Entry: " + employeeDirectory.pollFirstEntry());
        System.out.println("Polled Last Entry : " + employeeDirectory.pollLastEntry());
        System.out.println("Remaining Map: " + employeeDirectory);

        System.out.println("\n--- Iterating over TreeMap ---");
        for (Map.Entry<Integer, String> entry : employeeDirectory.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }
}
