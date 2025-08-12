package Java_29_07;

public class NullPointer_Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // when there is empty called null pointer programmm is tryin to read a no refernece
		
		
		try {
			String S1 = null;
			System.out.println(S1.length());
		}catch(Exception e) {
			System.out.println(e);
		} finally {
			//mandatory code
			//closing of browsers
			//closing of db connection
			//API Connection Closing
			System.out.println("This is a mandatory code");
		}
		
	}

}
