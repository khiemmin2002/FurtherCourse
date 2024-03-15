package W2.Tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchoolSystem {
    private static Students[] studentList = new Students[50];
    private  static int studentCount = 0;
    private  static Lecturers[] lecturerList = new Lecturers[50];
    private  static int lecturerCount = 0;
    private  static Project[] projectList = new Project[50];
    private  static int projectCount = 0;

    // Add a student to the studentList
    public static void addStudent(Students student) {
        studentList[studentCount++] = student;
    }

    // Add a lecturer to the lecturerList
    public static void addLecturer(Lecturers lecturer) {
        lecturerList[lecturerCount++] = lecturer;
    }

    // Add a project to the projectList
    public static void addProject(Project project) {
        projectList[projectCount++] = project;
    }




    // Main
    public static void main(String[] args) {
        SchoolSystem rmit = new SchoolSystem();

        FullTimeStudents stu1 = new FullTimeStudents("s123", "Zhao Lusi", "IT", null);
        FullTimeStudents stu2 = new FullTimeStudents("s124", "Ju Jingyi", "IT", null);
        FullTimeStudents stu3 = new FullTimeStudents("s125", "Erling Haaland", "SE", null);
        FullTimeStudents stu4 = new FullTimeStudents("s126", "Liu Yifei", "IT", null);
        FullTimeStudents stu5 = new FullTimeStudents("s127", "JENNIE", "SE", null);
        FullTimeStudents stu6 = new FullTimeStudents("s128", "ROSE", "DS", null);
        FullTimeStudents stu7 = new FullTimeStudents("s129", "LISA", "DS", null);
        FullTimeStudents stu8 = new FullTimeStudents("s130", "Ederson", "SE", null);

        PartTimeStudents stu9 = new PartTimeStudents("s131", "Lewis Hamilton", "IT", 0, 0);
        PartTimeStudents stu10 = new PartTimeStudents("s132", "Max Verstappen", "IT", 0, 0);
        PartTimeStudents stu11 = new PartTimeStudents("s133", "Charles Leclerc", "SE", 0, 0);
        PartTimeStudents stu12 = new PartTimeStudents("s134", "Lando Norris", "SE", 0, 0);

        Lecturers lec1 = new Lecturers("e123", "Pep Guardiola", "Professor");
        Lecturers lec2 = new Lecturers("e124", "Jurgen Klopp", "Associate Professor");
        Lecturers lec3 = new Lecturers("e125", "Chu Đình Nghiêm", "Lecturer");
        Lecturers lec4 = new Lecturers("e126", "Mikel Arteta", "Lecturer");
        Lecturers lec5 = new Lecturers("e127", "Erik Ten Hag", "Lecturer");

        Project project1 = new Project("RMIT-IT", 100000);
        Project project2 = new Project("RMIT-SE", 200000);
        Project project3 = new Project("RMIT-DS", 300000);

        // Add Full-time students (8 students: 3 IT, 3 SE, 2 DS), name: Kevin De Bruyne,
        rmit.addStudent(stu1);
        rmit.addStudent(stu2);
        rmit.addStudent(stu3);
        rmit.addStudent(stu4);
        rmit.addStudent(stu5);
        rmit.addStudent(stu6);
        rmit.addStudent(stu7);
        rmit.addStudent(stu8);

        // Add Part-time students (5 students: 2 IT, 2 SE, 1 DS), name: Lewis Hamilton, Max Verstappen, Charles Leclerc, Lando Norris, Daniel Ricciardo
        rmit.addStudent(stu9);
        rmit.addStudent(stu10);
        rmit.addStudent(stu11);
        rmit.addStudent(stu12);

        // Register hours for Part-time students
        stu9.registerHours(3, 4);
        stu10.registerHours(2, 5);
        stu11.registerHours(5, 6);
        stu12.registerHours(3, 5);

        // Add Lecturers (3 lecturers: 1 Professor, 1 Associate Professor, 1 Lecturer), name: Pep Guardiola, Jurgen Klopp, Chu Đình Nghiêm
        rmit.addLecturer(lec1);
        rmit.addLecturer(lec2);
        rmit.addLecturer(lec3);
        rmit.addLecturer(lec4);
        rmit.addLecturer(lec5);

        // Add Projects (3 projects: 1 IT, 1 SE, 1 DS), name: RMIT-IT, RMIT-SE, RMIT-DS
        rmit.addProject(project1);
        rmit.addProject(project2);
        rmit.addProject(project3);

        // Assign leaders for projects
        project1.assignLeader(lec1);
        project2.assignLeader(lec2);
        project3.assignLeader(lec3);

        // Assign members for projects
        project1.addMember(stu1);
        project1.addMember(stu2);
        project1.addMember(stu3);


        // Display all members in projects
        project1.displayMembers();

        // Write to file
        // Add all student objects to a list
        List<FullTimeStudents> students = Arrays.asList(stu1, stu2, stu3, stu4, stu5, stu6, stu7, stu8 );

        // Iterate over the list and call writeToFile for each student
        for (FullTimeStudents student : students) {
            student.writeToFile();
        }

        // Count the number of part-time students
        System.out.println("Number of part-time students is: " + PartTimeStudents.getCountPartTimeStudents());


    }

}
