package Java_22_07;

public class Operators {

	public static void main(String[] args) {
	
		
		//unary
		int i = 10;
		i++;
		// i++ 
		
		System.out.println(i);
		
		i--;
		
		System.out.println(i);
		
		++i;
		
		System.out.println(i);
		
		//Arithmetic Operators
		
		int a = 10,b=20;
		
		int c = a+b;
		int d = a+b;
		int e = a-b;
		int f = a/b;
		int g =  a*b;
		
		System.out.println(g);
		
		
		//shift operators  biwise operator shift bits
		
		//left shift  <<
		
		System.out.println(10<<2); // 10 * 2^2 = 40
		System.out.println(10<<3);
		
		//right shift >>
		
		System.out.println(10>>2); //now it is division  10/2^2 = 2
		System.out.println(20>>2);  // 20/2^2 = 20/4 = 5
		
		
		
		
		//Relational Operators > <  >= <=  != ==
		
		int num1 = 20;
		int num2 = 150;
		
		  System.out.println("num1 == num2 : " + (num1 == num2)); // Checks if num1 is equal to num2
	        System.out.println("num1 != num2 : " + (num1 != num2)); // Checks if num1 is not equal to num2
	        System.out.println("num1 > num2 : " + (num1 > num2));   // Checks if num1 is greater than num2
	        System.out.println("num1 < num2 : " + (num1 < num2));   // Checks if num1 is less than num2
	        System.out.println("num1 >= num2 : " + (num1 >= num2)); // Checks if num1 is greater than or equal to num2
	        System.out.println("num1 <= num2 : " + (num1 <= num2)); // Checks if num1 is less than or equal to num2

	        
	        
	        //Bitwise Operators
	        
	        int p = 5; //0101
	        int q = 3;  //0011
	        
	        int r = p & q;
	        System.out.println(r); //0001
	        
	        // int 8 and 2 
	        int pp = 8; //1000
	        int qq = 3; //0010
	        int rr = pp & qq;
	        System.out.println(rr);
	        
	        
	        //bitwise OR
	        //should present in any one now
	        
	        int p1 = 5; //0101
	        int q1 = 3;  //0011
	        
	        int r1 = p1 | q1;
	        System.out.println(r1); 
	        
	        
	        //XOR setting one ot both
	        
	        int x = 8; //1000
	        int y = 2; //0010
	        
	        int w = x ^ y;
	        
	        System.out.println(w);

	        
             //Logical Operators &&, || , !
	        
	        
	        int u = 10;
	        int v  = 20;
	        
	        if(u<v && v>15) {
	        	System.out.println("both cond true");
	        }
	        
	        //OR any one is true
	        
	        int age = 25;
	        
	        if(age<18 || age>21) {
	        	System.out.println("Your adult");
	        }
	        
  		   //Not oeprator ! reverse logical state of Operand
	        
	        boolean isRaining = false;
	        if(!isRaining) {
	        	System.out.println("You can go out");
	        }

	        
	        
	        //asignment operator
	        
	        int k=10;
	        int l=20;
	        
	        k+=4;//
	        
	        System.out.println(k);
	        
	        l-=4;
	        System.out.println(l);
	        
	        
	        
	        
	        //ternory oprator
	        
	        int w1 = 10, w2 = 20;
	        
	        int max = (w1>w2) ? w1:w2;
	        System.out.println(max);
	}

}
