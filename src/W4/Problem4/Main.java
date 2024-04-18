package Problem4;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import Problem3.RMITStudent;

public class Main {
  public static void main(String[] args) {
    RMITStudent stu1 = new RMITStudent("s01", "Alice", 8.0, true);
    RMITStudent stu2 = new RMITStudent("s02", "Peter", 4.0, false);
    RMITStudent stu3 = new RMITStudent("s03", "Bob", 9.0, false);
    RMITStudent stu4 = new RMITStudent("s04", "Carl", 5.5, true);
    RMITStudent stu5 = new RMITStudent("s05", "Dennis", 6.5, true);

    List<RMITStudent> students = new ArrayList<RMITStudent>();
    students.add(stu1);
    students.add(stu2);
    students.add(stu3);
    students.add(stu4);
    students.add(stu5);
    
    RMITStudentGeneralCollection studentCollection = new RMITStudentHighGPACollection(students, "strict");
    Iterator<RMITStudent> it = studentCollection.iterator();
    while (it.hasNext()) {
      RMITStudent stu = it.next();
      System.out.println(stu);
    }
  }
}
