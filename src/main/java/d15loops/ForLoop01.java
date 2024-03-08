package d15loops;

public class ForLoop01 {
    public static void main(String[] args) {

        // Example: calculate total value of integers from 5 to 9.


        int sum = 0;

        for (int i = 5; i < 10; i++) {
            sum = sum + i;

            System.out.println("sum = " + sum );
        }

        System.out.println("sum = " + sum );

        int mult =1;
        for ( int i=10; i>6; i--){
            mult = mult *i;
            System.out.println("mult =" + mult);
        }
        System.out.println("mult = "+ mult);
    }
}