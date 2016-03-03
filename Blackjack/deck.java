// Nrimoni Chowdhury
// A 00371596

import java.util.*;
public class deck
{
    public final int SIZE = 52;
    private int remaining = 52;

    private card[] cards  = new card[SIZE];
    private Random randomiser = new Random();

    public deck()
    {
        for (int i = 0; i < 52; i++)
        {
            cards[i] = new card(i);
        }
    }

    public void display()
    {
        for (int i = 0; i < remaining; i++)
        {
            System.out.println(cards[i]);
        }
    }

    public void shuffle()
    {
        for (int i = 0; i < 52; i++)
        {
            Random randomiser = new Random();
            int j = randomiser.nextInt(SIZE);
            card swap = cards [j];
            cards [j] = cards [i];
            cards [i] = swap;
        }
    }

    public card draw() throws Exception
    {
        if (remaining == 0)
            throw new Exception ("No cards in deck");

        remaining--;
        return (cards[remaining]);
    }
}