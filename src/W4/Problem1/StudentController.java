package W4.Problem1;

import java.util.Map;
import java.util.Scanner;

public class StudentController {
    Student student;
    StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    public void eventLoop() {
        String answer = "Y";
        Scanner scanner = DataInput.getDataInput().getScanner();
        while (answer.equalsIgnoreCase("Y")) {
            Map<String, String> data = view.displayNewStudentForm();
            String id = data.get(StudentView.STUDENT_ID);
            String name = data.get(StudentView.STUDENT_NAME);
            String major = data.get(StudentView.STUDENT_MAJOR);

            student = new Student(id, name, major);
            view.display(student);

            System.out.println("Continue? ");
            answer = scanner.nextLine();
        }
    }
}
