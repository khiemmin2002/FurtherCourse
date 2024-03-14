package W2.Tutorials;

import java.util.ArrayList;

public class SchoolSystem {
    private Students[] studentList = new Students[50];
    private int studentCount = 0;
    private Lecturers[] lecturerList = new Lecturers[50];
    private int lecturerCount = 0;
    private Project[] projectList = new Project[50];
    private int projectCount = 0;

    // Add a student to the studentList
    public void addStudent(Students student) {
        studentList[studentCount++] = student;
    }

    // Add a lecturer to the lecturerList
    public void addLecturer(Lecturers lecturer) {
        lecturerList[lecturerCount++] = lecturer;
    }

    // Add a project to the projectList
    public void addProject(Project project) {
        projectList[projectCount++] = project;
    }

}
