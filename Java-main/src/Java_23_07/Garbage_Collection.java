package Java_23_07;

public class Garbage_Collection {

    // This method is called by the garbage collector before object is destroyed
//    @Override
	
	//null refernce
	// reassiging the refernce
	//object is out scope
	
    public void finalize()  {
        System.out.println("Garbage collected for object: ");
    }

    public static void main(String[] args) {

        // Creating object and making it eligible for GC by nullifying the reference
        Garbage_Collection obj = new Garbage_Collection();
        obj = null;

        // Making obj1 eligible for GC by assigning its reference to another object
        Garbage_Collection obj1 = new Garbage_Collection();
        Garbage_Collection obj2 = new Garbage_Collection();
        obj1 = obj2;
        
        //Object is out of scope 
        Garbage_Collection obj4 = new Garbage_Collection();
        

        // Requesting JVM to run Garbage Collector
//        System.gc(); //recommended
        Runtime.getRuntime().gc();
    }
}
