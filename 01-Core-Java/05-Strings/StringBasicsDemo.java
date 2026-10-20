public class StringBasicsDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));

        String str = " Java Programming ";

        System.out.println("\nLength: " + str.length());
        System.out.println("Trimmed: '" + str.trim() + "'");
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Substring (1, 5): " + str.substring(1, 5));
        System.out.println("Contains 'Prog': " + str.contains("Prog"));
        System.out.println("Replace 'Java' with 'Core Java': " + str.replace("Java", "Core Java"));

        String text = "Apple,Banana,Orange,Mango";
        String[] fruits = text.split(",");

        System.out.println("\nFruits after split:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        String word = "Java";
        word.concat(" Developer");
        System.out.println("\nString Immutability check: " + word);

        word = word.concat(" Developer");
        System.out.println("After explicit reassignment: " + word);
    }
}
