package W2.Tutorials;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FullTimeStudents extends Students {
    private static final Logger LOGGER = Logger.getLogger(FullTimeStudents.class.getName());
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

    public boolean joinProject(Project p) {
        if (this.project == null) {
            this.project = p;
            return true;
        }
        return false;
    }

    // Write student info into a file in the format of "studentId,fullName,major,project"
    public void writeToFile() {
        String filePath = "./src/W2/Tutorials/students.txt";
        String content = String.format("%s, %s, %s, %s%n", getStudentId(), getFullName(), getMajor(), (getProject() != null ? getProject().getName() : "No Project"));

        try (FileWriter fileWriter = new FileWriter(filePath, true)) { // true to append to the file
            fileWriter.write(content);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "An error occurred while writing to the file.", e);
        }
    }


    @Override
    public String toString() {
        return String.format("Student ID: %s, Full Name: %s, Major: %s, Project: %s", getStudentId(), getFullName(), getMajor(), getProject());
    }
}
