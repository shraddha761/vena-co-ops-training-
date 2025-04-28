package Java_OOP_Concepts.Q5Abstraction;

public abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
    public abstract String getDetails();
}
