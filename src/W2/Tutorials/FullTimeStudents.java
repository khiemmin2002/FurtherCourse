package W2.Tutorials;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FullTimeStudents extends Students implements Researcher {
    private static final Logger LOGGER = Logger.getLogger(FullTimeStudents.class.getName());
    private Project project;
    private String researchProfile;

    public FullTimeStudents() {
        super();
        this.project = null;
    }

    public FullTimeStudents(String studentId, String fullName, String major) {
        super(studentId, fullName, major);
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
    public void readStudentsFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./src/W2/Tutorials/students.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] studentInfo = line.split(", ");
                System.out.println(String.format("Student ID: %s, Full Name: %s, Major: %s, Project: %s", studentInfo[0], studentInfo[1], studentInfo[2], studentInfo[3]));
            }
            reader.close();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "An error occurred while reading the file.", e);
        }
    }

    @Override
    public void setProfile(String profile) {
        this.researchProfile = "Student(" + profile + ")";
    }

    @Override
    public String getProfile() {
        return this.researchProfile;
    }

    @Override
    public String toString() {
        return String.format("Student ID: %s, Full Name: %s, Major: %s, Project: %s", getStudentId(), getFullName(), getMajor(), getProject());
    }
}
