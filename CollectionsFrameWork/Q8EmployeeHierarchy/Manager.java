package CollectionsFrameWork.Q8EmployeeHierarchy;

public class Manager {
    private String name;

    Manager(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(name, manager.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
