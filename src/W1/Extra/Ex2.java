package W1.Extra;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean status = true;
        int num;


        while (status) {
            System.out.print("Enter a positive integer: ");
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("Goodbye!");
                status = false;
            } else {
                if (num % 5 == 0 && num % 6 == 0) {
                    System.out.println(num + " is divisible by both 5 and 6");
                } else if (num % 5 == 0 || num % 6 == 0) {
                    System.out.println(num + " is divisible by 5 or 6, but not both");
                } else {
                    System.out.println(num + " is neither divisible by 5 nor 6");
                }
            }
        }
    }
}
