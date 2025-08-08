package Java_28_07;

// Functional interface with no parameters
@FunctionalInterface
interface FunInterface {
    void greet();
}

// Functional interface with parameter and return type
@FunctionalInterface
interface MessageService {
    String getMessage(String name);
}

public class FunInterfaceExample {

    public static void main(String[] args) {

        // Lambda implementation of FunInterface (Java 8+)
        FunInterface obj = () -> {
            System.out.println("Hello from lambda!");
        };

        obj.greet();

        // Lambda for MessageService interface
        MessageService obj1 = (String name) -> {
            System.out.println("Calculating...");
            System.out.println(10 + 30);

            int x = 200;
            int y = 300;
            System.out.println("Sum: " + (x + y));

            return "Welcome to Wipro: " + name;
        };

        // Call the lambda with an argument
        String result = obj1.getMessage("John");
        System.out.println(result);
        
        Runnable r= () -> {
        	System.out.println("Runnable");
        };
        
        r.run();
        
    }
}
