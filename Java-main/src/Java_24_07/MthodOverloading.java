package Java_24_07;

public class MthodOverloading {
    /*
     * Method Overloading: Complie time Polymorphism
     * Multiple methods with the same name but different parameters within the same class.
     * 
     * Rules:
     * 1. Same method name
     * 2. Different number of parameters
     * 3. Different type of parameters
     * 4. Must be in the same class
     * 5. Different order of parameters
     */

    // method add with 2 int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // method add with 3 int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // method add with 2 double parameters
    public double add(double a, double b) {
        return a + b;
    }

    // method add with int and double (different order)
    public double add(int a, double b) {
        return a + b;
    }

    // method add with double and int (different order)
    public double add(double a, int b) {
        return a + b;
    }
    
  
    public static void main(String[] args) {
        MthodOverloading obj = new MthodOverloading();

        System.out.println("add(int, int): " + obj.add(1, 2));
        System.out.println("add(int, int, int): " + obj.add(1, 2, 3));
        System.out.println("add(double, double): " + obj.add(1.5, 2.5));
        System.out.println("add(int, double): " + obj.add(3, 4.5));
        System.out.println("add(double, int): " + obj.add(5.5, 2));
        
    }
}
