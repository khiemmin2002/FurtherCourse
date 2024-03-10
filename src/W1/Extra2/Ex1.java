package W1.Extra2;

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
    public static void main(String[] args) {
        ex1();
    }
}
