import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ImmutableEmployee {
    private final int id;
    private final String name;
    private final List<String> skills;

    public ImmutableEmployee(int id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        List<String> tempSkills = new ArrayList<>();
        for (String skill : skills) {
            tempSkills.add(skill);
        }
        this.skills = Collections.unmodifiableList(tempSkills);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }
}

public class ImmutableClassDemo {
    public static void main(String[] args) {
        List<String> devSkills = new ArrayList<>();
        devSkills.add("Java");
        devSkills.add("OOPs");
        devSkills.add("Git");

        ImmutableEmployee emp = new ImmutableEmployee(101, "Khushi Ahirwar", devSkills);

        System.out.println("Employee ID   : " + emp.getId());
        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Skills        : " + emp.getSkills());

        devSkills.add("Spring Boot");
        System.out.println("\nSkills after modifying original list: " + emp.getSkills());

        try {
            emp.getSkills().add("Microservices");
        } catch (UnsupportedOperationException e) {
            System.out.println("\nException caught: Cannot modify immutable skills list directly!");
        }
    }
}
