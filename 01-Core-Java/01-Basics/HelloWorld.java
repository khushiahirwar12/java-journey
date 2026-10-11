import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentTime = dtf.format(LocalDateTime.now());

        System.out.println("=========================================");
        System.out.println("       ☕ WELCOME TO JAVA JOURNEY        ");
        System.out.println("=========================================");
        System.out.println("Author       : Khushi Ahirwar");
        System.out.println("Started On   : " + currentTime);
        System.out.println("Java Version : " + System.getProperty("java.version"));
        System.out.println("OS           : " + System.getProperty("os.name"));
        System.out.println("Status       : Building strong fundamentals!");
        System.out.println("=========================================");
        System.out.println(">> Hello, World! Day 1 initiated successfully. 🚀");
    }
}
