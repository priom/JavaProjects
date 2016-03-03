// Nrimoni Chowdhury
// A 00371596

/*
 * Assignment 3, July 2013
 * By: Tami Meredith
 */
import java.io.*;
import java.util.*;

public class rps {

    public static final String[] CHOICES = {"rock", "paper", "scissors"};

    /*
     * Returns true if choice is one of the allowed choices
     */
    public static boolean isValid (String choice) {
        /*
         * TASK ONE - COMPLETE THIS METHOD
         * -- The method should return true if the parameter's value
         *    is "rock", "paper", or "scissors"
         * -- The game currently loops forever because the user choice is
         *    considered invalid (i.e.,  false)
         */

         String s1 = CHOICES[0];
         String s2 = CHOICES[1];
         String s3 = CHOICES[2];

         if ((choice.equals(s1)) || (choice.equals(s2)) || (choice.equals(s3)))
         {
            return (true);
         }

         return (false);
    } // end isValid()

    // Get a user guess
    public static String userChoose () {
        Scanner keyboard = new Scanner (System.in);
        String choice;
        do {
            System.out.print("Please enter your choice (rock, paper, or scissors): ");
            choice = keyboard.next().toLowerCase();
        } while (!isValid(choice));
        return (choice);
    } // end userChoose()

    // Get a computer guess
    public static String computerChoose() {
        /*
         *  TASK TWO -- COMPLETE THIS METHOD
         *  -- Have the computer randomly choose and return one of
         *     "rock", "paper", or "scissors" instead of always choosing "rock"
         */

         //CHOICES[] CHOICES = CHOICES.values();
         Random random = new Random();
         int index = random.nextInt(CHOICES.length);
         return CHOICES[index];

    } // end computerChoose();

    /*
     * Compares user choice (u) and computer choice (c)
     * Returns 0 if its a tie, 1 if the user wins, 2 if the computer wins
     */
    public static int winner (String u, String c) {
        // Scissors cut paper
        if (u.equals("scissors") && c.equals("paper")) return (1);
        if (c.equals("scissors") && u.equals("paper")) return (2);
        // Paper covers rock
        if (u.equals("paper") && c.equals("rock")) return (1);
        if (c.equals("paper") && u.equals("rock")) return (2);
        // Rock smashes scissors
        if (u.equals("rock") && c.equals("scissors")) return (1);
        if (c.equals("rock") && u.equals("scissors")) return (2);
        // Nobody wins
        return (0);
    } // end winner()

    /*
     * Mainline
     */
    public static void main(String[] a) {

        /*
         * TASK THREE -- ADD CODE TO main()
         * -- Change it so the game plays for 10 rounds and keeps score
         */

         int y = 0;// y = USER WIN
         int z = 0;// z = COMPUTER WIN

        for (int i = 1; i <= 10; i++) {

        String u = userChoose();
        String c = computerChoose();

        /*
         * The next statement will need the 1 replacing with a variable that
         * stores the round number
         */
        System.out.printf("Round %d: %s (you) versus %s (computer).", i, u, c);
        if (winner(u,c) == 1) {
            System.out.printf("You won!\n");
            y++;
        } else if (winner(u,c) == 2) {
            System.out.printf("The computer won!\n");
            z++;
        } else {
            System.out.printf("It's a tie. Nobody won.\n");
        }
     }
        /*
         * The next statement will need the 0's replacing with variables that
         * that contain the actual scores
         */

         System.out.printf("Final score: you %d, computer %d.\n",y,z );

    } // end of main()

} // end of class rps