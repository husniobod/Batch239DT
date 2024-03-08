package d16loops;

public class ForLoops01 {
    public static void main(String[] args) {

        //Example: Calculate total value of digits in decimal part in the given data...
        double num = 28.587;
        //valueOf() => split() => valueOf => loops with sum container
        // 5 + 8 + 7 => 20
        System.out.println("num = " + num);

        String strNum = String.valueOf(num);
        System.out.println("strNum = " + strNum); // "28.587"

        String decPartStr = strNum.split("[.]")[1]; //[.]  or  \\.
        System.out.println("decimalPart = " + decPartStr); //decimalPart = 587

        //convert string into integer again to do addition operation
        int decPartInt = Integer.valueOf(decPartStr); // 587 => unboxing
        int sum = 0;   // 587 ==> 0 + 5 + 8 + 7 => 20

        for(int i= decPartInt;      i>0;                i/=10){
            sum = sum +  i % 10;

        }

        System.out.println("sum = " + sum);

    }
}
