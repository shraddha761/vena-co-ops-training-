package Java_OOP_Concepts.Q6StudentRegistry;

public class Student {
    public int id;
    public String name;
    public static int counter;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        counter++;
    }

    void display(){
        System.out.println(id + " " + name);
    }
     static void getTotalStudents(){
        System.out.println("Total students: " + counter);
    }
}
