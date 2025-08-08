package Java_23_07;

public class StringBuilderExample {

	  public static void main(String[] args) {

	        // Create a StringBuilder with initial value
	        StringBuilder sb = new StringBuilder("Hello");
	        System.out.println("Original: " + sb);

	        // 1. append() - Adds text at the end
	        sb.append(" World");
	        System.out.println("After append: " + sb); // Hello World

	        // 2. reverse() - Reverses the characters in the builder
	        sb.reverse();
	        System.out.println("After reverse: " + sb); // dlroW olleH

	        // Reverse it back to original
	        sb.reverse();

	        // 3. insert() - Insert text at a specific index
	        sb.insert(5, ", Java");
	        System.out.println("After insert: " + sb); // Hello, Java World

	        // 4. delete(start, end) - Deletes characters from start to end-1
	        sb.delete(5, 11);
	        System.out.println("After delete: " + sb); // Hello World

	        // 5. substring(start) - Returns a substring from given index to end
	        String sub1 = sb.substring(6);
	        System.out.println("Substring from index 6: " + sub1); // World

	        // 6. substring(start, end) - Returns a substring between start and end
	        String sub2 = sb.substring(0, 5);
	        System.out.println("Substring from 0 to 5: " + sub2); // Hello

	        // 7. replace(start, end, str) - Replaces part of text from start to end with new string
	        sb.replace(6, 11, "Java");
	        System.out.println("After replace: " + sb); // Hello Java

	        // 8. charAt(index) - Returns the character at a specific index
	        System.out.println("Char at index 1: " + sb.charAt(1)); // e

	        // 9. indexOf(str) - Returns index of first occurrence of a substring
	        System.out.println("Index of 'Java': " + sb.indexOf("Java")); // 6

	        // 10. length() - Returns the number of characters
	        System.out.println("Length of builder: " + sb.length()); // 10

	        // 11. repeat() - Not directly in StringBuilder. Convert to String first
	        String repeated = sb.toString().repeat(2);
	        System.out.println("Repeated builder: " + repeated); // Hello JavaHello Java

	        // 12. isEmpty() - No direct method, use length == 0
	        System.out.println("Is builder empty?: " + (sb.length() == 0)); // false
	    }

}
