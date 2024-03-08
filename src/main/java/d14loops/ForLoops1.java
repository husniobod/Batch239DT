package d14loops;

public class ForLoops1 {
    public static void main(String[] args) {


        //Interview Question

//Example 8: Calculate total value of the digits in the given integer.
// 745 => 7 + 4 + 5 = 16

        int sum = 0; //to store result after addition operations in every loop

        for(int i=745; i>0; i /=10){

            sum = sum + i % 10;
        }

        System.out.println("sum = " + sum);


        int sum1 = 0;
        for (int i = 1997; i > 0; i /= 100) {
            sum1 += i % 100; // Update sum1 by adding the last two digits of i
        }
        System.out.println("sum1=" + sum1); // Output the sum of the last two digits of each number in the loop

        //Example 9: Print non-repeated characters of the given String on the console
        // "loops" => lps

        //indexOf and lastIndexOf
        String s3 = "loops";
        String uniqueChars = "";

        for(int i=0; i<s3.length(); i++){
            char ch =  s3.charAt(i);

            if(s3.indexOf(ch) == s3.lastIndexOf(ch)){

                uniqueChars = uniqueChars + ch; // uniqueChars += ch;

            }


        }
        System.out.println("uniqueChars = " + uniqueChars); //uniqueChars = lps



    }
}
