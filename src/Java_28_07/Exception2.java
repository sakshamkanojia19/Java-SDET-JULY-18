//package Java_28_07;
//
//public class Exception2 {
//
//    public static void main(String[] args) {
//
//        try {
//            // Safe division (change to 1 / 0 to test ArithmeticException)
//            int result = 1 / 3;
//            System.out.println("Division result: " + result);
//
//            // Check if any command-line arguments are passed
//            if (args.length == 0) {
//                System.out.println("No command-line arguments provided.");
//            } else {
//                System.out.println("Number of arguments: " + args.length);
//                System.out.println("First argument: " + args[0]);
//            }
//
//        } 
//        catch (ArithmeticException e) {
//            System.out.println("Error: Can't divide by zero.");
//        } 
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Error: Tried to access an argument that doesn't exist.");
//        } 
//        catch (Throwable e) {
//            System.out.println("General Exception: " + e.getMessage());
//        } 
//        catch (Throwable t) {
//            System.out.println("Critical Error: " + t.getMessage());
//        }
//
//        System.out.println("Program ended safely.");
//    }
//}






package Java_28_07;

public class Exception2 {

    public static void main(String[] args) {

        try {
            // Safe division (change to 1 / 0 to test ArithmeticException)
            int result = 1 / 3;
            System.out.println("Division result: " + result);

            // Check if any command-line arguments are passed
            if (args.length == 0) {
                System.out.println("No command-line arguments provided.");
            } else {
                System.out.println("Number of arguments: " + args.length);
                System.out.println("First argument: " + args[0]);
            }

        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Can't divide by zero.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an argument that doesn't exist.");
        } 
        catch (Throwable t) {
            // This MUST be last, since it catches everything (including Exception)
            System.out.println("Unhandled exception occurred: " + t.getMessage());
        }

        System.out.println("Program ended safely.");
    }
}

