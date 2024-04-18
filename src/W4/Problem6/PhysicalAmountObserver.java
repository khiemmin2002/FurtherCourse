package Problem6;

/*
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

public class PhysicalAmountObserver implements AmountObserver{
  final int upperThreshold;
  final int lowerThreshold;
  final String name;

  public PhysicalAmountObserver(String name, int upperThreshold, int lowerThreshold) {
    this.name = name;
    this.upperThreshold = upperThreshold;
    this.lowerThreshold = lowerThreshold;
  }

  @Override
  public int getLowerThreshold() {
    return lowerThreshold;
  }

  @Override
  public int getUpperThreshold() {
    return upperThreshold;
  }

  @Override
  public void notifyMe(int amount) {
    if (amount < lowerThreshold) {
      System.out.printf("%s: Amount %d is lower than lower thresold %d\n",
                        name, amount, lowerThreshold);
    } else if (amount > upperThreshold) {
      System.out.printf("%s: Amount %d is higher than upper thresold %d\n",
                        name, amount, upperThreshold);
    }
  }
}
