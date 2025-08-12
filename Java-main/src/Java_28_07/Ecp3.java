package Java_28_07;



public class Ecp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {
			 System.out.println(100/0);
		 }
		 catch(Throwable e){
			 
			 //1using getMessage()
			 System.out.println(e.getMessage());
			 //2 printing exception class object
			 System.out.println(e);
			 
			 //using printStackTrace();
			 
			 e.printStackTrace();
			 
		 }
		
	}

}
