package HandsOnCollectionFramework.service;

import HandsOnCollectionFramework.model.Course;

import java.util.*;
import java.util.stream.Collectors;

public class CourseService {
    private final Map<String, Course> courseMap = new HashMap<>();

    // Add student to course
    public void addCourse(Course course) {
        if (course == null || courseMap.containsKey(course.getCourseId())) return;
        courseMap.put(course.getCourseId(), course);
    }

    // Get course by course id
    public Course getCourse(String courseId) {
        return courseMap.get(courseId);
    }

    // filter courses by credits and instructor name
    public List<Course> filterCoursesByCreditsOrInstructorName(int credits, String instructor) {
        return courseMap.values().stream()
                .filter(course -> course.getCredits() == credits || course.getInstructoreName().equalsIgnoreCase(instructor))
                .collect(Collectors.toList());
    }

    // Get All courses
    public Collection<Course> getAllCourses() {
        return courseMap.values();
    }
}
