package d7ifstatements;
import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //When we have two conditions, we can use if-else statement....
//When we have conditions more than 2, we can use "if - else if - else if ....... - else"

//  if(specific scenario){
//
//  }else if(another specific scenario){
//
//  }else if(another specific scenario){
//
//  }else{
//
//  }

//Example: Check the given number by user if it is negative, positive, neute

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is neutral (zero).");
        }
    }
}
