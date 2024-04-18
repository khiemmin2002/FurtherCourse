package Problem3;

/**
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

public class RMITStudent {
  private String id;
  private String name;
  private double gpa;
  private boolean isShared;

  public RMITStudent(String id, String name, double gpa, boolean isShared) {
    this.id = id;
    this.name = name;
    this.gpa = gpa;
    this.isShared = isShared;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getGpa() {
    return gpa;
  }
  
  public boolean getIsShared() {
    return isShared;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  public void setIsShared(boolean isShared) {
    this.isShared = isShared;
  }

  @Override
  public String toString() {
    return String.format("ID=%s, Name=%s, Gpa=%f, isShared=%b", id, name, gpa, isShared);
  }
}
