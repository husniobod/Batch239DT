package d25passByValue_stringbuilder;

public class StringBuilder02 {
    public static void main(String[] args) {


        //The append() method is used to add a new String to the StringBuilder object
        //The capacity() method indicates the size of the allocated and yet unused space characters...

        StringBuilder sb1 = new StringBuilder(); // default + 4
        System.out.println(sb1.length());//0
        System.out.println(sb1.capacity());//26 => default capacity in container from StringBuilder class




        sb1.append("Java");
        System.out.println(sb1.length());//4 => used 4 out of 16 capacity
        System.out.println(sb1.capacity());//16




        sb1.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");//36 x appended
        System.out.println(sb1.length());//40
        System.out.println(sb1.capacity());//40
        //after exceeding default capacity, Java will provide 16 more and plus 2 capacity.
        //But after 34, optimization starts based on the length....
        //If the number of characters are 40, capacity will be 40

        /*
        capacity is the number of data storage spaces given to you by Java,
        length is the used portion of the data storage space provided to you.


   ==> Initially, Java gives you a capacity of 16.
   If you exceed this given capacity, Java adjusts the new capacity : default+16 +2
   After that limit: optimization starts
         */

        System.out.println("--------");
        //Can we change default capacity at the beginning?
        StringBuilder sb2 = new StringBuilder(5);
        //if you type int data in constructor;capacity is defined
        System.out.println(sb2.append("Micheal"));//exceeded the capacity limit so it increase with pattern
        //pattern is: capacity*2 + 2
        System.out.println(sb2.capacity());// customcapacity(5) + customcapacity + 2 ==> 5 + 5 + 2=12
        System.out.println(sb2.length());

    }

}


