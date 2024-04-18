package W3.question1;

public class SchoolSystem {


    public static void main(String[] args) {
        Researcher lecturer1 = new Lecturer("L001", "Alice", "Lecturer");
        Researcher lecturer2 = new Lecturer("L002", "Bob", "Senior Lecturer");
        Researcher student1 = new FullTimeStudent("Elanor", "Prof. Com", "S002");
        Researcher student2 = new FullTimeStudent("Frank", "BA", "S003");
        Researcher student3 = new FullTimeStudent("John", "BA", "S004");
        Researcher student4 = new FullTimeStudent("James", "BA", "S005");



        Project p1 = new Project("AI", 25000);
        Project p2 = new Project("ML", 34000);
        Project p3 = new Project("Cloud System", 40000);

        // Must display true
        boolean b = ((Lecturer) lecturer1).leadProject(p1);
        System.out.println(b + " Lecturer 1 is leading project 1");

        // Must display false (p1 has a leader already)
        b = ((Lecturer) lecturer2).leadProject(p1);
        System.out.println(b + " Lecturer 2 cant leading project 1");

        // Must display false (lecturer1 is leading a project)
        b = ((Lecturer) lecturer1).leadProject(p2);
        System.out.println(b);

        // Must display true
        b = ((FullTimeStudent) student1).joinProject(p1);
        System.out.println(b);

        // Must display true
        b = p1.addMember(student2);
        System.out.println(b);

        // Must display false (student2 is already in project p1)
        b = p2.addMember(student2);
        System.out.println(b);

        // Must display true
        b = lecturer2.joinProject(p1);
        System.out.println(b);

        // Must display false (lecturer2 is already in project p1)
        b = p1.addMember(lecturer2);
        System.out.println(b);

        // Must display lecturer1 as a leader and lecturer2 and two students as members
        System.out.println("\nProject 1 members: ");
        p1.addMember(student3);
        p1.displayMembers();

    }
}
