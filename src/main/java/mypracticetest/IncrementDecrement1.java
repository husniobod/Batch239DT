package mypracticetest;

import java.util.Scanner;

public class IncrementDecrement1 {
    public static void main(String[] args) {

        //Write a Java program to demonstrate post-increment and pre-decrement operators. Take an integer input from
        // the user, perform post-increment, and pre-decrement operations on it, then display the results.

        Scanner scanner = new Scanner(System.in);


        System.out.print("Please Enter your  Number: ");



        int userInput = scanner.nextInt();



        int postIncrementResult = userInput++;


        int preDecrementResult = --userInput;


        System.out.println(" You entered: " + userInput);


        System.out.println("Result of post-increment: " + postIncrementResult);


        System.out.println("Result of pre-decrement: " + preDecrementResult);


        scanner.close();

    }
}
