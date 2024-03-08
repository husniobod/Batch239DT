package d5scanners_incrementdecrement;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        //Example: Ask user to enter an integer with 5 digits
        //calculate total value of first and last 2 digits
        //45825 ==> 45 + 25 : 70 ....

        //by dividing by 1000, we will have 45.825 => int removes decimal part and we have 45 as result
        //now we are done with first two digits....

        //if we use modulus operator (mod method) : we can get remainder in division operation
        //So when we divide our number by 100; last two digits will be remainder...

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 5 digit number...");

        //to get first two digit
        int num = input.nextInt(); //data is accepted from outside...
        int firstTwoDigits = num / 1000;

        //how to get last two digits....
        //modulus "%" operator gives us the remainder of division operation

        int lastTwoDigits = num % 100;

        System.out.println("Total of first and last two digits = " + (firstTwoDigits + lastTwoDigits));

/*
        //qqqqq

        int x = 13%5; //
        System.out.println(x); //3  */


    }
}
