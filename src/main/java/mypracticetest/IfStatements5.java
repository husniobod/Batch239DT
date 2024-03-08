package mypracticetest;

import java.util.Scanner;

public class IfStatements5 {
    public static void main(String[] args) {
       // Write a Java program to find the maximum of two numbers entered by the user without using the Math.max()
        // method, only using if statements.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("Maximum number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maximum number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();

    }
}
