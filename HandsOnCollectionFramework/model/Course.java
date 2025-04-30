package HandsOnCollectionFramework.model;

import java.util.Objects;
import java.util.Queue;
import java.util.TreeSet;

public class Course {
    private String courseId;
    private String courseName;
    private String instructorName;
    private int credits;
    private TreeSet<Student> enrollStudents;
    private Queue<Student> waitListed;
    private int capacity = 5;

    public Course(String courseId, String courseName, String instructorName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }
    public String getInstructoreName(){
        return instructorName;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseId() {
        return courseId;
    }
    public TreeSet<Student> getEnrolledStudents() {
        return enrollStudents;
    }

    public Queue<Student> getWaitlist() {
        return waitListed;
    }

    public boolean isFull() {
        return enrollStudents.size() >= capacity;
    }

    public boolean enroll(Student student) {
        if (enrollStudents.contains(student)) return false;
        if (!isFull()) {
            return enrollStudents.add(student);
        } else {
            waitListed.offer(student);
            return false;
        }
    }

    public void drop(Student student) {
        if(enrollStudents.remove(student) && !waitListed.remove(student)) {
            Student promoted = waitListed.poll();
            enrollStudents.add(promoted);
        }
        else{
            waitListed.remove(student);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Course c = (Course) o;
        return Objects.equals(courseId, c.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }
}
