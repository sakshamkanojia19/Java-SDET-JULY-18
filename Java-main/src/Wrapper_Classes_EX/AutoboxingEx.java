package Wrapper_Classes_EX;

public class AutoboxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * wrapper class convert primitive data type into object
		 * 
		 * wrapping basic data type small to capital <String> called generics
		 * 
		 * ArrayList<String> 
		 * 
		 * wrapper is a process of converting primitive data types (char,decimal,int) convert into objects
		 * 
		 * we have 8 wrapper classes :  Byte, Boolean, Char, Double, float, Integer, Long, short
		 * 
		 * wrapping  :Autoboxing
		 * unwrapping  : Unboxing
		 * 
		 * */
		//Autoboxing convert data type to object 
		
		int a = 72;
		
		//Autoboxing
		
//		Integer i = Integer.valueOf(a);  internal how it happens
		
		Integer i = a;
		System.out.println(i);
		
		
		
		 byte b = 10;
	        Byte byteObj = b;  // Autoboxing
	        System.out.println("Byte object: " + byteObj);

	        short s = 100;
	        Short shortObj = s;
	        System.out.println("Short object: " + shortObj);

	        int k = 72;
	        Integer intObj = k;
	        System.out.println("Integer object: " + intObj);

	        long l = 123456789L;
	        Long longObj = l;
	        System.out.println("Long object: " + longObj);

	        float f = 12.34f;
	        Float floatObj = f;
	        System.out.println("Float object: " + floatObj);

	        double d = 45.67;
	        Double doubleObj = d;
	        System.out.println("Double object: " + doubleObj);

	        char c = 'A';
	        Character charObj = c;
	        System.out.println("Character object: " + charObj);

	        boolean bool = true;
	        Boolean boolObj = bool;
	        System.out.println("Boolean object: " + boolObj);
		
		

	}

}
