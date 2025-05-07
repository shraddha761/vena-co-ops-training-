package CollectionsFrameWork.Q1StudentManagement;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = createStudents(); 

        sortStudents(students); 
        Map<String, List<Student>> groupedByBranch = groupByBranch(students);
        printGroupedStudents(groupedByBranch);
    }

    private static List<Student> createStudents() {
        return new ArrayList<>(Arrays.asList(
                new Student("Shraddha", 21, 9.8, "CSE"),
                new Student("Ruhi", 21, 9.9, "EC"),
                new Student("Ranjana", 21, 9.8, "ME"),
                new Student("Pratham", 21, 9.9, "CSE"),
                new Student("Sachin", 21, 9.9, "EC"),
                new Student("Rajat", 21, 9.9, "CSE"),
                new Student("Shivani", 21, 9.9, "CSE"),
                new Student("Tanishka", 21, 9.9, "ME"),
                new Student("Shivanshi", 21, 9.9, "CSE"),
                new Student("Abhay", 21, 9.9, "EC"),
                new Student("Gayatri", 21, 9.9, "ME"),
                new Student("Ganga", 21, 9.9, "EC"),
                new Student("Shanu", 21, 9.9, "ME"),
                new Student("Radhe", 21, 9.9, "CSE"),
                new Student("Kanha", 21, 9.9, "ME")
        ));
    }

    private static void sortStudents(List<Student> students) {
        students.sort(Comparator
                .comparing(Student::getBranch)
                .thenComparing(Comparator.comparingDouble(Student::getGrade).reversed()));
    }

    private static Map<String, List<Student>> groupByBranch(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getBranch));
    }

    private static void printGroupedStudents(Map<String, List<Student>> groupedStudents) {
        for (Map.Entry<String, List<Student>> entry : groupedStudents.entrySet()) {
            System.out.println("Branch: " + entry.getKey());
            for (Student s : entry.getValue()) {
                System.out.println("  " + s);
            }
            System.out.println();
        }
    }
}
