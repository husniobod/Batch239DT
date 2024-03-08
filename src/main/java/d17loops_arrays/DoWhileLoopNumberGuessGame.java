package d17loops_arrays;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoopNumberGuessGame {
    public static void main(String[] args) {

                //Create a game to guess the number crated by Random class
                //The number that Random class will create should be between 0-100
                //Random class will be used to create a number randomly
                //create conditions, if entered number is larger, smaller or equal to random number....

                Scanner scanner = new Scanner(System.in);
                Random random = new Random(); //created instance from Random class

                //let's create a random number between 0-100
                int randomNum  = random.nextInt(101); //how can I create a random number between 20 - 100? Find it please!!!

                int enteredNum;

                int numOfTrial = 0;

                boolean isGuessedCorrectly= false;

                do{
                    System.out.println("Guess the number between 0 and 100!");
                    enteredNum = scanner.nextInt();

                    numOfTrial++;

                    if(enteredNum < randomNum){
                        System.out.println("You entered a smaller number!");

                    }else if(enteredNum > randomNum){

                        System.out.println("You entered a larger number");

                    }else{
                        isGuessedCorrectly = true;
                        System.out.println("You guessed the number correctly!");
                        System.out.println("Number of Trial: " + numOfTrial);
                    }

                }while(!isGuessedCorrectly);


            }
        }

/*
Guess the number between 0 and 100!
15
You entered a smaller number!
Guess the number between 0 and 100!
25
You entered a smaller number!
Guess the number between 0 and 100!
50
You entered a smaller number!
Guess the number between 0 and 100!
60
You entered a smaller number!
Guess the number between 0 and 100!
90
You entered a smaller number!
Guess the number between 0 and 100!
95
You entered a smaller number!
Guess the number between 0 and 100!
99
You guessed the number correctly! tried 7 times and guessed...
 */
