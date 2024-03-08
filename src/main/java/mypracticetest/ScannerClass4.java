package mypracticetest;

import java.util.Scanner;

public class ScannerClass4 {
    public static void main(String[] args) {

       // Write a Java program to accept a double input from the user using the Scanner class, multiply it by 2,
        // and display the result.

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please Enter a double value:  ");

        double userInput = scanner.nextDouble();

        double result = userInput * 2;

        System.out.println("Result will be after Multiplying by 2 :  " + result);

        scanner.close();
    }
}
