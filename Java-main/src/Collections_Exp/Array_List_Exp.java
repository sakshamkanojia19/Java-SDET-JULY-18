package Collections_Exp;

import java.util.ArrayList;

public class Array_List_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Implementing class for Array list
		
		ArrayList<String> al = new ArrayList<String>();
		
		//Insertion of data
		
		al.add("Ravi");
		al.add("saksham");
		al.add("tina");
		al.add("Peter");
		al.add("Snajay");
		al.add("Rima");
		al.add("Ravi");
		al.add(null);
		
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		System.out.println(al.indexOf("Peter"));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(4));
		System.out.println(al);
		System.out.println(al.set(4, "King"));
		System.out.println(al);
		System.out.println(al.listIterator());
		System.out.println(al.size());
		
		
//		also have a method can make sync arraylist with thread synicung
	}

}
