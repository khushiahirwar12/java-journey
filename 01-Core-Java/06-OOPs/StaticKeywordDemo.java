class StudentProfile {
    int rollNumber;
    String studentName;
    static String instituteName = "Tech Institute";
    static int totalEnrollments = 0;

    static {
        System.out.println("Static Block: Institute database initialized.");
    }

    StudentProfile(int rollNumber, String studentName) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        totalEnrollments++;
    }

    void displayCard() {
        System.out.println("Roll No    : " + rollNumber);
        System.out.println("Name       : " + studentName);
        System.out.println("Institute  : " + instituteName);
        System.out.println("----------------------------------");
    }

    static void updateInstitute(String newName) {
        instituteName = newName;
    }

    static void showTotalEnrollments() {
        System.out.println("Total Registered Students: " + totalEnrollments);
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        StudentProfile.showTotalEnrollments();

        StudentProfile s1 = new StudentProfile(101, "Khushi Ahirwar");
        StudentProfile s2 = new StudentProfile(102, "Aman Verma");

        System.out.println("\n--- Initial Student Records ---");
        s1.displayCard();
        s2.displayCard();

        StudentProfile.updateInstitute("Apex Engineering Academy");

        System.out.println("--- After Updating Static Institute Name ---");
        s1.displayCard();
        s2.displayCard();

        StudentProfile.showTotalEnrollments();
    }
}
