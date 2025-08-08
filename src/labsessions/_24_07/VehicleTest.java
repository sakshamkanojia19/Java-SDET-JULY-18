package labsessions._24_07;

//File: VehicleTest.java

//Abstract class Vehicle (base class for all vehicles)
abstract class Vehicle {
 // Abstract method to be implemented by subclasses
 abstract void move();
}

//Sub class Car extending Vehicle
class Car extends Vehicle {
 public void move() {
     System.out.println("Car is moving on four wheels");
 }
}

//Subclass Bike extending Vehicle
class Bike extends Vehicle {
 public void move() {
     System.out.println("Bike is moving on two wheels");
 }
}

//Subclass Bus  extending Vehicle
class Bus extends Vehicle {
 public void move() {
     System.out.println("Bus is moving on six wheels");
 }
}

//Main class to test the Vehicle system
public class VehicleTest {
 public static void main(String[] args) {
     Vehicle car = new Car();   // Abstract class reference to Car object
     Vehicle bike = new Bike(); // Abstract class reference to Bike object
     Vehicle bus = new Bus();   // Abstract class reference to Bus object

     car.move();  // Output: Car is moving on four wheels
     bike.move(); // Output: Bike is moving on two wheels
     bus.move();  // Output: Bus is moving on six wheels
 }
}
