package Java_24_07;

abstract  class Abstract_Classes {  


		// TODO Auto-generated method stub
        //Hiding implementation details
		/*
		 * Abstraction is a process of hiding the complex implementations and show only the ncessary feature to the end user
		 * Advantages what a object is doing now
		 * reduces the complexity
		 * provides security 
		 * 
		 * Abstract classes and Interfaces
		 * 
		 * Abstact class also class 1. it is defined using the abstract keyword if not behave like normal class;
		 * cannot create object for abstract class.
		 * how to access access in implementing or child or subclasses data of my abstact class.
		 * Abstract mentods : without thee body
		 * normal methods - with body
		 *  
		 *  what is allowed i abstract classes
		 *  1. abs methods are allowed
		 *  2. normal method are allowed
		 *  3. Constructors allowd
		 *  4. Instance vars
		 *  5. Static var allowed / static method
		 *  6. final methods
		 *  7. Access modifiers and methods and fields are allowed
		 *  8. Inheritance 
		 *  9. Interface implementation
		 *  10. Main method 
		 *  11 can extend abstract classes by other classes when define abstract
		 * 
		 *  * */
	
	abstract void makesound();
	
	public void eat() {
		System.out.println("Animal eats food");
	}
	
	
	Abstract_Classes(){
		System.out.println("creating Constrcutor");
		
	}

	
	
	//Instance variables
	public static String AnimalName = "Lion";
		
	//Final Variable
	
	private final String animalBehaviour = "roar";
	
	
	public static void main(String[] args) {
//		Can not create object of abstarct class
//		Abstract_Classes as = new Abstract_Classes();
	}
	
		

}
