package HandsOnCollectionFramework.model;

import java.util.Objects;
import java.util.Queue;
import java.util.TreeSet;

public class Student {
     private String studentId;
     private String name;
     private int year;
     private String email;
     private String branch;

    public Student(String studentId, String name, String email, int year, String branch) {
        this.studentId = studentId;
        this.name = name;
        this.year = year;
        this.email = email;
        this.branch = branch;
    }
    public String getBranch() {
        return branch;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return Objects.equals(studentId, s.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
