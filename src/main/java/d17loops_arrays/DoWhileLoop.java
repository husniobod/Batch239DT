package d17loops_arrays;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfTrials = 1;
        do{
            if(numOfTrials == 5){
                System.out.println("Your account has been blocked!");
                break;
            }
            System.out.println("Enter your username");
            String username = input.next();
            System.out.println("Enter your password");
            String password = input.next();
            numOfTrials++;
            if (username.equals("admin") && password.equals("pwd123")){
                System.out.println("Welcome to your account");
                break;
            }
            System.out.println("Check your credentials!");
        }while(true);

    }
}
