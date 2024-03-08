package mypracticetest;
import java.util.Scanner;

public class DataTypes3 {
    public static void main(String[] args) {

        //Write a Java program to convert a string to an integer and vice versa. Take user input for a string and
        // convert it to an integer, then convert it back to a string and print both. (find related method by yourself... parseInt())
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter you age");
        String userInput = scanner.nextLine();

        // Convert the string to an integer

        {
            int integerValue = Integer.parseInt(userInput);
            System.out.println("Converted Integer: " + integerValue);

            String convertedString = String.valueOf(integerValue);
            System.out.println("Converted String: " + convertedString);
        }

        }
    }

