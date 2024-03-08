package d23methodoverloading_varargs_passbyvalue;

public class Varargs02 {
    public static void main(String[] args) {

        int result = total();
        System.out.println("result = " + result);
    }
    //Your manager told you to create a method calculating total value of exam results
    //there will be 6 exams per student

    /*public static int total(int a, int b, int c){
        return a + b + c;
    }*/

    /*Varargs; allows a method to get different number of parameters with a simple syntax
    Varargs; means "variable arguments" => allows different number of parameters in method

    Varargs is following the rules below:
    1)More than one Varargs can not be used. Varargs must be last parameter in method parenthesis.
    bcs if you use varargs first before simple one, database accept data non-stop and can not proceed to next parameter
    // total(int... a, int b) =>not accepted     || total(int b, int... a) => accepted
    2)Varargs work in array structure in background.
    3)Varargs parameter can be primitive data type or non-primitive data type
    4) Varargs parameter accept many arguments in same data type
    5) Varargs can take zero argument. total(); possible
    */


    public static int total(int... a){ //"..." represent Varargs in java
        int sum = 0;

        for(int w : a){//multiple data is accepted so we use for each loop

            sum = sum +w;
        }
        return sum;


    }

}


