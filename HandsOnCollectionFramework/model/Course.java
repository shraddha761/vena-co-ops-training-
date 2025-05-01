package HandsOnCollectionFramework.model;

import HandsOnCollectionFramework.util.Validator;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Course {
    private final int capacity = 5;
    private final String courseId;
    private final String courseName;
    private final String instructorName;
    private final int credits;

    private final Set<Student> enrolledStudents = new HashSet<>();
    private final Queue<Student> waitlist = new LinkedList<>();

    public Course(String courseId, String courseName, String instructorName, int credits) {
        if (!Validator.isValidId(courseId)) {
            throw new IllegalArgumentException("Invalid Course ID");
        }
        if (!Validator.isValidName(courseName)) {
            throw new IllegalArgumentException("Invalid Course Name");
        }
        if (!Validator.isValidName(instructorName)) {
            throw new IllegalArgumentException("Invalid Instructor Name");
        }
        if (credits <= 0) {
            throw new IllegalArgumentException("Credits must be positive");
        }

        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.credits = credits;
    }

    public Set<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public Queue<Student> getWaitlist() {
        return waitlist;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructoreName() {
        return instructorName;
    }

    public int getCredits() {
        return credits;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Course && ((Course) o).getCourseId().equals(this.courseId);
    }

    @Override
    public int hashCode() {
        return courseId.hashCode();
    }
}
