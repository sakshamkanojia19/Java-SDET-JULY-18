//Approach 1

//package labsessions._18_07;
//
//public class Task2_DataTypes {
//    public static void main(String[] args) {
//        String s = "Hello";
//
//        // Only reference types (like String) can call getClass() directly.
//        System.out.println("Type of s: " + s.getClass().getSimpleName());
//
//        // Uncommenting the below will cause a compilation error:
//        // int x = 42;
//        // System.out.println("Type of x: " + x.getClass().getSimpleName());
//    }
//}


//Approach 2

package labsessions._18_07;

public class Task2_DataTypes {
    public static void main(String[] args) {
        String s = "Hello";
        int x = 42;
        float f = 3.14f;
        boolean b = true;
        char ch = 'A';

        // Cast primitives to Object to get their wrapper class type
        System.out.println("Type of s: " + ((Object)s).getClass().getSimpleName());
        System.out.println("Type of x: " + ((Object)x).getClass().getSimpleName());
        System.out.println("Type of f: " + ((Object)f).getClass().getSimpleName());
        System.out.println("Type of b: " + ((Object)b).getClass().getSimpleName());
        System.out.println("Type of ch: " + ((Object)ch).getClass().getSimpleName());
    }
}
