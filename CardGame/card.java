/*
 * Assignment 9 Provided Code
 * Tami Meredith, August 2013
 */
public class card {

  /*
   * Inner classes - classes accessible only in card
   * Class data, enumerations exist once for the card class
   */
  private static enum suit {
    Hearts, Spades, Clubs, Diamonds, None
  }
  private static enum value {
    Joker, Ace, Two, Three, Four, Five, Six,
    Seven, Eight, Nine, Ten, Jack, Queen, King
  }

  /* Instance Data for a single card */
  private suit mySuit;
  private value myValue;

  /*
   * Private Methods
   * -- these are called from the constructor
   */
  private suit int2suit (int i) {
    if (i < 0) return (suit.None);
    switch (i / 13) {
      case 0: return (suit.Hearts);
      case 1: return (suit.Clubs);
      case 2: return (suit.Diamonds);
      case 3: return (suit.Spades);
      default:
        // i > 51 (0-51 = regular cards)
        return (suit.None);
    }
  } /* end int2suit() */

  private value int2value (int i) {
    switch (i % 13) {
      case  0: return(value.Ace);
      case  1: return(value.Two);
      case  2: return(value.Three);
      case  3: return(value.Four);
      case  4: return(value.Five);
      case  5: return(value.Six);
      case  6: return(value.Seven);
      case  7: return(value.Eight);
      case  8: return(value.Nine);
      case  9: return(value.Ten);
      case 10: return(value.Jack);
      case 11: return(value.Queen);
      case 12: return(value.King);
      default:
        // can never happen, needed to suppress compiler warning
        return (value.Joker);
    }
  } /* end int2value() */

  /*
   * Constructor
   * -- call with the values 0-51 to create a standard deck
   * -- if ((i > 51) || (i < 0)) a joker is returned
   */
  public card (int i) {
    mySuit = int2suit(i);
    if (mySuit.equals(suit.None))
      myValue = value.Joker;
    else
      myValue = int2value(i);
  } /* end constructor */

  /*
   * Interface Methods
   */

  /* Convert a card to a string */
  public String toString () {
    return (myValue.toString() + " of " + mySuit.toString());
  }

  /*
   * Get the value of the card
   * returns an in in the range 1..10, face cards are also 10
   */
  public int valueOf () {
    int val = myValue.ordinal();
    if (val >10) val = 10;
    return (val);
  }

  /* Get the suit as a string */
  public String suitOf () {
    return mySuit.toString();
  }

} /* end class card */