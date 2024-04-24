package W8;

import java.io.*;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        /*
        /Write a program that asks users to enter a file name.
        Then, read the content of this file (assume this file is in the same directory as your Java program) and output it to the console.
        If the file does not exist, your program should inform users and ask them to enter a new name.
        Repeat the process as many times as needed to get at least one file correctly.
        You should use exception handling to solve this exercise.
         */

        Scanner scanner = new Scanner(System.in);
        String fileName;
        do {
            System.out.print("Enter a file name: ");
            fileName = scanner.nextLine();
        } while (!checkIfFileExist(fileName));
        BufferedReader br = new BufferedReader(new FileReader("src/W8/"+ fileName));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }


    public static boolean checkIfFileExist(String fileName) {
        try { // Handle in place
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            reader.close();
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
