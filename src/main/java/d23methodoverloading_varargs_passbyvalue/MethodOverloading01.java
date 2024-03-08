package d23methodoverloading_varargs_passbyvalue;

public class MethodOverloading01 {
    public static void main(String[] args) {

        //Polymorphism: This is one of the principals of OOP concept.
        //Method Overloading(static polymorphism) + Method Overriding(Dynamic Polymorphism)

        //It is used to run a method for different purposes...

        //1) Method Overloading

        // String s = "java";
        //s.substring(int begin index) : one single parameter
        // s.substring(int begin index, int end index) : two parameters

        /*
        In Method Overloading: we just modify parameters.
        There are two signatures in a method: 1) Method name 2) parameters
        But in method overloading; method name must be the same. By changing parameters we do method overloading


         */
        add(3, 4.33);

    } //closing main method


    private static void add(int a, int b){System.out.println(a+b);}
    //we overloaded add() method by changing parameters...
    private static void add(double a, double b){ System.out.println(a+b);}
    public static void add(int a, double b){System.out.println(a+b);}
    public static void add(double b, int a){System.out.println(a+b);}
    public static void add(int a, int b, int c){System.out.println(a+b+c);}

    /*
    To overload a method:
    1)we can change data type of parameters
    2)we can change number of parameters
    3)we can change the places of parameters if data types are different from each other
    Note: There is no importance of having return type, access modifier, being static or non-static...
     */

    //Q1: is Private method available for overloading?
    //A1: yes. bcs overloading is performed in current class.
    // so private members are already accessible within the same class. no restriction for overloading

    //Q2: is Static method available for overloading?
    //A1: Yes. bcs even it is static I am creating new methods by changing parameters (signature)


}



