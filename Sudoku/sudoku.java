// Nrimoni Chowdhury
// A 00371596

/*
 * Assignment 4, Provided Code
 * By: Tami Meredith, July 2013
 */
import java.io.*;
import java.util.*;

public class sudoku {

  // Check a row, column, or group
  // -- Called from isWinner()
  public static boolean check (int[] set) {
    boolean[] seen = new boolean[9];
    int i;
    boolean result = true;

    // 1. Mark that we haven't seen anything
    for (i = 0; i < 9; i++)
      seen[i] = false;
    // 2. Mark all the numbers in the set as seen
    for (i = 0; i < 9; i++)
      seen[set[i]-1] = true;
    // 3. Check all 9 were seen
    for (i = 0; i < 9; i++)
      result = result && seen[i];

    return (result);
  } // end check()


  /*
   * The mainline
   */
 public static void main (String[] a) {

    board myBoard = new board ();

    String fileName = selectFile();
    player = new Scanner (System.in);

    while (!isWinner()) {
      myBoard.displayBoard();
      System.out.printf("Enter the row and column to set [0-8] [0-8]: ");
      int row = player.nextInt();
      int col = player.nextInt();
      System.out.printf("Enter the value for that space [1-9]: ");
      int val = player.nextInt();
      setValue(row, col, val);
    }

    myBoard.displayBoard();
    System.out.printf("Game Over!\n");
  } // end of main()

} // end of class sudoku