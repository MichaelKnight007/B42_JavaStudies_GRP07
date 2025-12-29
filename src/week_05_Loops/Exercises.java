package week_05_Loops;

import java.util.Random;

public class Exercises {
    public static void main(String[] args) {

        Random random = new Random();

       int randomNumber= random.nextInt(10)+1;

        int guessNumber= 5;

        while(true){
            if (guessNumber==randomNumber){
                System.out.println("You guessed the number. Number is " + guessNumber);
                break;
            }
            System.out.println("You guess is not true. Number is " + randomNumber);

        }


        do {

            if (guessNumber==randomNumber){
                System.out.println("You guessed the number. Number is " + guessNumber);
                break;
            }
            System.out.println("You guess is not true. Number is " + randomNumber);

        } while(true);



    }
}
