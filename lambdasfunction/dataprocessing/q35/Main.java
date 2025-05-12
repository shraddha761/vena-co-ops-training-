package lambdasfunction.dataprocessing.q35;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Shraddha", "Engineering", 50000),
                new Employee("Krishan", "HR", 100000),
                new Employee("Radha", "Sales", 900000)
        );

        Map<String, Double> employeeMap = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println(employeeMap);
    }
}
