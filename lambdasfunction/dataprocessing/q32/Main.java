package lambdasfunction.dataprocessing.q32;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Shraddha", 90),
                new Student("Krishan", 100),
                new Student("Radha", 101),
                new Student("Pratham", 95)
        );

        List<String> topStudents = students.stream()
                .filter(s -> s.getGrade() > 80)
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(topStudents);
    }
}
