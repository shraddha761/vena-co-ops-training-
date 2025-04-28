package Java_OOP_Concepts.Q2Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(80, 50, 15.0);
        Truck truck = new Truck(60, 150, 5);

        System.out.printf("Car mileage: %.2f km/L%n", car.getMileage());
        System.out.printf("Truck mileage: %.2f km/L%n", truck.getMileage());
    }
}
