package labsessions._23_07;

public class StringBuffer {

    public static void main(String[] args) {

        java.lang.StringBuffer sb = new java.lang.StringBuffer("Hello");
        System.out.println("Original: " + sb);

        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        sb.reverse();
        sb.insert(5, ", Java");
        System.out.println("After insert: " + sb);

        sb.delete(5, 11);
        System.out.println("After delete: " + sb);

        String sub1 = sb.substring(6);
        System.out.println("Substring from index 6: " + sub1);

        String sub2 = sb.substring(0, 5);
        System.out.println("Substring from 0 to 5: " + sub2);

        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        System.out.println("Char at index 1: " + sb.charAt(1));
        System.out.println("Index of 'Java': " + sb.indexOf("Java"));
        System.out.println("Length of buffer: " + sb.length());

        String repeated = sb.toString().repeat(2);
        System.out.println("Repeated buffer: " + repeated);

        System.out.println("Is buffer empty?: " + (sb.length() == 0));
    }
}
