package d17loops_arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Arrays01 { // Renaming the class to avoid conflict
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an array of strings with 3 elements
        String[] stdNames = new String[3];
        System.out.println(Arrays.toString(stdNames)); // Prints [null, null, null]

        // Creating an array of integers with 5 elements
        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes)); // Prints [0, 0, 0, 0, 0]

        // Creating an array of Integer objects with 10 elements
        Integer[] numbers = new Integer[10];
        System.out.println(Arrays.toString(numbers)); // Prints [null, null, null, null, null, null, null, null, null, null]

        // Creating an array of strings with 3 elements
        String[] names = new String[3];
        System.out.println(Arrays.toString(names)); // Prints [null, null, null]

        // Adding elements to the names array
        names[0] = "Mike";
        names[2] = "Mary";
        names[1] = "Jim";
        System.out.println(Arrays.toString(names)); // Prints [Mike, Jim, Mary]

        // Accessing and printing an element from a specific index
        String second = names[1];
        System.out.println("second = " + second); // Prints "second = Jim"

        // Printing an element directly from a specific index
        System.out.println(names[1]); // Prints "Jim"
    }
}