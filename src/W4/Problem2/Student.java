package W4.Problem2;

import java.util.ArrayList;
import java.util.List;

public abstract class Student {

    private String studentID;
    private String fullName;
    private String major;
    private List<String> courses;

    public Student() {
        this.studentID = null;
        this.fullName = null;
        this.major = null;
        this.courses = new ArrayList<String>();
    }

    public Student(String studentID, String fullName, String major, List<String> courses) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.major = major;
        this.courses = courses;
    }

    public abstract double calcFee();

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
