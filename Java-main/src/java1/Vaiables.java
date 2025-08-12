package java1;

public class Vaiables {

    // Method with local variables
    public void studentinfo() {
        // Local variables: only accessible inside this method
        int a = 8;
        int b = 9;
        int c = a + b;

        // Cannot declare static variables inside methods
        // static String s1 = "shd";  // Invalid inside method

        System.out.println("Sum in studentinfo(): " + c);
    }

    public void add1() {
        // c is not defined here; it was local to studentinfo()
        // So the following line would cause a compile error if uncommented:
        // System.out.println(c);  // ❌ Not accessible

        // We can declare our own local variables here
        int x = 5;
        int y = 10;
        int z = x + y;

        System.out.println("Sum in add1(): " + z);
    }

    public static void main(String[] args) {
        // Creating object to call instance methods
        Vaiables lv = new Vaiables();

        // Call methods
        lv.studentinfo();
        lv.add1();
    }
}
