package Problem5;

/*
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

public class Swordsman extends Hero {
  private static final double DISTANCE_ATTACK_RATIO = 0.04;
  private static final double CLOSE_COMBAT_RATIO = 0.35;

  public Swordsman(String name, double strength) {
    super(name, strength);
  }

  @Override
  public double distanceAttack() {
    return strength * DISTANCE_ATTACK_RATIO;
  }

  @Override
  public double closeCombat() {
    return strength * CLOSE_COMBAT_RATIO;
  }
}
