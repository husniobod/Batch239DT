package mypracticetest;

import java.util.Scanner;

public class IfStatements2 {
    public static void main(String[] args) {

       // Write a Java program to determine the largest of three numbers entered by the user using if-else statements.

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Determine the largest number using if-else statements
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Display the largest number
        System.out.println("The largest number is: " + largest);

        // Close the scanner
        scanner.close();
    }
}
