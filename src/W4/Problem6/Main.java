package Problem6;

/*
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

public class Main {
  public static void main(String[] args) {
    PhysicalProduct digitalProduct = new PhysicalProduct();
    AmountObserver observer1 = new PhysicalAmountObserver("Observer1", 20, 10);
    AmountObserver observer2 = new PhysicalAmountObserver("Observer2", 30, 5);
    
    digitalProduct.wantToJoin(observer1);
    digitalProduct.wantToJoin(observer2);
    digitalProduct.setNewAmount(39);
    digitalProduct.setNewAmount(29);
    digitalProduct.setNewAmount(19);
    digitalProduct.setNewAmount(9);
    digitalProduct.setNewAmount(1);

    digitalProduct.wantToLeave(observer1);
    digitalProduct.wantToLeave(observer2);
    digitalProduct.setNewAmount(39);
    digitalProduct.setNewAmount(29);
    digitalProduct.setNewAmount(19);
    digitalProduct.setNewAmount(9);
    digitalProduct.setNewAmount(1);
  }
}
