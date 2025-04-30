package CollectionsFrameWork.Q15CollegeSubjectAllotment;

public class Main {
    public static void main(String[] args) {
        SubjectAllotment subjectAllotment = new SubjectAllotment();

        subjectAllotment.addSubjectAllotment("Shraddha", "Java");
        subjectAllotment.addSubjectAllotment("Shraddha", "Spring boot");
        subjectAllotment.addSubjectAllotment("Pratham", "React");
        subjectAllotment.addSubjectAllotment("Ruhi", "Python");
        subjectAllotment.addSubjectAllotment("Ranjana", "Node.js");

        subjectAllotment.showStudentSubject();
        subjectAllotment.showSubjectToStudent();
    }
}
