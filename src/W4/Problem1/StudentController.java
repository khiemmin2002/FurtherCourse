package W4.Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private Student model;
    private StudentView view;
    private List<Student> students = new ArrayList<>();

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentId(String id) {
        model.setId(id);
    }

    public String getStudentId() {
        return model.getId();
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentMajor(String major) {
        model.setMajor(major);
    }

    public String getStudentMajor() {
        return model.getMajor();
    }

    public void setStudentGpa(double gpa) {
        model.setGpa(gpa);
    }

    public double getStudentGpa() {
        return model.getGpa();
    }

    // Ask users to enter the student's information
    public void inputStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student major: ");
        String major = scanner.nextLine();
        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        Student student = new Student(id, name, major, gpa);
        students.add(student);
    }

    // Method to update view for all students
    public void updateView() {
        for (Student student : students) {
            view.printStudentDetails(student.getId(), student.getName(), student.getMajor(), student.getGpa());
        }
    }
}
