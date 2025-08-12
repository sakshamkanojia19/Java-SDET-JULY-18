package labsessions._18_07;

public class Task1_PrintDetails {

    public void printDetails(String name, int age, String city) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        Task1_PrintDetails obj = new Task1_PrintDetails();
        obj.printDetails("John", 22, "Delhi");
    }
}
