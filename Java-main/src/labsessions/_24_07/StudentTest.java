package labsessions._24_07;

abstract class Student {
    String name;
    int rollNo;

    // Constructor to initialize common fields
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Abstract method to be implemented by subclasses
    abstract void getGrade();
}

// EngineeringStudent subclass
class EngineeringStudent extends Student {
    int marks;

    // Constructor initializing base and own fields
    public EngineeringStudent(String name, int rollNo, int marks) {
        super(name, rollNo); // Call to parent constructor
        this.marks = marks;
    }

    // Implementing getGrade logic for engineering
    public void getGrade() {
        if (marks >= 85) {
            System.out.println(name + " (Engineering): Grade A");
        } else if (marks >= 70) {
            System.out.println(name + " (Engineering): Grade B");
        } else {
            System.out.println(name + " (Engineering): Grade C");
        }
    }
}

// MedicalStudent subclass
class MedicalStudent extends Student {
    int marks;

    public MedicalStudent(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    // Implementing getGrade logic for medical
    public void getGrade() {
        if (marks >= 90) {
            System.out.println(name + " (Medical): Grade A");
        } else if (marks >= 75) {
            System.out.println(name + " (Medical): Grade B");
        } else {
            System.out.println(name + " (Medical): Grade C");
        }
    }
}

// Main class to test student grades
public class StudentTest {
    public static void main(String[] args) {
        Student eng = new EngineeringStudent("Alice", 101, 88);
        Student med = new MedicalStudent("Bob", 202, 78);

        eng.getGrade(); // Output: Alice (Engineering): Grade A
        med.getGrade(); // Output: Bob (Medical): Grade B
    }
}