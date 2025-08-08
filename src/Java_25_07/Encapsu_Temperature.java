package Java_25_07;

public class Encapsu_Temperature {

	
	 // Private field
    private double celsius;

    // Setter with validation
    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println(" Temperature below absolute zero is not allowed.");
        }
    }

    // Fahrenheit conversion
    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    // Kelvin conversion
    public double toKelvin() {
        return celsius + 273.15;
    }

    // Show temperature
    public void display() {
        System.out.println("Celsius: " + celsius);
        System.out.println(" Fahrenheit: " + toFahrenheit());
        System.out.println(" Kelvin: " + toKelvin());
    }

    public static void main(String[] args) {
        Encapsu_Temperature t1 = new Encapsu_Temperature();
        t1.setCelsius(25);  // valid
        t1.display();

        System.out.println("--------");

        Encapsu_Temperature t2 = new Encapsu_Temperature();
        t2.setCelsius(-300);  // invalid
        t2.display();  // will show 0.0 because it was never set
    }
	
}
