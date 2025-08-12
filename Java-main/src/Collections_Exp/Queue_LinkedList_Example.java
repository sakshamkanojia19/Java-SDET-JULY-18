package Collections_Exp;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<String> lang = new LinkedList<>(); //Interface
		//can work with Queue interface
		
		//add elements
		
		lang.add("Python");
		lang.add("Java");
		lang.add("C");
		lang.add("C++");
		lang.add("Javascript");
		
		//access
		
		System.out.println(lang);
		
		lang.peek();
		System.out.println(lang.peek());

		//remove head of the queue
		
		System.out.println(lang.remove("C"));
		System.out.println(lang);
		
		System.out.println(lang.poll());
		
		
		
		
		
	}

}
