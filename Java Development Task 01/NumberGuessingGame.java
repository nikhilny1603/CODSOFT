import java.util.Scanner;
import java.util.Random;
import java.util.*;

class NumberGuessingGame{
    public static void Game(){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int totalScore = 0;
        int roundNumber = 0;

        while(true){
            roundNumber++;
            int randomNumber = r.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            int userGuess = 0;
            boolean guessedCorrect = false;
            System.out.println("\n**** Welcome to the Number Guessing Game ****");
            System.out.println("\nWe have Generated a Random Number.");
            System.out.println("\nYou have Maximum "+ maxAttempts +" attempts to guess it.  ");
            System.out.println("\nSo, Try to Guess it Correct in Minimum Attempts.\n");
            while(attempts < maxAttempts && !guessedCorrect){
                System.out.print("Enter the Number : ");
                try{
                    userGuess = sc.nextInt();
                }
                catch(NumberFormatException e){
                    System.out.println("Please, Enter a Valid Number between 1 - 100.");
                    continue;
                }
                attempts++;

                if(userGuess < randomNumber){
                    System.out.println("Too Small.Please, Try it Again...");
                }
                else if(userGuess > randomNumber){
                    System.out.println("Too Big.Please, Try it Again...");
                }
                else{
                    guessedCorrect = true;
                    System.out.println("Hurray!! You Correctly Guessed the Number "+ randomNumber +" in "+ attempts + " attempts... \n");
                }
            }
            if(guessedCorrect == false){
                System.out.println("You have Reached to Max Attempts. The Number to guess was "+ randomNumber+ ".");
            }
            else{
                totalScore += (maxAttempts - attempts) > 0 ? (maxAttempts - attempts) : 0;
            }
            System.out.println("Do you Want to Play Again (Yes/No) : ");
            String playAgain ;
            playAgain = sc.nextLine();
            if(!playAgain.equals("yes")){
                break;
            }
        }   
        System.out.println("Thanks for Playing! You have Played "+ roundNumber +" rounds and your Total Score is "+ totalScore + ".");
        }
    
    public static void main(String []args){
        Game();
    }
}