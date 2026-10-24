import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        String developer = "Khushi Ahirwar";
        System.out.println("Collections Framework - TreeSet (SortedSet) Demo");
        System.out.println("Maintained by : " + developer);
        System.out.println("--------------------------------------------------");

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(78);
        scores.add(95);
        scores.add(62);
        scores.add(88);
        scores.add(91);
        scores.add(78);

        System.out.println("TreeSet (Sorted & Unique Elements):");
        System.out.println(scores);

        System.out.println("\nLowest Score (First)  : " + scores.first());
        System.out.println("Highest Score (Last)  : " + scores.last());

        System.out.println("\n--- NavigableSet Boundary Searches ---");
        System.out.println("Scores strictly lower than 88 (< 88)   : " + scores.lower(88));
        System.out.println("Scores floor of 88 (<= 88)             : " + scores.floor(88));
        System.out.println("Scores ceiling of 80 (>= 80)           : " + scores.ceiling(80));
        System.out.println("Scores strictly higher than 88 (> 88)  : " + scores.higher(88));

        System.out.println("\n--- SubSets & Range Views ---");
        System.out.println("HeadSet (< 88)           : " + scores.headSet(88));
        System.out.println("TailSet (>= 88)          : " + scores.tailSet(88));
        System.out.println("SubSet [78, 95) range    : " + scores.subSet(78, 95));

        System.out.println("\nDescending Order View: " + scores.descendingSet());

        System.out.println("\nPolled First (Smallest removed): " + scores.pollFirst());
        System.out.println("Polled Last (Highest removed)  : " + scores.pollLast());
        System.out.println("Remaining TreeSet: " + scores);
    }
}
