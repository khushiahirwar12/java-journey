public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("--- Bitwise Operators ---");
        System.out.println("a & b (AND) : " + (a & b)); 
        System.out.println("a | b (OR)  : " + (a | b)); 
        System.out.println("a ^ b (XOR) : " + (a ^ b)); 
        System.out.println("~a (NOT)    : " + (~a));   

        int num = 8;
        System.out.println("\n--- Shift Operators ---");
        System.out.println("Left Shift (8 << 1)  : " + (num << 1));
        System.out.println("Right Shift (8 >> 1) : " + (num >> 1));
        int checkNum = 29;
        if ((checkNum & 1) == 0) {
            System.out.println(checkNum + " is Even (bitwise check)");
        } else {
            System.out.println(checkNum + " is Odd (bitwise check)");
        }
    }
}
