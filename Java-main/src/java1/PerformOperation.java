package java1; 

public class PerformOperation { 

    public int x = 10; 
    public int y = 20;

    public void add() { 
        System.out.println("Addition: " + (x + y));
    }

  
    public void subtract() { 
        System.out.println("Subtraction: " + (y - x));
    }

    public void multiply() { 
        System.out.println("Multiplication: " + (x * y));
    }

    public void divide() { 
        if (x == 0) { 
            System.out.println("Error: Cannot divide by zero.");
        } else {
            System.out.println("Division: " + ((double) y / x));
        }
    }

    public static void main(String[] args) { 
        PerformOperation op = new PerformOperation(); 

        op.add(); 
        op.subtract(); 
        op.multiply(); 
        op.divide(); 
    }
}