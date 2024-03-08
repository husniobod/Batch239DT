package d15loops;

public class NestedLoops02 {
    public static void main(String[] args) {

       /*
Draw the following pattern on the console:

*
* *
* * *
* * * *

 */

        for(int i=1; i<=4; i++){

            for(int k=1; k<=i; k++){

                System.out.print("* ");


            }
            System.out.println();

        }
        //to sum up: value of (i) which is row number...
        //...defining number of repetition in nested loop where columns created...


        double num = 28.587;
        String numS = String.valueOf(num);

        int index = numS.indexOf(".");
        String partTwo = numS.substring(index + 1);

        int num1 = Integer.parseInt(partTwo);
        int sum = 0;
        for (int i = num1; i > 0; i /= 10) { // i = i/10
            sum = sum + i % 10;
        }
        System.out.println("sum = " + sum);



    }
}
