class Student {
    int id;
    String name;
    int marks;

    Student() {
        id = 101;
        name = "Default Student";
        marks = 50;
    }

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.id = other.id;
        this.name = other.name;
        this.marks = other.marks;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class ConstructorsDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(102, "Khushi", 95);
        Student s3 = new Student(s2);

        System.out.println("Default Constructor:");
        s1.display();

        System.out.println("\nParameterized Constructor:");
        s2.display();

        System.out.println("\nCopy Constructor:");
        s3.display();
    }
}
