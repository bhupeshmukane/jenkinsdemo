public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("=== JENKINS BUILD ===");
        System.out.println("Hello from Jenkins Build!");
        System.out.println("Build Date: " + new java.util.Date());
        System.out.println("This is a simple Java application");
        System.out.println("Built using Jenkins CI/CD");
        System.out.println("=== BUILD SUCCESS ===");
    }
}