package W2.Tutorials;

public class Ex1 {
    public static void main(String[] args) {
        Students stu1 = new PartTimeStudents("s123","Ronaldo", "IT", 3, 6 );
        Students stu2 = new PartTimeStudents("s456","Messi", "SE", 2, 4 );

        System.out.println(PartTimeStudents.getCountPartTimeStudents());

        PartTimeStudents stu3 = new PartTimeStudents("s789","Neymar", "CS", 1, 3 );

        SchoolSystem rmit = new SchoolSystem();
        rmit.addStudent(stu1);
        rmit.addStudent(stu2);
        rmit.addStudent(stu3);

        rmit.displayStudents();


    }
}
