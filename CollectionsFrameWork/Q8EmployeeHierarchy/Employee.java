package CollectionsFrameWork.Q8EmployeeHierarchy;

public class Employee {
    private int empId;
    private String name;

    Employee(int empId,  String name){
        this.empId = empId;
        this.name = name;
    }
    
    public int getId(){
        return empId;
    }
    
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
