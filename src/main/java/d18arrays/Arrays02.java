package d18arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example: Create an array with 6 elements and print the number less than 5 on the console
        // 1, -3, -5, 6, 7, 5  ==> 1, -3, -5

        int[] numbers = {1, -3, -5, 6, 7, 5};

        for(int i : numbers){
            if(i <5 ){
                System.out.println(i);
            }
        }



        //Example2: Check the string array if a specific data exist in the array or not...
        //binarySearch() => returns the index of specified element if exist....
        //binarySearch() => sort() method should be used as a prerequisite for binarySearch() method
        //If teh specified data does not exist, binarySearch() method returns a negative
        // if you see "-" => means there is no such element

        String letters[] = {"W", "O", "R", "L", "D"};
        Arrays.sort(letters); //sorted in alphabetical order
        System.out.println(Arrays.toString(letters)); //[D, L, O, R, W]

        int indexOfL = Arrays.binarySearch(letters, "L");
        System.out.println("Index Of L : "+ indexOfL); //1

        int indexOfP = Arrays.binarySearch(letters, "P");
        System.out.println(indexOfP); //-4 => means if it existed, would be in 4th order (not index)

        //------------------------------------
        int[] arr = {2, 1, 5, 6}; //give me the index of 5 and 3....

        Arrays.sort(arr); //sorted in ascending
        System.out.println("sorted : "+ Arrays.toString(arr)); //[1, 2, 5, 6]

        int  indexOfFive= Arrays.binarySearch(arr, 5); //2
        System.out.println("indexOfFive = " + indexOfFive);

        int  indexOfThree= Arrays.binarySearch(arr, 3);
        System.out.println("indexOfThree = " + indexOfThree); //indexOfThree = -3

        //Example 3: Print the number of words in the given sentence...
        //"Java is easy, Learn java earn money"

        String s = "Java is easy. Learn java earn money";

        String[] words =  s.split(" "); //words: [Java, is, easy., Learn, java, earn, money]
        System.out.println("words: " + Arrays.toString(words));
        System.out.println("Number of Words= "+ words.length); //7










    }
}
