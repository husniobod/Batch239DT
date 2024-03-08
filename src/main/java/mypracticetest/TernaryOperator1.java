package mypracticetest;

import java.util.Scanner;

public class TernaryOperator1 {
    public static void main(String[] args) {

        //Write Java program to check whether a number entered by the user is even or odd using the ternary operator.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "even" : "odd";

        System.out.println(number + " is " + result + ".");

        scanner.close();
    }
}
