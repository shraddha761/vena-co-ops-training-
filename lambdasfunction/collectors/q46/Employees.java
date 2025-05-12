package lambdasfunction.collectors.q46;

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
