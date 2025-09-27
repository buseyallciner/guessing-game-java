import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[]args){
        Random rand=new Random();
        int numberToGuess=rand.nextInt(100)+1;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your guess:");
        int guess=input.nextInt();
        int attempts=1;
        if(guess<numberToGuess){
            System.out.println("The number is too low");
        } else if(guess>numberToGuess){
            System.out.println("The number is too high");
        }else if (guess==numberToGuess){
            System.out.println("Correct");
        }
        while(guess!=numberToGuess){
            System.out.println("Guess again");
            guess=input.nextInt();
            attempts++;

            if(guess<numberToGuess){
                System.out.println("The number is too low");
            }else if(guess>numberToGuess){
                System.out.println("The number is too high");
            }
        }
        System.out.println("Correct!! You guessed it!");
    }

}
