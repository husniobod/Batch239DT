package d20arrays_arraylist;

import java.util.ArrayList;

public class MDimArrays01 {
    public static void main(String[] args) {

              //Example: Create a md array in int data type,
            //and calculate total value of min and max of the elements...

        int [][] ages = {{11,4}, {13,43,21}}; //4 +43 =47

        int min = ages[0][0]; // sample min element to compare with others
        int max = ages[0][0]; // sample max element to compare with others


        for(int[] w:ages){
            for(int k :w){


               min = Math.min(k, min);

               max = Math.max(k, max);
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("Total of min and max= " + max + min );




    }
}
