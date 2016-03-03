// Nrimoni Chowdhury
// A 00371596

/*
 * Assignment 4, Provided Code
 * By: Tami Meredith, July 2013
 */

public class board {

  // The data for the game
  private int[][] grid;

  // Display the current game board
  public void displayBoard() {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (grid[i][j] == 0)
          System.out.printf("_ ");
        else
          System.out.printf("%d ", grid[i][j]);
        if ((j%3) == 2) System.out.printf(" ");
      }
      System.out.printf("\n");
      if ((i%3) == 2) System.out.printf("\n");
    }
  } // end displayboard();


  // Check a row, column, or group
  // -- Called from isWinner()
  public boolean check (int[] set) {
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

  private boolean isWinner () {
    int[] row = new int[9];
    int[] col = new int[9];
    int[] block = new int[9];
    boolean valid = true;
    int x;

    // Check the rows and columns
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (grid[i][j] == 0) {
          return (false);
        }
        row[j] = grid[i][j];
        col[j] = grid[j][i];
      }
      valid = valid && check(row);
      valid = valid && check(col);
    }

    // Check the groups
    for (int iOffset = 0; iOffset < 9; iOffset += 3) {
      for (int jOffset = 0; jOffset < 9; jOffset +=3) {
        x = 0;
        for (int i = iOffset; i < iOffset+3; i++) {
          for (int j = jOffset; j < jOffset+3; j++) {
            // col = j*3 + y
            block[x++] = grid[i][j];
          }
        }
        valid = valid && check(block);
      }
    }
    return (valid);
  } // end isWinner()

  // Used to set a specific square in the grid
  public void setValue(int r, int c, int v) {
    grid[r][c] = v;
  } // end setValue()

  // Used to construct a new game grid
   public board(String myBoard) {
    grid = new int[9][9];
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
          grid[i][j] = value.nextInt();
      }
    }
    value.close();
  } // end readData()

} // end of class board