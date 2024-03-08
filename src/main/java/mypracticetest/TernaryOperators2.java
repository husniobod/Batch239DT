package mypracticetest;

import java.util.Scanner;

public class TernaryOperators2 {
    public static void main(String[] args) {


       // Write Java program to find the maximum of two numbers entered by the user using the ternary operator.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double max = (num1 > num2) ? num1 : num2;

        System.out.println("Maximum number is: " + max);

        scanner.close();
    }
}
