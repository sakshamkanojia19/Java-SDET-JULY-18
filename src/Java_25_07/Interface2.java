package Java_25_07;

public interface Interface2 {

    // Dummy data
    String projectName = "AI Chat System";
    int projectId = 1001;

    void display(); // Same name as Interface3

    void calculateProgress();

    default void commonFeature() {
        System.out.println("Common feature from Interface2");
    }
}