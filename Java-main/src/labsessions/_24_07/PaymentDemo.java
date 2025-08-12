package labsessions._24_07;

//Base class
class Payment {
 public void pay() {
     System.out.println("Payment method not specified.");
 }

 public void pay(double amount) {
     System.out.println("Paying amount: ₹" + amount + " using default method.");
 }
}

//Child class 1
class CreditCard extends Payment {
 @Override
 public void pay() {
     System.out.println("Payment done using Credit Card.");
 }

 public void pay(double amount, String cardNumber) {
     System.out.println("Paying ₹" + amount + " using Credit Card number: " + cardNumber);
 }
}

//Child class 2
class UPI extends Payment {
 @Override
 public void pay() {
     System.out.println("Payment done using UPI.");
 }

 public void pay(double amount, String upiId) {
     System.out.println("Paying ₹" + amount + " via UPI ID: " + upiId);
 }
}

//Child class 3
class NetBanking extends Payment {
 @Override
 public void pay() {
     System.out.println("Payment done using Net Banking.");
 }

 public void pay(double amount, String bankName, String accountNumber) {
     System.out.println("Paying ₹" + amount + " through Net Banking - Bank: " + bankName + ", Account: " + accountNumber);
 }
}

//Main class (must match file name)
public class PaymentDemo {
 public static void main(String[] args) {
     Payment p;

     p = new CreditCard();
     p.pay();
     ((CreditCard)p).pay(5000.00, "1234-5678-9012-3456");

     p = new UPI();
     p.pay();
     ((UPI)p).pay(2500.00, "Saksham@upi");

     p = new NetBanking();
     p.pay();
     ((NetBanking)p).pay(10000.00, "BANK OF Baroada", "9876543210");
 }
}
