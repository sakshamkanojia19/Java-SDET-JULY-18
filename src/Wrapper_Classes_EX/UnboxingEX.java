package Wrapper_Classes_EX;

public class UnboxingEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Unboxing = Converting wrapper objects to primitive types.
         * It's similar to typecasting in C++, where objects are converted
         *  back to raw types.
		 * 
		 * we use these generics in collection too
		 * 
		 * */
		
		//Unboxing
		
		Integer a = new Integer(3);
		
		int i = a.intValue();
		
		int j = a;
		
		System.out.println(i);
		System.out.println(j);
	
		
		 //wrapper class objects
		
		  Byte byteObj = 10;
	        Short shortObj = 100;
	        Integer intObj = 72;
	        Long longObj = 123456789L;
	        Float floatObj = 12.34f;
	        Double doubleObj = 45.67;
	        Character charObj = 'A';
	        Boolean boolObj = true;
	        
	        // Unboxing (object to primitive)
	        byte b = byteObj;
	        short s = shortObj;
	        int k = intObj;
	        long l = longObj;
	        float f = floatObj;
	        double d = doubleObj;
	        char c = charObj;
	        boolean bool = boolObj;
	        
	        
	        System.out.println("byte primitive: " + b);
	        System.out.println("short primitive: " + s);
	        System.out.println("int primitive: " + k);
	        System.out.println("long primitive: " + l);
	        System.out.println("float primitive: " + f);
	        System.out.println("double primitive: " + d);
	        System.out.println("char primitive: " + c);
	        System.out.println("boolean primitive: " + bool);
	
		
	
	}

}
