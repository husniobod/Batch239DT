package d6incrementdecrement_ifstatements;

public class IncrementDecrement {
    public static void main(String[] args) {


        //INCREMENT
        int a = 5; // => increase value of a by 2, and update existing container
        System.out.println("Original= " + a);//5

        a = a + 2;  //=> shorter syntax of increasing value in the same container: a += 2;
        System.out.println("Increased= " + a);//7

        a += 2; // increase value of a by 2 and update the container
        System.out.println("Shorter syntax of increment= " + a); //9



        System.out.println("------------------------------------------");

        //DECREMENT
        int c = 15; //decrease by 3
        System.out.println("Original = " + c);//15

        c = c - 3; // shorter syntax with same functionality: c -= 3;
        System.out.println("Decreased = " + c);//12

        c -= 3;
        System.out.println("Shorter syntax = " + c); //9

        System.out.println("--------------------------------------------");

        //Increase by Multiplication
        int d = 6;
        //multiply by 3
        d = d * 3; // => 18
        d *= 3; // => 54   the same functionality with previous line

        System.out.println("My Result= " + d);

        System.out.println("--------------------------------------------");

        //Decrease by Division
        int x = 24;
        x = x / 2; // => 12
        System.out.println(x);

        x /= 2; // => 6
        System.out.println("Final value= " + x);

        // increase by 1
        int f = 19;
        f = f + 1;
        f += 1;
        f++; //available only in increment by 1
        System.out.println(f);


        //decrease by 1
        int g = 13;
        g = g - 1; //12
        g -= 1; //11
        g--; //10
        System.out.println("g = " + g); //10


        // post increment(i++),  pre increment(++i) (it means post assignment or pre assignment)

        int i = 10;
        //......
        int k = i++; //do assignment first, then increase value of i

        System.out.println("k = " + k);
        System.out.println("i = " + i);

        System.out.println("---------------------");

        //pre increment
        int m = 17;

        int n = ++m;                //Do increment first, then do the assignment....

        System.out.println("n = " + n);
        System.out.println("m = " + m);


        int y = 10;

        int z = ++y;
        System.out.println("z = " + z); // 11
        System.out.println("y = " + y); // 11

        //decrement

        int p = 25;
        int r = p--; //assigned p into r first, then decrease value of p at the end...

        System.out.println("p = " + p); // 24
        System.out.println("r = " + r); // 25


        //pre decrement

        int q = 25;

        int t = --q;    //decrease value of q first, then assign new value of q into t...

        System.out.println("q = " + q); //
        System.out.println("t = " + t); //
    }
}
