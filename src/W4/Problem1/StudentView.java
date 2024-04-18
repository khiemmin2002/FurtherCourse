package W4.Problem1;

import java.util.Map;

public abstract class StudentView {

    public static final String STUDENT_ID = "STUDENT_ID";
    public static final String STUDENT_NAME = "FULL_NAME";
    public static final String STUDENT_MAJOR = "MAJOR";

    public abstract void display(Student s);

    public abstract Map<String, String> displayNewStudentForm();

}
