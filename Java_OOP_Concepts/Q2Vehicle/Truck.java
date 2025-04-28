package Java_OOP_Concepts.Q2Vehicle;

public class Truck extends Vehicle {
    private double loadWeight;

    public Truck(int speed, int fuelCapacity, double loadWeight) {
        super(speed, fuelCapacity);
        this.loadWeight = loadWeight;
    }

    public double getMileage() {
        double baseMileage = 5.0;
        return baseMileage * (1 - (loadWeight * 0.1)) * (1 - (speed / 150.0));
    }
}
