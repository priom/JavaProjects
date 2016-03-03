/*
 * Sample Driver Code - tests a deck
 * Assignment 9, August 2013
 * Tami Meredith
 */
public class driver {

  static deck d = new deck();

  public static void main (String[] args) {
    System.out.println("Original Deck:");
    d.display();

    d.shuffle();

    System.out.println("\nShuffled Deck:");
    d.display();

    System.out.println("---drawing 2 cards----\n");

    try{
        for(int i=0;i<2;i++){
            System.out.println(d.draw() + " is drawn.");
            d.display();
            System.out.println();
        }
    }
    catch(Exception e){
        System.err.println(e.getMessage());
    }

  } /* end main() */

} /* end class driver */