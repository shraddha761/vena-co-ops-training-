package CollectionsFrameWork.Q8EmployeeHierarchy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Demo1");
        Manager m2 = new Manager("Demo2");

        EmployeeHierarchy system = new EmployeeHierarchy();

        system.addEmployee(m1, 1, new Employee(12, "Temp1"));
        system.addEmployee(m2, 2, new Employee(13,"Temp2"));
        system.addEmployee(m1, 1, new Employee(14, "Temp3"));
        system.addEmployee(m2, 2, new Employee(15, "Temp4"));
        system.addEmployee(m1, 2, new Employee(16, "Temp5"));

       system.printHierarchy();

    }
}
