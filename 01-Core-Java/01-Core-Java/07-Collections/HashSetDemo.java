import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        String developer = "Khushi Ahirwar";
        System.out.println("Collections Framework - HashSet Demo");
        System.out.println("Maintained by : " + developer);
        System.out.println("----------------------------------------------");

        Set<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("Spring Boot");
        skills.add("SQL");
        skills.add("Git");
        skills.add("Java");
        skills.add(null);

        System.out.println("Skills Set (Duplicates Ignored):");
        System.out.println(skills);
        System.out.println("Total Unique Skills: " + skills.size());

        System.out.println("\nContains 'SQL'? " + skills.contains("SQL"));
        System.out.println("Contains 'Python'? " + skills.contains("Python"));

        skills.remove(null);
        System.out.println("After removing null: " + skills);

        Set<String> requiredSkills = new HashSet<>();
        requiredSkills.add("Java");
        requiredSkills.add("Docker");
        requiredSkills.add("Kubernetes");

        Set<String> unionSet = new HashSet<>(skills);
        unionSet.addAll(requiredSkills);
        System.out.println("\nUnion of Skills: " + unionSet);

        Set<String> intersectionSet = new HashSet<>(skills);
        intersectionSet.retainAll(requiredSkills);
        System.out.println("Intersection (Common Skills): " + intersectionSet);

        Set<String> differenceSet = new HashSet<>(skills);
        differenceSet.removeAll(requiredSkills);
        System.out.println("Difference (Skills only in first set): " + differenceSet);

        System.out.println("\n--- Iterating over Set ---");
        for (String skill : skills) {
            System.out.println("Skill: " + skill);
        }
    }
}
