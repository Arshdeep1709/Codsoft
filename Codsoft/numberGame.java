import java.util.Random;
import java.util.Scanner;

class numberGame {
    public static void main(String arr[]) {

        // Step 1 : Creating a random number between 1-100, So for that we will import
        // Random class and make it's instance

        Random random = new Random();

        // here system will accept parameter of nextInt as 0-99 so we gave +1 so that it
        // starts from 1 to 100

        int randomNumber = random.nextInt(100) + 1;

        // Cheating option for user, we can enable it if we want

        // System.out.println("Random Number : " + randomNumber);

        System.out.println("Welcome !");

        int score = 0;
        while (true) {

            System.out.println("Guess a number between 1-100");

            // Step 2 : Prompting user to guess Number which we ust created, So for that we
            // will import Scanner class and make it's instance

            Scanner scan = new Scanner(System.in);

            int guessedNumber = scan.nextInt(); // here we will store user's guessed number in a variable
            score++;

            // Step 3 : Comparing user guessed number with generated number and providing
            // feedback accordingly

            if (guessedNumber == randomNumber) {
                System.out.println("Congrats, You guessed it right");
                System.out.println("Score : " + score);
                break;
            } else if (guessedNumber > randomNumber) {
                System.out.println("it's too high !");
            } else {
                System.out.println("It's too low !");
            }

            // here we don't know random number so we can just print random number (It's an
            // option) in step 1

            // Step 4 : Repeating step 2 and 3 until user guesses correct number, So for
            // that we will use loop and loop won't stop until user guesses correct number,
            // So for that we will jump to step 1 and add a while loop, where we are
            // creating the game and give a break in step 3 where user guesses it correct

            // step 5 : At last, We will display the score of the user, So for that in step
            // 1 we will create a variable score and initialize it with 0 and as the user
            // gives the input score starts counting so we will give an increment after
            // user's input and as the user wins score is displayed
        }
    }
}

// End OF THE PROGRAM