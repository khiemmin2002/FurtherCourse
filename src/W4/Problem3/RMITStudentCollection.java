package Problem3;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.util.List;
import java.util.Iterator;

public class RMITStudentCollection {
  private List<RMITStudent> students;

  static class RMITStudentIterator implements Iterator<RMITStudent> {
    private int position;
    private List<RMITStudent> iteratorStudents;

    public RMITStudentIterator(List<RMITStudent> students) {
      this.position = 0;
      this.iteratorStudents = students;
    }

    @Override
    public boolean hasNext() {
      int tmpPosition = position;
      while (tmpPosition < iteratorStudents.size()) {
        if (iteratorStudents.get(tmpPosition).getIsShared()) {
          return true;
        }
        tmpPosition++;
      }
      return false;
    }

    @Override
    public RMITStudent next() {
      while (position < iteratorStudents.size()) {
        RMITStudent currStudent = iteratorStudents.get(position);
        position++;
        if (currStudent.getIsShared()) {
          return currStudent;
        }
      }
      return null;
    }
  }

  public RMITStudentCollection(List<RMITStudent> students) {
    this.students = students;
  }

  public Iterator<RMITStudent> iterator() {
    return new RMITStudentIterator(students);
  }
}
