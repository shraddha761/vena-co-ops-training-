package HandsOnCollectionFramework;

import HandsOnCollectionFramework.model.Course;
import HandsOnCollectionFramework.model.Student;
import HandsOnCollectionFramework.service.CourseService;
import HandsOnCollectionFramework.service.RegistrationManager;
import HandsOnCollectionFramework.service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CourseService courseService = new CourseService();
        StudentService studentService = new StudentService();
        RegistrationManager manager = new RegistrationManager(courseService, studentService);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Course");
            System.out.println("2. Add Student");
            System.out.println("3. Register");
            System.out.println("4. Drop");
            System.out.println("5. List Students by Course");
            System.out.println("6. List Students by Branch");
            System.out.println("7. List Courses by Student");
            System.out.println("8. Filter Courses by Credit or Instructor");
            System.out.println("9. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter course ID, name, instructor, credits:");
                    String courseId = sc.next();
                    String courseName = sc.next();
                    String instructor = sc.next();
                    int credits = sc.nextInt();
                    courseService.addCourse(new Course(courseId, courseName, instructor, credits));
                    System.out.println("Course added.");
                    break;

                case 2:
                    System.out.println("Enter student ID, name, email, year, branch:");
                    String studentId = sc.next();
                    String name = sc.next();
                    String email = sc.next();
                    int year = sc.nextInt();
                    String branch = sc.next();
                    studentService.addStudent(new Student(studentId, name, email, year, branch));
                    System.out.println("Student added.");
                    break;

                case 3:
                    System.out.println("Enter student ID and course ID to register:");
                    studentId = sc.next();
                    courseId = sc.next();
                    boolean enrolled = manager.registerStudentToCourse(studentId, courseId);
                    System.out.println(enrolled ? "Enrolled successfully." : "Registration failed or waitlisted.");
                    break;

                case 4:
                    System.out.println("Enter student ID and course ID who wants to drop:");
                    studentId = sc.next();
                    courseId = sc.next();
                    manager.dropStudent(studentId, courseId);
                    System.out.println("Dropped!");
                    break;

                case 5:
                    System.out.println("Enter course ID:");
                    courseId = sc.next();
                    manager.listStudentsByCourse(courseId)
                            .forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("Enter branch:");
                    branch = sc.next();
                    manager.listStudentsByBranch(branch)
                            .forEach(System.out::println);
                    break;

                case 7:
                    System.out.println("Enter student ID:");
                    studentId = sc.next();
                    manager.listCoursesByStudentBranch(studentId)
                            .forEach(System.out::println);
                    break;

                case 8:
                    System.out.println("Enter credit and instructor name:");
                    int credit = sc.nextInt();
                    instructor = sc.next();
                    courseService.filterCoursesByCreditsOrInstructorName(credit, instructor)
                            .forEach(System.out::println);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
