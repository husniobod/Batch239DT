package d15loops;

import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {

        //Nested Loop
/*
for(){
      for(){

      }
  }
  */

  /*
  Type the code printing following output...

  Week 1:
      Day: 1
      Day: 2
      Day: 3

  Week 2:
      Day: 1
      Day: 2
      Day: 3

   */

        for(int i=1; i<3; i++){
            System.out.println("Week " + i + ":");

            for(int k =1; k<4; k++){

                System.out.println("    Day: " + k);
            }

        }


                //Note: In main loop when we have starting point and condition is true;
                //in loop body; nested loop is iterating for all the values...
                //When nested loop is done iterating in all values; then Java will go to main loop increment/decrement part,
                // and check second value in condition....

                 /*
                Example : Print the following pattern on the console
                        X X X X
                        X X X X
                        X X X X
                 */
        System.out.println("-----------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for rows");
        int rows = input.nextInt();
        System.out.println("Enter a number for columns");
        int column = input.nextInt();
        for(int i =1; i<= rows; i++){
            for(int x=1; x <= column; x++){
                System.out.print("X ");
            }
            System.out.println();   //This is just to proceed to next line when a row is created with print() in nested loop...
            //when nested loop is over for 1. row=> that sends us to next line for 2. row
            //... and second loop in main loop
        }
                }

            }


