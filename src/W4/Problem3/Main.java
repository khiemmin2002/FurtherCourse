package Problem3;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    List<RMITStudent> students = new ArrayList<RMITStudent>();
    RMITStudent stu1 = new RMITStudent("s01", "Alice", 8.0, true);
    RMITStudent stu2 = new RMITStudent("s02", "Peter", 4.0, false);
    RMITStudent stu3 = new RMITStudent("s03", "Bob", 9.0, true);
    RMITStudent stu4 = new RMITStudent("s04", "Carl", 10.0, false);
    RMITStudent stu5 = new RMITStudent("s05", "Anders", 6.5, true);
    students.add(stu1);
    students.add(stu2);
    students.add(stu3);
    students.add(stu4);
    students.add(stu5);

  // In this code, the RMITStudentCollection is created
  // and used in the same place, so you may see no benefit
  // of the iterator pattern.
  //
  // However, most of the time, the code that uses
  // the iterator does not need to know how to construct
  // the container (i.e. RMITStudentCollection)
  // (the container was constructed elsewhere)
  // it just receives a container, and uses the iterator
  // to access the individual element.

    RMITStudentCollection studentCollection = new RMITStudentCollection(students);
    Iterator<RMITStudent> it = studentCollection.iterator();
    while (it.hasNext()) {
      RMITStudent stu = it.next();
      System.out.println(stu);
    }
  }
}
