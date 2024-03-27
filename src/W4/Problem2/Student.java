package W4.Problem2;

import java.util.List;

public abstract class Student {
    private String id;
    private String name;
    private double gpa;
    private List<String> courses;

    public Student(String id, String name, double gpa, List<String> courses) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.courses = courses;
    }

    public double calcFee() {
        return 0.0;
    }
}