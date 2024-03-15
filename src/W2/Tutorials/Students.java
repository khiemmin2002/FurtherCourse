package W2.Tutorials;

public abstract class Students {
    private String studentId;
    private String fullName;
    private String major;

    public Students() {
        this.studentId = "Default";
        this.fullName = "Default";
        this.major = "Default";
    }

    public Students(String studentId, String fullName, String major) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void readStudentsFile() {
        // Read from students.txt
    }

    @Override
    public String toString() {
        return String.format("Student ID: %s, Full Name: %s, Major: %s", studentId, fullName, major);
    }
}
