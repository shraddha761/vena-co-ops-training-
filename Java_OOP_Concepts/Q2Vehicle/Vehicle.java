package Java_OOP_Concepts.Q2Vehicle;

public abstract class Vehicle {
    int speed;
    int fuelCapacity;

    public Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public abstract double getMileage();
}
