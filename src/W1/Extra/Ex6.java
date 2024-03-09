package W1.Extra;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double xCoord1, yCoord1, radius1, xCoord2, yCoord2, radius2;
        System.out.print("Enter circle 1 center x-, y-coordinates, and radius: ");
        xCoord1 = scanner.nextDouble();
        yCoord1 = scanner.nextDouble();
        radius1 = scanner.nextDouble();
        System.out.print("Enter circle 2 center x-, y-coordinates, and radius: ");
        xCoord2 = scanner.nextDouble();
        yCoord2 = scanner.nextDouble();
        radius2 = scanner.nextDouble();

        double distance = Math.sqrt(Math.pow(xCoord2 - xCoord1, 2) + Math.pow(yCoord2 - yCoord1, 2));

        if (distance <= Math.abs(radius1 - radius2)) {
            System.out.println("Circle 2 is inside circle 1");
        } else if (distance <= radius1 + radius2) {
            System.out.println("Circle 2 overlaps circle 1");
        } else {
            System.out.println("Circle 2 does not overlap circle 1");
        }

    }
}
