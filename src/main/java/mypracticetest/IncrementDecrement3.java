package mypracticetest;

import java.util.Scanner;

public class IncrementDecrement3 {
    public static void main(String[] args) {


       // Write a Java program to demonstrate the use of compound assignment operators. Take an integer input from the
        // user, add 5 to it using a compound assignment operator, and display the result.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Number: ");
        int userInput = scanner.nextInt();

        userInput += 5; //after adding 5 using compound assignment
        System.out.println("Result: " + userInput);


        scanner.close();

    }
}
