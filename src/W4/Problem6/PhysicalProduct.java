package Problem6;

/*
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

import java.util.ArrayList;
import java.util.List;

public class PhysicalProduct extends Product {
  List<AmountObserver> peopleWhoCare;
  
  public PhysicalProduct() {
    peopleWhoCare = new ArrayList<AmountObserver>();
  }

  public void wantToJoin(AmountObserver ob) {
    peopleWhoCare.add(ob);
  }

  public void wantToLeave(AmountObserver ob) {
    peopleWhoCare.remove(ob);
  }

  @Override
  public void setNewAmount(int amount) {
    super.setNewAmount(amount);
    for (AmountObserver amountObserver : peopleWhoCare) {
      if (amountObserver.getLowerThreshold() > amount
         || amountObserver.getUpperThreshold() < amount) {
        amountObserver.notifyMe(amount);    
      }
    }
  }
}
