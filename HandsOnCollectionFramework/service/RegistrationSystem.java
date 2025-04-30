package HandsOnCollectionFramework.service;

import HandsOnCollectionFramework.model.Course;
import HandsOnCollectionFramework.model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class RegistrationSystem {
    Map<String, Course> courseMap = new HashMap<>();
    Map<String, Student> studentMap = new HashMap<>();

    public void addCourse(Course course) {
        courseMap.put(course.getCourseId(), course);
    }
    public void addStudent(Student student) {
        studentMap.put(student.getStudentId(), student);
    }

    public boolean registerStudentToCourse(String studentId, String courseId){
        Student student = studentMap.get(studentId);
        Course course = courseMap.get(courseId);

        if (student == null || course == null) return false;
        if(course.getEnrolledStudents().contains(student) || course.getWaitlist().contains(student)){
            return false;
        }
        return course.enroll(student);
    }

    public void  dropCourse(String studentId, String courseId) {
        Course course = courseMap.get(courseId);
        Student student = studentMap.get(studentId);
        if (student != null || course != null) {
            course.drop(student);
        }
    }

    public List<Student> listStudentByCourse(String courseId) {
        Course course = courseMap.get(courseId);
        return course == null ? new ArrayList<>() : new ArrayList<>(course.getEnrolledStudents());
    }

    public List<Student> listStudentByBranch(String branch) {
        return courseMap.values().stream()
                .flatMap(course -> course.getEnrolledStudents().stream())
                .filter(student -> student.getBranch().equalsIgnoreCase(branch))
                .collect(Collectors.toList());
    }

    public List<Course> listCourseByStudent(String branch) {
        List<Course> result = new ArrayList<>();
        for(Course course : courseMap.values()){
            for(Student student : course.getEnrolledStudents()){
                if(student.getBranch().equalsIgnoreCase(branch)){
                    result.add(course);
                }
            }
        }
        result.sort((a,b) -> b.getCourseName().compareTo(a.getCourseName()));
        return result;
    }

    public List<Course> filterCoursesByCreditsOrInstructor(int credits, String instructor) {
        List<Course> filtered = new ArrayList<>();
        for(Course course : courseMap.values()){
            if(course.getCredits() == credits || course.getInstructoreName().equalsIgnoreCase(instructor)){
                filtered.add(course);
            }
        }
        return filtered;
    }

    public Map<String, List<Course>> groupCoursesByInstructor() {
        Map<String, List<Course>> instructorCourseMap = new HashMap<>();

        for (Course course : courseMap.values()) {
            instructorCourseMap
                    .computeIfAbsent(course.getInstructoreName(), k -> new ArrayList<>())
                    .add(course);
        }
        return instructorCourseMap;
    }
}
