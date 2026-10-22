import java.util.Objects;

class Student {
    private int id;
    private String name;
    private String branch;

    Student(int id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name='" + name + "', Branch='" + branch + "']";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class ObjectContractDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Khushi Ahirwar", "Computer Science");
        Student s2 = new Student(101, "Khushi Ahirwar", "Computer Science");
        Student s3 = new Student(102, "Aman Verma", "Information Technology");

        System.out.println("--- toString() Output ---");
        System.out.println(s1);
        System.out.println(s3);

        System.out.println("\n--- equals() Contract ---");
        System.out.println("s1 == s2 (Reference comparison) : " + (s1 == s2));
        System.out.println("s1.equals(s2) (Content match)  : " + s1.equals(s2));
        System.out.println("s1.equals(s3)                  : " + s1.equals(s3));

        System.out.println("\n--- hashCode() Consistency ---");
        System.out.println("s1 HashCode: " + s1.hashCode());
        System.out.println("s2 HashCode: " + s2.hashCode());
        System.out.println("Equal objects have same hash: " + (s1.hashCode() == s2.hashCode()));
    }
}
