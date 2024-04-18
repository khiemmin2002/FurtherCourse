package Problem5;

/*
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

public abstract class Hero implements Attackable {
  protected String name;
  protected double strength;

  public Hero(String name, double strength) {
    this.name = name;
    this.strength = strength;
  }
}
