package d22arraylist_methodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {

        //Create a method in Java: We can not create a method inside another method.

/*
However, If inside a method(ex: in main method), an inner class (nested class) can be defined.
And inside this inner class we can create methods....
But this local InnerClass, is accessible inside main method only. Can not be used outside main method..

in Java; method is created outside of main method...

AccessModifier + Static(optional) + returnType + methodName + () + {method body}

Created method are called in main method which is named "Method Call"....

 */

// Method call:

        int result= multiplication(34, 12);
        System.out.println(result);



    }

    public static int multiplication(int a, int b) {
        int c = a * b;
        return c;
    }
}
