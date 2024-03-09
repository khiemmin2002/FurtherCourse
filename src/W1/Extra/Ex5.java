package W1.Extra;

import java.util.Scanner;

public class Ex5 {
    // Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        while (num < 1 || num > 15) {
            System.out.print("Enter an integer from 1 to 15: ");
            num = scanner.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            // Print spaces
            for (int j = num - i; j > 0; j--) {
                System.out.print("   ");
            }
            // Print decreasing numbers
            for (int k = i; k > 0; k--) {
                System.out.printf("%3d", k);
            }
            // Print increasing numbers
            for (int l = 2; l <= i; l++) {
                System.out.printf("%3d", l);
            }
            System.out.println();
        }
    }
}
