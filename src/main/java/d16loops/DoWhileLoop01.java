package d16loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //Interview Question
        //Example: Create java application to check if the given number is palindrome or not
        // 121 ===> 121   123321  ==> 123321   303 ==> 303

        int x = 313;
        System.out.println("x = " + x);
        //1. step: convert int to String

        String xStr = String.valueOf(x); // "313"
        String reversed = ""; //to store data in reverse process

        //starting value will be last index in xStr...
        int i = xStr.length()-1; // xStr.length() -1 : dynamic last index
        while(i >= 0){
            reversed = reversed + xStr.charAt(i);
            i--;
        }

        System.out.println("reversed = " + reversed);

        if(xStr.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }


    }
}
