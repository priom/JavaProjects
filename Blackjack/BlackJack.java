// Nrimoni Chowdhury
// A 00371596

import java.util.*;
public class BlackJack {

  static deck d = new deck();
  private static int playerWin = 0;
  private static int dealerWin = 0;
  private static int numberOfRounds = 1;

  public static void main (String[] args) {
    card[] pHand = new card[52];
    card[] dHand = new card[52];
    d.shuffle();

    try
    {
            System.out.println("Round 1 (Player 0, Dealer 0)");
            pHand[0] = d.draw();
            pHand[1] = d.draw();
            System.out.println("PLAYER : " + pHand[0] + " and " + pHand[1] + " are drawn.");

            dHand[0] = d.draw();
            dHand[1] = d.draw();
            System.out.println("DEALER : " + dHand[0] + " is drawn.");

            int playerScore = (pHand[0].valueOf() + pHand[1].valueOf());
            int dealerScore = dHand[0].valueOf();

            System.out.println("PLAYER SCORE: " + playerScore);
            System.out.println("DEALER SCORE: " + dealerScore);

            Scanner keyboard = new Scanner(System.in);
            System.out.print("Another card (y/n)? ");
            String c = keyboard.next();

            if (c.equals("n"))
                    {
                        System.out.println("** Dealer turns his card over. **");
                        System.out.println("DEALER : " + dHand[0] + ", " + dHand[1] + " are drawn.");
                        dealerScore = (dHand[0].valueOf() + dHand[1].valueOf());
                        System.out.println("PLAYER : " + pHand[0] + " and " + pHand[1] + " are drawn.");
                        System.out.println("** Dealer draws a card. **");
                        dHand[2] = d.draw();
                        System.out.println("DEALER : " + dHand[0] + ", " + dHand[1] + " and " + dHand[2] + " is drawn.");
                        dealerScore = (dHand[0].valueOf() + dHand[1].valueOf() + dHand[2].valueOf()) ;
                        if (dealerScore <= 17)
                        {
                            dHand[3] = d.draw();
                            System.out.println("DEALER : " + dHand[0] + ", " + dHand[1] + ", " + dHand[2] + " and " + dHand[3] + " is drawn.");
                        }
                            System.out.println("DEALER SCORE: " + dealerScore);
                            System.out.println("PLAYER SCORE: " + playerScore);
                    }

            while (c.equals("y"))
            {
                pHand[2] = d.draw();
                System.out.println("PLAYER : " + pHand[0] + ", " + pHand[1] + " and " + pHand[2] + " are drawn.");

                playerScore = playerScore + pHand[2].valueOf();
                System.out.println("PLAYER SCORE: " + playerScore);

                if (playerScore > 21)
                 {
                    System.out.println("You went bust, you lose!");
                    break;
                 }
                    System.out.print("Another card (y/n)? ");
                    c = keyboard.next();


            }
                 if (((playerScore > dealerScore) && (playerScore <= 21)) || (dealerScore > 21))
                 {
                    System.out.println("Player wins.");
                    playerWin++;
                 }
                 else if (((playerScore < dealerScore) && (dealerScore <= 21)) || (playerScore > 21))
                 {
                    System.out.println("Dealer wins.");
                    dealerWin++;
                 }
                 else
                 {
                    System.out.println("A Tie, nobody wins");
                 }

        System.out.print(">> Play another round (y/n)? ");
        String r = keyboard.next();

        while (r.equals("y"))
        {
            numberOfRounds++;
            System.out.println("Round " + numberOfRounds + " (Player " + playerWin + " , Dealer " + dealerWin + ")");
            pHand[0] = d.draw();
            pHand[1] = d.draw();
            System.out.println("PLAYER : " + pHand[0] + " and " + pHand[1] + " are drawn.");

            dHand[0] = d.draw();
            dHand[1] = d.draw();
            System.out.println("DEALER : " + dHand[0] + " is drawn.");

            playerScore = (pHand[0].valueOf() + pHand[1].valueOf());
            dealerScore = dHand[0].valueOf();

            System.out.println("PLAYER SCORE: " + playerScore);
            System.out.println("DEALER SCORE: " + dealerScore);

            System.out.print(">> Another card (y/n)? ");
            c = keyboard.next();


            while (c.equals("y"))
            {
                pHand[2] = d.draw();
                System.out.println("PLAYER : " + pHand[0] + ", " + pHand[1] + " and " + pHand[2] + " are drawn.");

                playerScore = playerScore + pHand[2].valueOf();
                System.out.println("PLAYER SCORE: " + playerScore);

                if (playerScore > 21)
                 {
                    System.out.println("You went bust, you lose!");
                    break;
                 }
                    break;
             }

            if (c.equals("n"))
                    {
                       System.out.println("** Dealer turns his card over. **");
                        System.out.println("DEALER : " + dHand[0] + ", " + dHand[1] + " are drawn.");
                        dealerScore = (dHand[0].valueOf() + dHand[1].valueOf());
                        System.out.println("PLAYER : " + pHand[0] + " and " + pHand[1] + " are drawn.");
                        System.out.println("** Dealer draws a card. **");
                        dHand[2] = d.draw();
                        System.out.println("DEALER : " + dHand[0] + ", " + dHand[1] + " and " + dHand[2] + " is drawn.");
                        dealerScore = (dHand[0].valueOf() + dHand[1].valueOf() + dHand[2].valueOf()) ;
                        if (dealerScore <= 17)
                        {
                            dHand[3] = d.draw();
                            System.out.println("DEALER : " + dHand[0] + ", " + dHand[1] + ", " + dHand[2] + " and " + dHand[3] + " is drawn.");

                            dHand[4] = d.draw();
                            System.out.println("DEALER : " + dHand[0] + ", " + dHand[1] + ", " + dHand[2] +  ", " + dHand[3] + " and " + dHand[4] + " is drawn.");
                        }
                            System.out.println("DEALER SCORE: " + dealerScore);
                            System.out.println("PLAYER SCORE: " + playerScore);
                    }
                if (((playerScore > dealerScore) && (playerScore <= 21)) || (dealerScore > 21))
                 {
                    System.out.println("Player wins.");
                    playerWin++;
                 }
                 else if (((playerScore < dealerScore) && (dealerScore <= 21)) || (playerScore > 21))
                 {
                    System.out.println("Dealer wins.");
                    dealerWin++;
                 }
                 else
                 {
                    System.out.println("A Tie, nobody wins");
                 }
              System.out.print(">> Play another round (y/n)? ");
        r = keyboard.next();

        }



    }
    catch(Exception e){
         System.err.println(e.getMessage());
    }

  } /* end main() */

} /* end class driver */