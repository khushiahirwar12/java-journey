import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Developer implements Comparable<Developer> {
    private int id;
    private String name;
    private int experienceYears;

    Developer(int id, String name, int experienceYears) {
        this.id = id;
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    @Override
    public int compareTo(Developer other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Developer[ID=" + id + ", Name=" + name + ", Exp=" + experienceYears + " yrs]";
    }
}

class NameComparator implements Comparator<Developer> {
    @Override
    public int compare(Developer d1, Developer d2) {
        return d1.getName().compareTo(d2.getName());
    }
}

public class ComparableAndComparatorDemo {
    public static void main(String[] args) {
        String author = "Khushi Ahirwar";
        System.out.println("Comparable vs Comparator Demo");
        System.out.println("Maintained by : " + author);
        System.out.println("----------------------------------------------");

        List<Developer> team = new ArrayList<>();
        team.add(new Developer(104, "Sneha", 3));
        team.add(new Developer(101, "Khushi", 5));
        team.add(new Developer(103, "Aman", 2));
        team.add(new Developer(102, "Rohan", 4));

        System.out.println("Original List:");
        for (Developer dev : team) {
            System.out.println(dev);
        }

        Collections.sort(team);
        System.out.println("\n--- 1. Sorted by ID (Comparable / Natural Order) ---");
        for (Developer dev : team) {
            System.out.println(dev);
        }

        Collections.sort(team, new NameComparator());
        System.out.println("\n--- 2. Sorted by Name (Comparator Class) ---");
        for (Developer dev : team) {
            System.out.println(dev);
        }

        team.sort((d1, d2) -> Integer.compare(d2.getExperienceYears(), d1.getExperienceYears()));
        System.out.println("\n--- 3. Sorted by Experience Descending (Lambda Comparator) ---");
        for (Developer dev : team) {
            System.out.println(dev);
        }
    }
}
