//package Java_29_07;
//
//public class Exp_Handling {
//
//	public static void main(String[] args) {
//		
//
//        try{
//          int a=  100;
//          int b = 0;
//          
//          int c = a/b;
//
//          System.out.println(c);
//        } catch (ArithmeticException e){
//
//        	
//        	//print the trace of the exception
//        	System.out.println(e);
//        }
//
//	}
//
//}



package Java_29_07;

public class Exp_Handling {

    @SuppressWarnings("null")
	public static void main(String[] args) {

        try {
            // ArithmeticException: division by zero
            int a = 100;
            int b = 0;
            int c = a / b;
            System.out.println("Result of division: " + c);

            // NullPointerException: accessing length of null string
            String str = null;
            System.out.println("Length of string: " + str.length());

            // ArrayIndexOutOfBoundsException: accessing invalid index
            int[] arr = {1, 2, 3};
            System.out.println("Accessing invalid index: " + arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (Exception e) {
            // Generic catch for any other unexpected exceptions
            System.out.println("Caught general Exception: " + e);
        }

    }
}
