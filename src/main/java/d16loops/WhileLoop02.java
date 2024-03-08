package d16loops;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number to draw multipilication table");
        int num = input.nextInt();
        int i =1;
        while(i<11){
            if(num >10 || num< 0){
                System.out.println("Please enter a number between 1-10");
                break;
            }
            System.out.println(num + "x" + i + "=" + (num*i));
            i++;
        }

    }
}
