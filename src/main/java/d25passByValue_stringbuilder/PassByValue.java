package d25passByValue_stringbuilder;

import java.util.Arrays;

public class PassByValue {
    public static void main(String[] args) {
        String str = "Java";
        int arr[] = {1, 2, 3};

        method1(str); //JAVA
        method2(arr);
        System.out.println(str);//Java ==> comes from the variable within the same method body
        System.out.println(Arrays.toString(arr));
    }

    private static void method1(String str){
        str = str.toUpperCase();
        System.out.println(str);//JAVA
    }
    private static void method2(int[] arr){
        arr[1] = 5;
        arr[2] = 9;
    }

    /*
    When you send a data to a method as a parameter, actually you send copy the data to parameter
    In the method, if the data is manipulated, it does not affect the original one.
    Java works on copy of the addresses from variables and objects....
    This is named "pass by value"
     */

    /*
    Java don't use pass by reference:
    If it was used, addresses would be sent to methods as parameters without copy.
    With the address, original data would be accessible and changeable.
    In this case both original data and address can be manipulated.
       (in multiple data; value can be updated with the same address.
       just pointer of address changes for the new data)
     */

    /*
    1) Security:
    "Pass by value" prevent changing data without control
    Increases security by keeping original data.

    2) Performance
    By preventing address change, operation will be performed faster...

     */

}

