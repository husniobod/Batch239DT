package d19arrays;

import java.util.Arrays;

public class MDimArrays01 {
    public static void main(String[] args) {

//Multidimensional Array
/*
    Multi-dimensional array means putting arrays into array
    The most common is two-dimensional
    A two-dimensional array consist of rows and columns, just like en Excel spreadsheet
*/
        //how to create md array with 3 outer and 2 inner elements...
        int[][] arr = new int[3][2]; //3 element for outer array, 2 elements for each inner array
        System.out.println(Arrays.deepToString(arr)); //[[0, 0], [0, 0], [0, 0]]
        //when to print complex(multi-dimensional) array: toString() does not work. we need deepToString()...

        //How to add elements into md array  =>[ [0, 0], [0, 0], [0, 0] ]
        arr[0][0] = 5;
        arr[0][1] = 12;

        arr[1][0] = 81;
        arr[1][1] = 45;

        arr[2][0] = 99;
        arr[2][1] = 3;


        System.out.println(Arrays.deepToString(arr)); //[   [5, 12],    [81, 45],   [99, 3]   ]


        //How to print a specific element from array
        // go to 1st outer element, print first element in it....
        System.out.println(arr[0][0]); //5

        //print md array
        System.out.println(Arrays.deepToString(arr));

        //print second outer element of md array
        System.out.println("Second element of md array= " + Arrays.toString(arr[1]));

        //print third outer element of md array
        System.out.println("third element of md array= " + Arrays.toString(arr[2]));

        //print first element of third outer element

        System.out.println("First element of third outer element =  " + arr[2][0]);


        //Example: Create md String array with 4 elements for outer..... and put the inner elements in different size...
        String[][] names = { {"Ali", "Jim"}, {"Mary", "Jane", "Joe"}, {"Mike", "Martin"}, {"Ronald"} };
        System.out.println(Arrays.deepToString(names)); //[[Ali, Jim], [Mary, Jane, Joe], [Mike, Martin], [Ronald]]
        //SO; we can use different sizes for inner array structures by assigning the data directly...


        //Example2:  Create md String array with 4 elements; don't define any size for inner array structures...
        String[][] langs = new String[4][]; //outer complex structure is created, but inner simple structures are nıt...
        System.out.println(Arrays.deepToString(langs)); //[null, null, null, null]

        langs[0] = new String[]{"apple", "banana"};
        langs[1] = new String[]{"cat", "dog", "bird"};
        langs[2] = new String[]{"java", "python", "javascript", "swift"};
        langs[3] = new String[]{"red", "blue"};
        System.out.println(Arrays.deepToString(langs)); //[[apple, banana], [cat, dog, bird], [java, python, javascript, swift], [red, blue]]

        //How to print inner simple arrays on the console one by one

        System.out.println("------------------");

        for(String[] inner : langs){

            System.out.println(Arrays.toString(inner));

        }
        /*
            [apple, banana]
            [cat, dog, bird]
            [java, python, javascript, swift]
            [red, blue]
         */
        System.out.println("-------------------");

        //[[apple, banana], [cat, dog, bird], [java, python, javascript, swift], [red, blue]]
        //How to print each element of simple array structures in complex array

        for(String[] inner : langs){ //[[apple, banana], [cat, dog, bird], [java, python, javascript, swift], [red, blue]]

            for (String elementOfInner : inner){

                System.out.println(elementOfInner);
            }
            System.out.println("--------------");


        }

        /*
        Homework: Print the every single element of arrays in complex array which contains "a" on the console....
        String[][] langs = new String[4][]; //outer complex structure is created, but inner simple structures are nıt...
        System.out.println(Arrays.deepToString(langs)); //[null, null, null, null]

        langs[0] = new String[]{"apple", "banana"};
        langs[1] = new String[]{"cat", "dog", "bird"};
        langs[2] = new String[]{"java", "python", "javascript", "swift"};
        langs[3] = new String[]{"red", "blue"};
        System.out.println(Arrays.deepToString(langs)); //[[apple, banana], [cat, dog, bird], [java, python, javascript, swift], [red, blue]]
            */


    }
}
