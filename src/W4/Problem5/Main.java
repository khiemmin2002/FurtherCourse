package Problem5;

/*
 * @author COSC2440 Teaching Team
 * @version 1.0
*/

public class Main {
  public static void main(String[] args) {
    Attackable bowMan = new Bowman("Alice", 100);
    Attackable swordsMan = new Swordsman("Bob", 200);

    Attackable smallGroup = new HeroGroup();
    ((HeroGroup)smallGroup).addMember(bowMan);
    ((HeroGroup)smallGroup).addMember(swordsMan);

    Attackable bigGroup = new HeroGroup();
    ((HeroGroup)bigGroup).addMember(bowMan);
    ((HeroGroup)bigGroup).addMember(swordsMan);
    ((HeroGroup)bigGroup).addMember(smallGroup);

    System.out.printf("distanceAttack for bowMan: %.2f\n", bowMan.distanceAttack());
    System.out.printf("distanceAttack for swordsMan: %.2f\n", swordsMan.distanceAttack());
    System.out.printf("distanceAttack for smallGroup: %.2f\n", smallGroup.distanceAttack());
    System.out.printf("distanceAttack for bigGroup: %.2f\n", bigGroup.distanceAttack());
    System.out.println();

    System.out.printf("closeCombat for bowMan: %.2f\n", bowMan.closeCombat());
    System.out.printf("closeCombat for swordsMan: %.2f\n", swordsMan.closeCombat());
    System.out.printf("closeCombat for smallGroup: %.2f\n", smallGroup.closeCombat());
    System.out.printf("closeCombat for bigGroup: %.2f\n", bigGroup.closeCombat());
  }
}
