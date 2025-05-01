package HandsOnCollectionFramework.model;

import HandsOnCollectionFramework.util.Validator;

public class Student {
    private final String studentId;
    private final String name;
    private final String email;
    private final String branch;
    private final int year;

    public Student(String studentId, String name, String email, int year, String branch) {
        if (!Validator.isValidId(studentId)) {
            throw new IllegalArgumentException("Invalid Student ID");
        }
        if (!Validator.isValidName(name)) {
            throw new IllegalArgumentException("Invalid Student Name");
        }
        if (!Validator.isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid Email Format");
        }
        if (!Validator.isValidName(branch)) {
            throw new IllegalArgumentException("Invalid Branch");
        }

        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.branch = branch;
        this.year = year;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Student && ((Student) o).getStudentId().equals(this.studentId);
    }

    @Override
    public int hashCode() {
        return studentId.hashCode();
    }
}
