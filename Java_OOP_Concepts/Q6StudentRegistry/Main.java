package Java_OOP_Concepts.Q6StudentRegistry;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(12, "Shraddha");
        Student student2 = new Student(13, "Abhay");
        Student student3 = new Student(14, "Radha");
        Student student4 = new Student(15, "Krishan");
        Student student5 = new Student(16, "Shyam");

        student1.display();
        student2.display();
        student3.display();
        student4.display();
        student5.display();

        Student.getTotalStudents();
    }
}
