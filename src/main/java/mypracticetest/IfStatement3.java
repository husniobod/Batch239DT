package mypracticetest;
import java.util.Scanner;

public class IfStatement3 {
    public static void main(String[] args) {


       // Write a Java program to check whether a character entered by the user is a vowel or a consonant using if-else statements.

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your Character: ");
        char character1 = scanner.next().charAt(0);

        if (character1 == 'a' || character1 == 'e' || character1 == 'i' || character1 == 'o'
                || character1 == 'u' || character1 == 'A' || character1 == 'E' || character1 == 'I'
                || character1 == 'O' || character1 == 'U')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");

    }


}
