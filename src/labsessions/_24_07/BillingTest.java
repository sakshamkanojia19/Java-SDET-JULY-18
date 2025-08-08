package labsessions._24_07;


//Abstract class for general Bill
abstract class Bill {
 // Abstract method to be implemented by subclasses
 abstract void generateBill();
}

//ElectricityBill class extending Bill
class ElectricityBill extends Bill {
 public void generateBill() {
     System.out.println("Electricity Bill Generated: ₹1500");
 }
}

//WaterBill class extending Bill
class WaterBill extends Bill {
 public void generateBill() {
     System.out.println("Water Bill Generated: ₹500");
 }
}

//Main class to test the billing system
public class BillingTest {
 public static void main(String[] args) {
     Bill eb = new ElectricityBill(); // Abstract class reference to ElectricityBill object
     Bill wb = new WaterBill();       // Abstract class reference to WaterBill object

     eb.generateBill(); // Output: Electricity Bill Generated: ₹1500
     wb.generateBill(); // Output: Water Bill Generated: ₹500
 }
}