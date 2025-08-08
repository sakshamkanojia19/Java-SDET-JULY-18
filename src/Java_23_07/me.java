package Java_23_07;

public class me extends Father{

	 void showMyTraits() {
	        System.out.println("Me: Learning and growing.");
	    }
	 
	public static void main(String[] args) {
		 me obj = new me();

	        obj.showGrandfatherTraits(); // inherited from Grandfather
	        obj.showFatherTraits();      // inherited from Father
	        obj.showMyTraits(); 

	}

}
