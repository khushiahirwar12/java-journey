public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Journey");
        System.out.println("After append: " + sb);

        sb.insert(4, " Full");
        System.out.println("After insert: " + sb);

        sb.replace(0, 4, "Core Java");
        System.out.println("After replace: " + sb);

        sb.delete(4, 9);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sb.reverse();
        System.out.println("Restored: " + sb);
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());

        StringBuffer sbf = new StringBuffer("Thread Safe");
        sbf.append(" Buffer");
        System.out.println("\nStringBuffer: " + sbf);

        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        long stringDuration = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        StringBuilder testSb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            testSb.append("a");
        }
        long sbDuration = System.currentTimeMillis() - startTime;

        System.out.println("\nTime taken by String (+): " + stringDuration + " ms");
        System.out.println("Time taken by StringBuilder: " + sbDuration + " ms");
    }
}
