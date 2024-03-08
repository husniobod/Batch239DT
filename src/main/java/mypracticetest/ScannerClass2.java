package mypracticetest;

import java.util.Scanner;

public class ScannerClass2 {
    public static void main(String[] args) {

       // Write a Java program to accept a string input from the user using the Scanner class and display it.

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your full name");


        String userInput = scanner.nextLine();


        System.out.println(" Yeah You Entered: " + userInput);


        scanner.close();
    }
}
