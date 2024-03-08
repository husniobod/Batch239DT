package d8ifstatements_switch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of the month!");
        byte numOfMonth = input.nextByte();
        switch (numOfMonth) {
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid number");
                                //Note: Data type of the variable in switch parenthesis can be:
                                //1)String   2)int   3)short   4)char 4) byte

                //switch does not accept 1) long  2)boolean  3)float  4)double as data type for variables in parenthesis

        }
    }
}
