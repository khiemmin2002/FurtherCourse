package W1.Extra2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.print("Enter a month: ");
        String month = scanner.next();

        if (year < 0)
            System.out.println("\nInvalid year.");

        int days = 0;
        switch (month) {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                days = 31;
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                days = 30;
                break;
            case "Feb":
                if (isLeapYear(year))
                    days = 29;
                else
                    days = 28;
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

        System.out.println(month + " " + year + " has " + days + " days");
    }

    // Write a program that prompts the user to enter three cities and display them in ascending order.
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        String[] cities = new String[3];

        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter city " + (i+1) + ": ");
            cities[i] = scanner.nextLine();
        }

        // Sorting the array in ascending order
//        for (int i = 0; i < cities.length; i++) {
//            for (int j = i+1; j < cities.length; j++) {
//                if (cities[i].compareTo(cities[j]) > 0) {
//                    String temp = cities[i];
//                    cities[i] = cities[j];
//                    cities[j] = temp;
//                }
//            }
//        }

        Arrays.sort(cities);

        System.out.println("The cities in ascending order are: ");
        for (String city : cities) {
            System.out.println(city);
        }
    }

    // Write a method that takes a string and returns its reverse
    public static void ex3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println("The reverse of the string is: " + reversed);
    }

    // A palindrome is a string that reads the same backward as forward when ignoring
    // punctuations, blanks and case difference
    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase().replaceAll("[^a-z]", "");

        StringBuilder reversed = new StringBuilder(str).reverse();
        if (str.contentEquals(reversed))
            System.out.println("The string is a palindrome");
        else
            System.out.println("The string is not a palindrome");
    }

    public static void main(String[] args) {
        ex4();
    }
}
