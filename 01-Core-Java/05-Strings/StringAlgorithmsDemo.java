import java.util.Arrays;

public class StringAlgorithmsDemo {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isAnagram(String s1, String s2) {
        String cleanS1 = s1.replaceAll("\\s", "").toLowerCase();
        String cleanS2 = s2.replaceAll("\\s", "").toLowerCase();

        if (cleanS1.length() != cleanS2.length()) {
            return false;
        }

        char[] arr1 = cleanS1.toCharArray();
        char[] arr2 = cleanS2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "hello";
        System.out.println("Is '" + word1 + "' Palindrome? " + isPalindrome(word1));
        System.out.println("Is '" + word2 + "' Palindrome? " + isPalindrome(word2));

        String a1 = "listen";
        String a2 = "silent";
        System.out.println("\nAre '" + a1 + "' and '" + a2 + "' Anagrams? " + isAnagram(a1, a2));

        String text = "Java Programming Language";
        System.out.println("\nCounting in: \"" + text + "\"");
        countVowelsAndConsonants(text);

        String statement = "Code Learn Practice Repeat";
        System.out.println("\nOriginal : " + statement);
        System.out.println("Reversed : " + reverseWords(statement));
    }
}
