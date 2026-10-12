public class VariablesAndDataTypes {
    public static void main(String[] args) {

        byte age = 18;
        int rollNumber = 101;
        long population = 8000000000L;
        
        float percentage = 88.5f;
        double pi = 3.14159265359;
        
        char grade = 'A';
        boolean isEnrolled = true;


        String studentName = "Khushi";

        System.out.println("--- Student Profile ---");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Enrolled: " + isEnrolled);
        System.out.println("Double Value (Pi): " + pi);
        System.out.println("Long Value (Population): " + population);
    }
}
