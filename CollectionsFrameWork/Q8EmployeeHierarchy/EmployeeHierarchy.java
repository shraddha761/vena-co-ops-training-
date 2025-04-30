package CollectionsFrameWork.Q8EmployeeHierarchy;

import java.util.*;

public class EmployeeHierarchy {
    Map<Manager, TreeMap<Integer, List<Employee>>> hierarchy = new HashMap<>();

    void addEmployee(Manager m, int level, Employee e) {
        hierarchy.computeIfAbsent(m, k -> new TreeMap<>())
                .computeIfAbsent(level, k -> new ArrayList<>())
                .add(e);
    }
    void printHierarchy() {
        for (Map.Entry<Manager, TreeMap<Integer, List<Employee>>> entry : hierarchy.entrySet()) {
            TreeMap<Integer, List<Employee>> levels = entry.getValue();
            Manager manager = entry.getKey();
            System.out.println("Manager " + manager.name);
            for (Map.Entry<Integer, List<Employee>> level : levels.entrySet()) {
                List<Employee> employees = level.getValue();
                System.out.println("Level" + level.getKey() + " " + employees);
            }
            System.out.println();
        }
    }
}
