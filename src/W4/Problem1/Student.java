package W4.Problem1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private String name;
    private String major;
    private double gpa;

    // Add a list of students
    private List<Student> students = new ArrayList<>();

    public Student() {
        this.id = "Default";
        this.name = "Default";
        this.major = "Default";
        this.gpa = 0.0;
    }

    public Student(String id, String name, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Add a student to the list
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return String.format("Student ID: %s, Name: %s, Major: %s, GPA: %.2f", getId(), getName(), getMajor(), getGpa());
    }
}
