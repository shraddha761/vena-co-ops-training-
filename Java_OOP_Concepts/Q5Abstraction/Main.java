package Java_OOP_Concepts.Q5Abstraction;

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmp = new FullTimeEmployee(123, "Shraddha", 50000, 500);
        Employee freelancer = new Freelancer(4567, "krishan", 1000, 700);

        System.out.println(fullTimeEmp.getDetails());
        System.out.println("Salary: " + fullTimeEmp.calculateSalary());

        System.out.println();

        System.out.println(freelancer.getDetails());
        System.out.println("Salary: " + freelancer.calculateSalary());
    }
}
