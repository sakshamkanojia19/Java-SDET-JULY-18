package MutliThreading_Ex;

class Single_main_Thread extends Thread{

	 public void run() {
	        System.out.println("Thread is running: " + Thread.currentThread().getName());
	    }
	
}

 class Test3 {

    public static void main(String[] args) {
        NewThread_Example airAsia = new NewThread_Example();
        airAsia.setName("Air Asia Thread");

        NewThread_Example indigo = new NewThread_Example();
        indigo.setName("Indigo Thread");

        airAsia.start();
        indigo.start();
    }
}