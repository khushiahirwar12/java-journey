public class MethodOverloadingDemo {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void display(String message) {
        System.out.println("String: " + message);
    }

    public static void display(int number) {
        System.out.println("Integer: " + number);
    }

    public static void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        System.out.println("Multiply two ints: " + multiply(4, 5));
        System.out.println("Multiply three ints: " + multiply(2, 3, 4));
        System.out.println("Multiply two doubles: " + multiply(2.5, 4.0));

        System.out.println();
        display("Java Journey");
        display(101);
        display("Khushi", 20);
    }
}
