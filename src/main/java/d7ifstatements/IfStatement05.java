package d7ifstatements;
import java.util.Scanner;
import java.io.InputStream;

public class IfStatement05 {
    public static void main(String[] args) {
        //Example: the information provided by customer:
//if it is Female
        //and if greater than 60, print "She can retire."

//if is Male
        //and if greater than 65, print "He can retire."


        //Example: the information provided by customer:
//if it is Female
        //and if greater than 60, print "She can retire."

//if it is Male
        //and if greater than 65, print "He can retire."



//structure of nested if....
/*
if(condition1){ // for being male
    body...

    if(secondary condition){ //for being retired

    }

}else if (condition2){ //for being female
    body...

    if(secondary condition){ //for being retired

    }
}else{ // for invalid entry...

}  */


        Scanner input = new Scanner(System.in);

        System.out.println("Define your gender...");
        String gender = input.next();

        System.out.println("Enter your age...");
        int age = input.nextInt();

        if(gender.equalsIgnoreCase("male")){ //MaLE
            if(age > 65){
                System.out.println("He can retire...");
            }else{
                System.out.println("He must continue working!");
            }
        } else if (gender.equalsIgnoreCase("female")){
            if(age > 60){
                System.out.println("She can retire...");
            }else{
                System.out.println("She must continue working!");
            }
        }else{
            System.out.println("Nothing is defined for you!");
        }

        }

    }

