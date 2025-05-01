package HandsOnCollectionFramework.service;

import HandsOnCollectionFramework.model.Student;

import java.util.*;

public class StudentService {
    private final Map<String, Student> studentMap = new HashMap<>();

    public void addStudent(Student student) {
        if (student == null || studentMap.containsKey(student.getStudentId())) return;
        studentMap.put(student.getStudentId(), student);
    }

    // Get student by Id
    public Student getStudentById(String studentId) {
        return studentMap.get(studentId);
    }

    public Collection<Student> getAllStudents() {
        return studentMap.values();
    }
}
