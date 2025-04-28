package Java_OOP_Concepts.Q5Abstraction;

public class FullTimeEmployee extends Employee {
    private String name;
    private double monthlySalary;
    private double bonous;

    public FullTimeEmployee(int id, String name, double monthlySalary, double bonus) {
        super(name, id);
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.bonous = bonus;
    }

    public double calculateSalary() {
        return monthlySalary + bonous;
    }

    public String getDetails(){
        return "Full Time Employee " + id + " Name " + name + " Salary " + monthlySalary + " Bonus " + bonous;
    }
}
