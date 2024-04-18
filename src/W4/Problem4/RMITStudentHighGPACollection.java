package Problem4;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.util.List;
import java.util.Iterator;
import Problem3.RMITStudent;

public class RMITStudentHighGPACollection extends RMITStudentGeneralCollection {
  private List<RMITStudent> students;
  private String condition;

  // Iterator class for problem2
  static class RMITStudentIteratorProblem2 implements Iterator<RMITStudent> {
    private int position;
    private List<RMITStudent> iteratorStudents;

    public RMITStudentIteratorProblem2(List<RMITStudent> students) {
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

  // Iterator class for problem3
  class RMITStudentIteratorProblem3 implements Iterator<RMITStudent> {
    private int position;
    private List<RMITStudent> iteratorStudents;
    private final double MIN_GPA = 6.5;

    public RMITStudentIteratorProblem3(List<RMITStudent> students) {
      this.position = 0;
      this.iteratorStudents = students;
    }

    @Override
    public boolean hasNext() {
      int tmpPosition = position;
      while (tmpPosition < iteratorStudents.size()) {
        if (iteratorStudents.get(tmpPosition).getIsShared() && iteratorStudents.get(tmpPosition).getGpa() >= MIN_GPA) {
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
        if (currStudent.getIsShared() && currStudent.getGpa() >= MIN_GPA) {
          return currStudent;
        }
      }
      return null;
    }
  }

  public RMITStudentHighGPACollection(List<RMITStudent> students, String condition) {
    this.students = students;
    this.condition = condition;
  }

  // iterator() is a factory method that works based on the condition.
  @Override
  public Iterator<RMITStudent> iterator() {
    if (condition.toLowerCase().contains("strict")) {
      return new RMITStudentIteratorProblem3(students);
    }
    return new RMITStudentIteratorProblem2(students);
  }
}
