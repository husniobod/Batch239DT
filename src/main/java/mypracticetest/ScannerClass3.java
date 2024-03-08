package mypracticetest;

import java.util.Scanner;

public class ScannerClass3 {
    public static void main(String[] args) {

        //Write a Java program to accept three integer inputs from the user using the Scanner class, find their sum, and display it.


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your first Number: ");
        int num1 = scanner.nextInt();

        // 1

        System.out.println("Enter your second Number: ");
        int num2 = scanner.nextInt();

        // 2

        System.out.println("Enter your Third Number: ");
        int num3 = scanner.nextInt();

        // 3

        int sum = num1 + num2 + num3;
        System.out.println(" Sum of the three Numbers: " + sum);


        scanner.close();


    }
}
