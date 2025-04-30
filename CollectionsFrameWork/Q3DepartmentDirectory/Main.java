package CollectionsFrameWork.Q3DepartmentDirectory;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Employee>> employees = new TreeMap<>(Comparator.reverseOrder());
        Scanner scanner = new Scanner(System.in);
        addEmployee(employees, "HR" ,new Employee("Shraddha", 50000));
        addEmployee(employees, "IT", new Employee("Ruhi", 40000));
        addEmployee(employees,"CS", new Employee("Ranjana", 60000));
        addEmployee(employees, "CORE", new Employee("Pratham", 30000));
        addEmployee(employees, "SALES", new Employee("Rohit", 90000));
        System.out.println("How many employees salary wants? " );
        int n = scanner.nextInt();
        List<Employee> employee = employees.values().stream().flatMap(List::stream).sorted(Comparator.comparingDouble(e -> -e.salary)).limit(n).collect(Collectors.toList());

        for(Employee e: employee) {
            System.out.println(e.name);
        }
    }

    public static void addEmployee(Map<String, List<Employee>> employees, String department, Employee employee){
        employees.computeIfAbsent(department, k -> new ArrayList<>()).add(employee);
    }
}
