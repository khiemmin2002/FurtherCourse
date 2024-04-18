package Problem5;

/*
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class HeroGroup implements Attackable{
  List<Attackable> heroes;

  public HeroGroup() {
    heroes = new ArrayList<Attackable>();
  }

  public void addMember(Attackable hero) {
    heroes.add(hero);
  }

  @Override
  public double distanceAttack() {
    double sum = 0;
    Iterator<Attackable> it = heroes.iterator();
    while (it.hasNext()) {
      sum += it.next().distanceAttack();
    }
    return sum;
  }

  @Override
  public double closeCombat() {
    double sum = 0;
    Iterator<Attackable> it = heroes.iterator();
    while (it.hasNext()) {
      sum += it.next().closeCombat();
    }
    return sum;
  }
}
