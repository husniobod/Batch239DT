package d1variables;

public class Variables01 {

    public static void main(String[] args) {

        //                COMPARISON OPERATORS (They Return True or False)
        //                Mostly Used in Conditional Statements
            /*
                EQUAL TO        : "=="   ==>     myAge == 28   (returns true or false)
                Not EQUAL TO    : "!="   ==>     myAge != 28   (returns true or false)
                Note: "!" in Java means NOT in English.

                Greater Than    : ">"    ==>   8 > 7  (returns true)
                Less Than       : "<"    ==>   5 < 3  (returns false)

                Greater Than or Equal to :  ">="   ==>  12 >= 11 (returns true)
                Less Than or Equal to    :  "<="   ==>  13 <= 12 (returns false)

                Returning data (true or false) will be in Boolean data type...

                Note: "==" represents equality in JAVA. "=" is assignment operator.
                Assignment Operator; assigns the data on the right into the variable/container on the left.

            */

        //LOGICAL OPERATORS
        /*
        AND :   "&&"  represents AND operator. Shift + 6   ==> AND operator is perfectionist. Need all of them true to get true in result.

        OR :   "||" represents OR operator. Shift + key between z and left shift ==> So generous. One true is enough to get true.


                Tamara = 30       Nahed = 25       Ayse = 18

                Tamara <= 35 && Nahed > 25  ===>>>  FALSE

                (Ayse != 19  && Nahed < 26 ) || Tamara == 28

        */

        //MATH OPERATIONS

            /*
            Addition : +
            Multiplication : *
            Subtraction: -
            Division: /

            //OPERATION PRIORITY
        1) If there is parenthesis; inside the parenthesis is executed first.
        2) Multiplication/Divison has first priority between operators. *  /
        3) Addition/Subtraction has second priority between operators. +  -

        8/2*(2+2) : 16
        30 - 3 + 2*3 :

             */


        //JAVA is strongly typed programming language...
        //So every data must be associated with any of the data types...
        //JAVA does not read that comment lines...

        //in "int" type; 0 is assigned as default value at the beginning
        //in "String" ; null is assigned as default value at the beginning.

        //Example 1: Create a greeting message in String data type, and print on the console....
        //     DataType               variableName       "assignment operator"       data
        String                greeting                =                        "Hello World";
        System.out.println(greeting); //it has no effect on database. just for printing...


        System.out.println("----------------------");

        //Example 2: Create a data in int data type and assign 13. Then print on the console
        int myNumber = 13;
        System.out.println(myNumber);
        //  System.out.println();  // for shortcut ==>   sout + enter or tab


        //Note: Primitive data types are created by java
        //Note2: We use lowercase in initial of primitive data types
        //Note3: Based on their types; primitive ones occupy memory differently.

        System.out.println("----------------------");

        //1-) byte data type:
        //for whole numbers, occupies 1 byte in memory

        //Example 3: Create a variable and assign the student's age in it. (11)

        byte ageOfStudent = 11;
        System.out.println(ageOfStudent);

        //Example method closing brace

        int myAge = 33;
        System.out.println(myAge);




    }
}
