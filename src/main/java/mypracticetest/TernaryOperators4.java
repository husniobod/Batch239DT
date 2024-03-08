package mypracticetest;

import java.util.Scanner;

public class TernaryOperators4 {
    public static void main(String[] args) {

        //Write Java program to check whether a number entered by the user is positive, negative,
        // or zero using the ternary operator.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = scanner.nextInt();


        String result = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";

        System.out.println("The number is " + result + ".");

        scanner.close();

    }
}
