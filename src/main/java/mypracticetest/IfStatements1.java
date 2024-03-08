package mypracticetest;

import java.util.Scanner;

public class IfStatements1 {
    public static void main(String[] args) {
       // Write a Java program to check whether a number entered by the user is positive, negative, or zero using if statements.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number entered is positive.");
        } else if (number < 0) {
            System.out.println("The number entered is negative.");
        } else {
            System.out.println("The number entered is zero.");
        }

        scanner.close();

    }
}
