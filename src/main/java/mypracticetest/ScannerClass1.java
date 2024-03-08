package mypracticetest;

import java.util.Scanner;

public class ScannerClass1 {
    public static void main(String[] args) {
      //  Write a Java program to accept two numbers from the user using the Scanner class, add them, and display the result.

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Calculate the sum of the two numbers
        int sum = x + y;

        // Display the result
        System.out.println("Sum: " + sum);
    }
}
