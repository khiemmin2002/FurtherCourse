package Problem6;

/*
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

public interface AmountObserver {
  public int getUpperThreshold();
  public int getLowerThreshold();
  public void notifyMe(int amount);
}
