package mypracticetest;

import java.util.Scanner;

public class TernaryOperators3 {
    public static void main(String[] args) {

       // Write Java program to check whether a character entered by the user is a vowel or a consonant using the ternary operator.
 Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Letter; ");
        char L = scanner.next().charAt(0);

        String result = ((L == 'a' || L == 'e' || L == 'i' || L == 'o' || L == 'u' ||
                L == 'A' || L == 'E' || L == 'I' || L == 'O' || L == 'U') ? "vowel" : "consonant");

        System.out.println(L + " is a " + result + ".");

        scanner.close();

    }
}
