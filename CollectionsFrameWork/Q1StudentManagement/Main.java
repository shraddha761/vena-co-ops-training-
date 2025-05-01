package CollectionsFrameWork.Q1StudentManagement;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(
                new Student(1, "Shraddha", 21, 9.8, "CSE"),
                new Student(2, "Ruhi", 21, 9.9, "EC"),
                new Student(3, "Ranjana", 21, 9.8, "ME"),
                new Student(4, "Pratham", 21, 9.9, "CSE"),
                new Student(5, "Sachin", 21, 9.9, "EC"),
                new Student(6, "Rajat", 21, 9.9, "CSE"),
                new Student(7, "Shivani", 21, 9.9, "CSE"),
                new Student(8, "Tanishka", 21, 9.9, "ME"),
                new Student(9, "Shivanshi", 21, 9.9, "CSE"),
                new Student(10, "Abhay", 21, 9.9, "EC"),
                new Student(11, "Gayatri", 21, 9.9, "ME"),
                new Student(12, "Ganga", 21, 9.9, "EC"),
                new Student(13, "Shanu", 21, 9.9, "ME"),
                new Student(14, "Radhe", 21, 9.9, "CSE"),
                new Student(15, "Kanha", 21, 9.9, "ME")
        ));
        students.sort(Comparator
                .comparing((Student s) -> s.branch) // sort by branch (ascending)
                .thenComparing(Comparator.comparing((Student s) -> s.grade).reversed()) // then by grade (descending)
        );

        Map<String, List<Student>> studentsByBranch = students.stream().collect(Collectors.groupingBy(s -> s.branch));

        for (Map.Entry<String, List<Student>> entry : studentsByBranch.entrySet()) {
            System.out.println("Branch: " + entry.getKey());
            for (Student s : entry.getValue()) {
                System.out.println("  " + s.name + " - Grade: " + s.grade);
            }
        }
    }
}