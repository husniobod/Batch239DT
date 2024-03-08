package d8ifstatements_switch;

public class Ternary01 {
    public static void main(String[] args) {
        //another conditional statement syntax: ternary...
/*
        condition ? part-for-true : part-for-false;
        (c)       ?    (t)        :      (f);           */

        //Example: create a ternary to print absolute value of given number....

        int x = 9;

        int absValue = (x < 0) ?  (-1*x) : (x);
        System.out.println("absValue = " + absValue);

        //in ternary; we need to keep returning data in a related data type then we can print...

        //Example: If two numbers have the same sign, return multiplication of them
// if signs are different, print "I can not multiply the number with different sign!"

    }
}
