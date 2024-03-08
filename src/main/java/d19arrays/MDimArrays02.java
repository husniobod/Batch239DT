package d19arrays;

import java.util.Arrays;

public class MDimArrays02 {
    public static void main(String[] args) {
        //Convert a multidimensional array into one single array
        //int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> {5, 4, 2, 3, 2}
        int[][] numbers = {  {5, 4},    {2, 3, 2}  };
        //Steps to follow:
        //1) In md array, type the code to find number of all the elements from all inners
        //2) Create one dimension(simple) array with size of total number of elements from complex array
        //3) Transfer each single element from md array to simple array
        //1) In md array, type the code to find number of all the elements from all inners
        int totalNumOfElements = 0;
        for(int[] w  : numbers){ //{  {5, 4},    {2, 3, 2}  }
            totalNumOfElements =  totalNumOfElements +  w.length;
        }
        System.out.println("totalNumOfElements = " + totalNumOfElements);//5
        //2) Create one dimension(simple) array with size of total number of elements from complex array
        int[] simpleArr = new int[totalNumOfElements]; // 5
        System.out.println(Arrays.toString(simpleArr)); //[0, 0, 0, 0, 0]
        //3) Transfer each single element from md array to simple array
        int idx = 0; //index for new array
        for (int[] x : numbers){ //{  {5, 4},    {2, 3, 2}  }
            for(int y : x){
                simpleArr[idx] = y;
                idx++;
            }
        }
        System.out.println("simpleArr = " + Arrays.toString(simpleArr)); //simpleArr = [5, 4, 2, 3, 2]
    }
}
