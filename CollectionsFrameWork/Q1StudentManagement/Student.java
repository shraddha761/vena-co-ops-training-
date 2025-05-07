package CollectionsFrameWork.Q1StudentManagement;

public class Student {
    private static int counter = 1;
    private int id;
    private String name;
    private int age;
    private double grade;
    private String branch;

    Student(String name, int age, double grade, String branch) {
        this.id = counter++;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.branch = branch;
    }
    public double getGrade() {
        return grade;
    }

    public String getBranch() {
        return branch;
    }
}
