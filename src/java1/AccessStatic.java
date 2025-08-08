package java1;

public class AccessStatic {

    public static void main(String[] args) {
        // Accessing static variables from StaticVariables class directly
        System.out.println(StaticVariables.studentname);
        System.out.println(StaticVariables.studentid);

        // Accessing non-static variable (requires object)
        StaticVariables sv = new StaticVariables();
        System.out.println(sv.college);
    }
}
