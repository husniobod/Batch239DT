package mypracticetest;

public class DataTypes2 {
    public static void main(String[] args) {

      //  Write a Java program to perform arithmetic operations (addition, subtraction, multiplication, division) on
        //  two integer variables and display the results.

        int num1=12;
        int num2 = 17;

        int sum = num1 + num2;
        System.out.println("sum: " + sum);


        int difference = num1 - num2;
        System.out.println("difference: "+difference);



        int multiplication = num1* num2;
        System.out.println("multiplication: " +multiplication );



        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
