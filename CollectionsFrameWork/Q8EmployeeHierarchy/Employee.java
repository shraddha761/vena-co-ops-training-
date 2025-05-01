package CollectionsFrameWork.Q8EmployeeHierarchy;

public class Employee {
    int empId;
    String name;

    Employee(int empId,  String name){
        this.empId = empId;
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
