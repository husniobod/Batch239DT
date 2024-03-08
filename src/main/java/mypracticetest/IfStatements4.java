package mypracticetest;

import java.util.Scanner;

public class IfStatements4 {
    public static void main(String[] args) {

       // Write a Java program to check whether a year entered by the user is a leap year or not using if-else statements.

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a year: ");
        int year = scanner.nextInt();


        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");


        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
     // It should be divisible by 4, and
        //It should not be divisible by 100, unless it's also divisible by 400.
    }
}
