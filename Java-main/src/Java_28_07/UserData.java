package Java_28_07;

public class UserData {
public void checkUser(String user)
{
	String[] users = {"admi","super","java"};
	
	if(user != null) {
		for(String usr: users) {
			if(usr.equals((user)){
				throw(new UserNameNotAvlException("not avaialable"));
			}
		}
	}
}

public class TestDemo{
	
	
	
	Scanner sc = new Scanner;
			
	
			private void syso() {
				// TODO Auto-generated method stub

			}
			
//			also can use try catch 
			
}

}
