package Java_OOP_Concepts.Q5Abstraction;

public class Freelancer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Freelancer( int id, String name, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public String getDetails(){
        return "Freelancer " + id + " Name " + name + " Salary ";
    }
}
