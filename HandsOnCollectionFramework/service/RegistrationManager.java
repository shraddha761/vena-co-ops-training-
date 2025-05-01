package HandsOnCollectionFramework.service;

import HandsOnCollectionFramework.model.Course;
import HandsOnCollectionFramework.model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class RegistrationManager {
    private final CourseService courseService;
    private final StudentService studentService;

    public RegistrationManager(CourseService courseService, StudentService studentService) {
        this.courseService = courseService;
        this.studentService = studentService;
    }
//        * Enrolls a student into a course.
    public boolean registerStudentToCourse(String studentId, String courseId) {
        Student student = studentService.getStudentById(studentId);
        Course course = courseService.getCourse(courseId);
        if (course == null || student == null) return false;

        if (course.getEnrolledStudents().contains(student) || course.getWaitlist().contains(student)) {
            return false;
        }

        if (course.getEnrolledStudents().size() < course.getCapacity()) {
            return course.getEnrolledStudents().add(student);
        } else {
            return course.getWaitlist().offer(student);
        }
    }
//   Drops a student from a course.
    public void dropStudent(String studentId, String courseId) {
        Student student = studentService.getStudentById(studentId);
        Course course = courseService.getCourse(courseId);

        if (course == null || student == null) return;

        if (course.getEnrolledStudents().remove(student)) {
            Student next = course.getWaitlist().poll();
            if (next != null) {
                course.getEnrolledStudents().add(next);
            }
        } else {
            course.getWaitlist().remove(student);
        }
    }
    //List all the student by their course
    public List<Student> listStudentsByCourse(String courseId) {
        Course course = courseService.getCourse(courseId);
        return course == null ? Collections.emptyList() : new ArrayList<>(course.getEnrolledStudents());
    }

    // List all the student by branch
    public List<Student> listStudentsByBranch(String branch) {
        return courseService.getAllCourses().stream()
                .flatMap(course -> course.getEnrolledStudents().stream())
                .filter(student -> student.getBranch().equalsIgnoreCase(branch))
                .distinct()
                .collect(Collectors.toList());
    }

    // List all the Courses by student branch
    public List<Course> listCoursesByStudentBranch(String branch) {
        return courseService.getAllCourses().stream()
                .filter(course -> course.getEnrolledStudents().stream()
                        .anyMatch(student -> student.getBranch().equalsIgnoreCase(branch)))
                .distinct()
                .sorted(Comparator.comparing(Course::getCourseName).reversed())
                .collect(Collectors.toList());
    }
}
