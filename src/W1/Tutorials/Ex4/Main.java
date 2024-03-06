package W1.Tutorials.Ex4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("L001", "John", "Professor", new ArrayList<Research>());
        Lecturer lecturer2 = new Lecturer("L002", "Jane", "Associate Professor", new ArrayList<Research>());
        Lecturer lecturer3 = new Lecturer("L003", "Jack", "Lecturer", new ArrayList<Research>());
        Lecturer lecturer4 = new Lecturer("L004", "Jill", "Lecturer", new ArrayList<Research>());

        Research research1 = new Research("Research 1", new ArrayList<Lecturer>(), 100000);
        Research research2 = new Research("Research 2", new ArrayList<Lecturer>(), 200000);

        lecturer1.leadProject(research1);
        lecturer2.leadProject(research2);


        lecturer1.joinProject(research1);
        lecturer2.joinProject(research1);
        lecturer3.joinProject(research2);
        lecturer4.joinProject(research2);

        research1.displayMembers();
        research2.displayMembers();
    }
}
