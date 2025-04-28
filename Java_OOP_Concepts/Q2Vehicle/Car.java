package Java_OOP_Concepts.Q2Vehicle;

public class Car extends Vehicle {
    private double engineEfficiency;

    public Car(int speed, int fuelCapacity, double engineEfficiency) {
        super(speed, fuelCapacity);
        this.engineEfficiency = engineEfficiency;
    }

    public double getMileage() {
        return engineEfficiency * (1 - (speed / 200.0));
    }
}
