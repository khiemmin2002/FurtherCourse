package W2.Tutorials;

public class FullTimeStudents extends Students {
    private Project project;

    public FullTimeStudents() {
        super();
        this.project = null;
    }

    public FullTimeStudents(String studentId, String fullName, String major, Project project) {
        super(studentId, fullName, major);
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public boolean joinProject

    @Override
    public String toString() {
        return "FullTimeStudents{" +
                "studentId='" + getStudentId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", major='" + getMajor() + '\'' +
                ", project=" + getProject().getName() +
                '}';
    }
}
