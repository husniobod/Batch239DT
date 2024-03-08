package d21arraylist;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {

        //Example1: Create an ArrayList with repeated characters, and move them to a new array as unique elements
        // J, a, v, a, v

        ArrayList<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('v');
        System.out.println(a); //[J, a, v, a, v]

        ArrayList<Character> b = new ArrayList<>();  //new array to move unique elements: J, a, v
        for (Character c : a){ //[J, a, v, a, v]

            if(!b.contains(c)){

                b.add(c);
            }

        }
        System.out.println("b = " + b); //b = [J, a, v]


    }
}

//
//1. We start with an `ArrayList` called `a`, which contains some characters, including repeated
// ones: 'J', 'a', 'v', 'a', 'v'.
//
//2. We create an empty `ArrayList` called `b`, which will hold the unique elements from `a`.
//
//3. We iterate through each character `c` in the `ArrayList` `a`.
//
//4. For each character `c`, we check if `b` already contains it using the `contains()` method.
//
//5. If `b` doesn't contain `c`, it means `c` is a unique character, so we add it to `b`.
//
//6. After iterating through all the characters in `a`, `b` will contain only the unique elements from `a`.
//
//7. Finally, we print out the contents of `b`, which now contains the unique elements: 'J', 'a', 'v'.
//
//So, essentially, this code removes any duplicate characters from the original `ArrayList` `a` and stores/
// nly the unique characters in a new `ArrayList` `b`.