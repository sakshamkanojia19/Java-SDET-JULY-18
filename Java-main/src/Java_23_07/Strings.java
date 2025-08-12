package Java_23_07;

public class Strings {

	public static void main(String[] args) {
		//3 kinds strings
		//Strings : sequence of chars stored 
		//zero based index
        //String  immutable in nature 
		// String Buffer
		//String Builder
		
		
		//Strings
		
		String S1 = "Saksham Kanojia";
		System.out.println(S1);
	
		
		//array chrs as strings
		//2
		char[] ch = {'h','e','o','i','u'};
		String S2 = new String(ch);
		
		System.out.println(S2);
		
		//s3
		String S3 = new String ("Saksham");
		System.out.println(S3);
		
		
		//String methods equals, Concatination , substring, contains, ends with join, compare to, split,
	
		//1
		String str1 = "Delhi";
		String str2 = "Bangalore";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		
		//2 concatentaion
		
		System.out.println(str1.concat(str2));
		
		
		//3 Contains
		System.out.println(str1.contains("z"));
		
		//4 Substring
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1.substring(1, 3));
		
		//5 replace
		
		System.out.println(str1.replace("i", "g"));
		
		System.out.println(str1.replaceAll(str1, "Pune"));
		
		
		//si empty
		
		System.out.println(str1.isEmpty());
		
//		ends with
		
		System.out.println(str1.endsWith("i"));
		
		//join
		
		String str3 = String.join("_", "city","Delhi");
		System.out.println(str3);
		
		//compare to is lexigraphical comparision
		
		System.out.println(str2.compareTo(str3));
		
		
		//split dividing on base of delimiter
		
		String text = "Java is a Programming language";
		String[] result = text.split(" ");
		for(String str : result) {
			System.out.println(str + ",");
		}
		
	}

}
