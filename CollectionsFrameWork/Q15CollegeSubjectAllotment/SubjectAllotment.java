package CollectionsFrameWork.Q15CollegeSubjectAllotment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubjectAllotment {
    Map<String, List<String>> subjectAllotment = new HashMap<>();

    void addSubjectAllotment(String student , String subject) {
        subjectAllotment.computeIfAbsent(student, k -> new ArrayList<>()).add(subject);
    }

    public Map<String, List<String>> reverseLookup() {
        Map<String, List<String>> subjectToStudent = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : subjectAllotment.entrySet()) {
            String student = entry.getKey();
            for(String subject : entry.getValue() ) {
                subjectToStudent.computeIfAbsent(subject, k -> new ArrayList<>()).add(student);
            }
        }
        return subjectToStudent;
    }

    void showStudentSubject(){
        System.out.println("Student -> Subject");
        subjectAllotment.forEach( (student, subjects) -> System.out.println(student + "-> " + subjects));
    }

    void showSubjectToStudent(){
        System.out.println("Subject -> Student");
        Map<String, List<String>> subjectToStudent= reverseLookup();
        subjectToStudent.forEach( (subject, student ) -> System.out.println(subject + "-> " + student));
    }
}
