package d4operatorscastingscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {


//I want to get input from another system; so I need something more in my class....
        // So far I assigned all the data inside the class on my own...
        //This time, I will allow an external user to enter data into my system....

        //Scanner class can read some different data types easily... (int, String, float etc.)
        //Scanner class has many methods....
        //1) Create an instance/object from Scanner class which is member of java.util....


        //how to create object:
// ClassName + objectName = "new" keyword  + ClassName();
        Scanner       entryDTNT   = new Scanner(System.in); //input will come through the parameter of Scanner class
        //System.in is used to read data from keyboard...
        //Through the parameter defined in Scanner() constructor, data is accepted...

        //First tell the user what you want him to enter....
        System.out.println("Please enter your age...");

        //Then user will enter the age by the help of object from Scanner...

        byte age = entryDTNT.nextByte();
        System.out.println("Entered by User: " + age); //print entered age by user....


    }
}
