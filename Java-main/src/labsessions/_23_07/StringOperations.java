package labsessions._23_07;

public class StringOperations {

	 public static void main(String[] args) {
	        String s1 = "Core Java";
	        String s2 = "Selenium";

	        // 1. equals and equalsIgnoreCase
	        System.out.println("1. equals: " + s1.equals(s2));                 // false
	        System.out.println("2. equalsIgnoreCase: " + s1.equalsIgnoreCase(s2)); // false

	        // 2. Concatenation
	        System.out.println("3. Concatenation: " + s1.concat(" ").concat(s2)); // Core Java Selenium

	        // 3. contains
	        System.out.println("4. Contains 'Java': " + s1.contains("Java"));  // true
	        System.out.println("5. Contains 'test': " + s1.contains("test"));  // false

	        // 4. Substring
	        System.out.println("6. Substring from index 5: " + s1.substring(5));   // Java
	        System.out.println("7. Substring(0, 4): " + s1.substring(0, 4));       // Core

	        // 5. Replace
	        System.out.println("8. Replace 'Java' with 'Python': " + s1.replace("Java", "Python")); // Core Python
	        System.out.println("9. Replace all with 'Test': " + s1.replaceAll(s1, "Test"));          // Test

	        // 6. isEmpty
	        System.out.println("10. Is s1 empty?: " + s1.isEmpty());             // false
	        System.out.println("11. Is new string empty?: " + "".isEmpty());     // true

	        // 7. endsWith
	        System.out.println("12. Ends with 'Java'?: " + s1.endsWith("Java")); // true
	        System.out.println("13. Ends with 'a'?: " + s1.endsWith("a"));       // true

	        // 8. join
	        String joined = String.join(" - ", s1, s2);
	        System.out.println("14. Joined string: " + joined);                  // Core Java - Selenium

	        // 9. compareTo (lexicographically)
	        System.out.println("15. compareTo: " + s1.compareTo(s2));            // < 0 (since "Core Java" < "Selenium")

	        // 10. split
	        String sentence = "Java is a powerful language";
	        String[] words = sentence.split(" ");
	        System.out.println("16. Split words:");
	        for (String word : words) {
	            System.out.println(word + ",");
	        }
	    }
}
