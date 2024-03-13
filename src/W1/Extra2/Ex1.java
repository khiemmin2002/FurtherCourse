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

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list: ");
        String[] list = scanner.nextLine().split(" ");

        int[] arr = new int[Integer.parseInt(list[0])];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(list[i+1]);
        }

        // Check if the array is sorted in ascending order
        boolean isSorted = true;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted)
            System.out.println("The list is already sorted");
        else
            System.out.println("The list is not sorted");

        // Print the array
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void ex6() {
        // Define the range of the random integers.
        int min = 0;
        int max = 9;
        int range = max - min + 1; // The range is 'max' - 'min' + 1 to include both the min and max values.

        // Initialize an array to store the count of each number.
        // The size is 'max + 1' because we want to include the number 'max' as an index.
        int[] numbers = new int[max + 1];

        // Loop 100 times to generate 100 random integers.
        for (int i = 0; i < 100; ++i) {
            // Generate a random integer between min (inclusive) and max (inclusive).
            int rand = (int) (Math.random() * range) + min;

            // Increment the count for the generated number in the 'numbers' array.
            numbers[rand] += 1;
        }

        // Loop over the possible numbers from min to max to display their counts.
        for (int i = min; i <= max; ++i) {
            // If the count for a number is more than 0, print it.
            // This check is optional because we're generating 100 numbers from 0 to 9,
            // so all counts should be more than 0, but it's a good check to have in general.
            if (numbers[i] > 0)
                System.out.println(i + ": " + numbers[i]);
        }
    }

    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter scores: ");
        String[] list = scanner.nextLine().split(" ");

        int[] scores = new int[list.length];

       int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(list[i]);
            sum += scores[i];
        }

        int average = sum / scores.length;

        int above = 0;
        int below = 0;

        for (int score : scores) {
            if (score >= average)
                above++;
            else
                below++;
        }

        System.out.println("The average is " + average);
        System.out.println("The number of scores above or equal to the average is " + above);
        System.out.println("The number of scores below the average is " + below);
    }

    public static void ex8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        String[] list = scanner.nextLine().split(" ");

        int[] numbers = new int[list.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(list[i]);
        }

        // Find the distinct numbers and count the number of distinct numbers
        int[] distinct = new int[numbers.length];
        int count = 0;

        for (int number : numbers) {
            boolean isDistinct = true;
            for (int j : distinct) {
                if (number == j) {
                    isDistinct = false;
                    break;
                }
            }

            if (isDistinct) {
                distinct[count] = number;
                count++;
            }
        }

        // Print the count of distinct numbers
        System.out.println("The number of distinct numbers is " + count);

        // Print the distinct numbers
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinct[i] + " ");
        }
    }

    public static void ex9() {
        // Write a program that reads a list of integers between 1 and 100 then counts the occurrences of each number.
        // The input ends when the input is 0.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers between 1 and 100: ");
        String[] list = scanner.nextLine().split(" ");

        int[] numbers = new int[101];

        for (String s : list) {
            int number = Integer.parseInt(s);
            if (number == 0)
                break;
            numbers[number]++;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > 0)
                // Print time or times based on the count
                System.out.println(i + " occurs " + numbers[i] + (numbers[i] > 1 ? " times" : " time"));
        }


    }

    public static void main(String[] args) {
        ex9();
    }
}
