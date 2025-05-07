package lambdasfunction.dataprocessing.Q4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
          new Employee("Shraddha", "Engineering"),
          new Employee("Krishan", "HR"),
          new Employee("Radha", "Sales")
        );

        Map<String, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));
        System.out.println(countByDept);
    }
}
