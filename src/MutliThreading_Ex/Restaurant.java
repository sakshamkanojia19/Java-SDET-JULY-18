package MutliThreading_Ex;

public class Restaurant {

	public static void main(String[] args) {
		Thread t1 = new CookingTask("Pasta");
		Thread t2 = new CookingTask("Dosa");
		Thread t3 = new CookingTask("Salad");
		
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		

	}

}
