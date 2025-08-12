package Java_23_07;

public class String_Buffer_Builder {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        sb.append(" World");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        sb.insert(5, ", Java");
        System.out.println(sb);

        sb.delete(5, 11);
        System.out.println(sb);

        System.out.println(sb.substring(6));
        System.out.println(sb.substring(0, 5));

        sb.replace(6, 11, "Java");
        System.out.println(sb);

        System.out.println(sb.charAt(1));
        System.out.println(sb.indexOf("Java"));
        System.out.println(sb.length());

        String repeated = sb.toString().repeat(2);
        System.out.println(repeated);

        System.out.println(sb.length() == 0);
        
        
        System.out.println(sb.repeat("Java", 3));
    }
}
