package W4.Problem1;

public class Student {

    public String studentID;
    private String fullName;
    private String major;

    public Student() {
        this.studentID = null;
        this.fullName = null;
        this.major = null;
    }

    public Student(String studentID, String fullName, String major) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.major = major;
    }

    public String getStudentID() {
        return studentID;
    }


    public String getFullName() {
        return fullName;
    }


    public String getMajor() {
        return major;
    }

}
