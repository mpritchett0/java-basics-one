import java.util.Random;
import java.util.Scanner;


public class Assignment2 {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        // Random is between 0 and bound exclusive, so to get a random number between 1-100 from 0-99, add 1.
        int target = r.nextInt(99)+1;


        System.out.println("Guess the number between 1 and 100:");
        int attempts = 0;
        while(true){
            attempts++;
            // Get the guess from user input
            int guess = scan.nextInt();
            
            if (guess >= target-10 && guess <= target+10) {
                System.out.println("The correct answer was: "+target);
                break;
            } else{
                System.out.println("Wrong! Guess again!");
            }
            if(attempts == 5){
                System.out.println("Sorry, the correct answer was: "+target);
                break;            
            }
        }



    }
    
}
