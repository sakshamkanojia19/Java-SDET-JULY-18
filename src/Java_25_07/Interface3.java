package Java_25_07;


public interface Interface3 {

    // Dummy data
    String clientName = "OpenAI Corp";
    String clientLocation = "San Francisco";

    void display(); // Same name as Interface2

    void generateReport();

    default void commonFeature() {
        System.out.println("Common feature from Interface3");
    }
}