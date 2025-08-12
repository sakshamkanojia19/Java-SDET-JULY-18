package Java_25_07;

public class Interface2_3_ChildClass implements Interface2, Interface3 {

    // Handle display() conflict manually
    @Override
    public void display() {
        System.out.println("Combined display() in Child Class:");
        System.out.println("From Interface2: I am display from Interface2");
        System.out.println("From Interface3: I am display from Interface3");
    }

    @Override
    public void calculateProgress() {
        System.out.println("Calculating progress...");
        System.out.println("Project: " + projectName + ", ID: " + projectId);
    }

    @Override
    public void generateReport() {
        System.out.println("Generating report...");
        System.out.println("Client: " + clientName + ", Location: " + clientLocation);
    }

    public static void main(String[] args) {
        Interface2_3_ChildClass child = new Interface2_3_ChildClass();

        // Calling display
        child.display();

        // Calling interface methods
        child.calculateProgress();
        child.generateReport();

        // Access static fields from interfaces (no need to create object)
        System.out.println("Static Data from Interfaces:");
        System.out.println("Project Name: " + Interface2.projectName);
        System.out.println("Client Name: " + Interface3.clientName);

        // Default method: must call explicitly from one interface or override in child
        child.commonFeature(); // ambiguous unless overridden, see note below
    }

     //if abstarct cannot directl call and work 
    //if can be ovveridemt then it can be same like display() and display dfferernt dislay from differenceonstances
    // Resolve default method ambiguity by overriding it
    @Override
    public void commonFeature() {
        Interface2.super.commonFeature();
        Interface3.super.commonFeature();
        System.out.println("Resolved common feature in child class.");
    }
}