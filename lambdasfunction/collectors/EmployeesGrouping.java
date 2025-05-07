package lambdasfunction.collectors;

import java.util.*;
import java.util.stream.Collectors;

class Employees {
    private String name;
    private int joiningYear;
    private double salary;

    Employees(String name, int joiningYear, double salary) {
        this.name = name;
        this.joiningYear = joiningYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getJoiningYear() {
        return joiningYear;
    }
    public double getSalary() {
        return salary;
    }
}
public class EmployeesGrouping {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("Shraddha", 2020, 70000),
                new Employees("krishan", 2021, 80000),
                new Employees("Radha", 2020, 75000),
                new Employees("Pratham", 2021, 85000)
        );

        Map<Integer, Optional<Employees>> maxSalaryByYear = employees.stream()
                .collect(Collectors.groupingBy(
                        Employees::getJoiningYear,
                        Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary))
                ));

        System.out.println("Max Salary By Joining Year: ");
        for(Map.Entry<Integer, Optional<Employees>> entry : maxSalaryByYear.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().map(Employees::getName).orElse("No Employee"));
        }
    }
}
