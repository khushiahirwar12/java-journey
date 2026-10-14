public class ForEachDemo {
    public static void main(String[] args) {

        System.out.println("--- 1. Programming Languages ---");
        String[] techStack = {"Java", "Python", "JavaScript", "C++", "Go"};
        for (String tech : techStack) {
            System.out.println("Tech: " + tech);
        }

        System.out.println("\n--- 2. Sum and Average Calculation ---");
        int[] scores = {85, 92, 78, 90, 88};
        int totalSum = 0;

        for (int score : scores) {
            totalSum += score;
        }

        double average = (double) totalSum / scores.length;
        System.out.println("Total Score: " + totalSum);
        System.out.println("Average Score: " + average);

        System.out.println("\n--- 3. Find Maximum Value ---");
        int[] numbers = {45, 12, 89, 23, 67, 95, 34};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum Value: " + max);

        System.out.println("\n--- 4. 2D Matrix Traversal ---");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
