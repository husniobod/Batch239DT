package mypracticetest;

import java.util.Scanner;

public class IncrementDecrement2 {
    public static void main(String[] args) {

      //  Write a Java program to calculate the area of a rectangle. Take length and width as integer inputs from the
        //  user, then calculate and display the area.


        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        int area = length * width;

        System.out.println("The area of the rectangle is: " + area);
        scanner.close();


    }
}
