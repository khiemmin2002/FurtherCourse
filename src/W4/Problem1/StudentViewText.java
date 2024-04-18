package W4.Problem1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentViewText extends StudentView{


    @Override
    public void display(Student student) {
        System.out.println("Begin console view:");
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Student Name: " + student.getFullName());
        System.out.println("Student Major: " + student.getMajor());
        System.out.println("End console view:");
        System.out.println();
    }

    @Override
    public Map<String, String> displayNewStudentForm() {
        Scanner scanner = DataInput.getDataInput().getScanner();
        Map<String, String> data = new HashMap<>();
        System.out.println("New Student Form: ");
        System.out.println("Enter student id: ");
        data.put(STUDENT_ID, scanner.nextLine());
        System.out.println("Enter student name: ");
        data.put(STUDENT_NAME, scanner.nextLine());
        System.out.println("Enter student major: ");
        data.put(STUDENT_MAJOR, scanner.nextLine());
        return data;
    }
}
