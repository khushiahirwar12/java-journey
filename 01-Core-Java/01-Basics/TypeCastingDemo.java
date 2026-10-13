
public class TypeCastingDemo {

    public static void main(String[] args) {

        int intVal = 100;
        double doubleVal = intVal;
        System.out.println("--- Widening (Implicit) Casting ---");
        System.out.println("Integer value: " + intVal);
        System.out.println("Converted to Double: " + doubleVal);

        double pi = 3.14159;
        int truncatedPi = (int) pi;

        System.out.println("\n--- Narrowing (Explicit) Casting ---");
        System.out.println("Original Double: " + pi);
        System.out.println("Casted to Integer: " + truncatedPi);

        int bigNum = 130;
        byte byteNum = (byte) bigNum;
        System.out.println("\nOverflow demonstration: " + byteNum);
    }
}
