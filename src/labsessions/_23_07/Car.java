package labsessions._23_07;

public class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive(); // Output: Repairing a car
    }
}
