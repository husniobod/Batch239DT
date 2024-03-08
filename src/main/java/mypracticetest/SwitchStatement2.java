package mypracticetest;

import java.util.Scanner;

public class SwitchStatement2 {
    public static void main(String[] args) {

        //Write Java program to determine the number of days in a month entered by the user using a switch statement.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        int days;


        switch (month) {
            case 1: case 2: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;

            default:
                days = -1; // Invalid month
        }

        if (days != -1)
            System.out.println("The number of days in month " + month + " is: " + days);
        else
            System.out.println("Invalid month number entered.");

        scanner.close();
        }


    }
