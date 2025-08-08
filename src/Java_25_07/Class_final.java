package Java_25_07;

// Final class: cannot be extended by any other class
public final class Class_final {

    // final variable (constant) - must be initialized at declaration or in constructor
    final int MAX_DAILY_LIMIT = 10000;

    // final static variable
    public static final String BANK_NAME = "OpenAI Bank";

    // final method - cannot be overridden
    public final void displayMessage() {
        System.out.println("Welcome to the Final Class example.");
        System.out.println("Bank Name: " + BANK_NAME);
        System.out.println("Max Daily Limit: " + MAX_DAILY_LIMIT);
    }

    // static method to access static data
    public static void staticFunction() {
        System.out.println("This is a static utility function.");
    }

    public static void main(String[] args) {
        // Create object
        Class_final obj = new Class_final();

        // Call final method
        obj.displayMessage();

        // Call static method
        staticFunction();

        // Access final variable
        System.out.println("Accessing final variable again: " + obj.MAX_DAILY_LIMIT);
    }
}
