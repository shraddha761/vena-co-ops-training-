package CollectionsFrameWork.Q3DepartmentDirectory;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Employee>> deptDirectory = new TreeMap<>(Comparator.reverseOrder());
        Scanner scanner = new Scanner(System.in);
        
        List<Employee> allEmployees = Arrays.asList(
                new Employee("Shraddha", "HR", 70000),
                new Employee("Radha", "HR", 85000),
                new Employee("Kanha", "IT", 95000),
                new Employee("Krishan", "IT", 92000),
                new Employee("Pratham", "Finance", 88000),
        );

         for (Employee emp : allEmployees) {
            deptDirectory.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        for (List<Employee> empList : deptDirectory.values()) {
            empList.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
        }

        System.out.println("How many employees salary wants? " );
        int N = scanner.nextInt();

        if (n > employees.size()) {
          System.out.println("Requested top " + n + " employees, but only " + employees.size() + " are available.");
        }

       List<Employee> topPaid = getTopPaidEmployees(allEmployees, N);
        
        System.out.println("\n=== Top " + N + " Paid Employees Across All Departments ===");
        
        for (Employee emp : topPaid) {
            System.out.println(emp);
        }
    }
        public static List<Employee> getTopPaidEmployees(List<Employee> employees, int n) {
        return employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
                .limit(n)
                .toList();
    }
}
