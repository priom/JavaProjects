// Nrimoni Chowdhury
// A 00371596

/*
 * Assignment 2, July 2013
 * By: Tami Meredith
 */
import java.io.*;
import java.util.*;

public class princesses {

    public static final int ROWS = 8;
    public static final int COLS = 8;

    // Generic Exception Handler
    public static void handleException (Exception e) {
        System.out.println(e.getMessage());
        System.exit(0);
    } // end handleException()

    // Select a file to process
    public static String selectFile () {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("What file contains the data? ");
        return (keyboard.nextLine());
    } // end selectFile()

    // Prepare to read input data
    public static Scanner openFile (String name) {
        try {
            return (new Scanner (new File (name)));
        } catch (Exception e) {
            handleException(e);
        }
        return null;
    } // end openFile()

    // Read a chessboard configuration
    public static char[][] getInput () {
        Scanner input = openFile(selectFile());
        char[][] board = new char[8][8];
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                board[r][c] = input.next().charAt(0);
            }
        }
        input.close();
        return (board);
    } // end getInput()

    public static void displayBoard (char[][] board) {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                System.out.printf("%c ", board[r][c]);
            }
            System.out.printf("\n");
        }
    } // end displayBoard()

    /* ---- ALL ABOVE HERE IS TO READ INPUT: LEAVE IT ALONE ---- */

    /*
     * YOUR TASK IS TO COMPLETE THIS METHOD!
     * -- It should return true if board has a capture (i.e., 2 princesses on
     *    the same row and column).
     */
    public static boolean hasCapture(char[][] board) {
        // Do stuff to find a capture
            /*
             * << YOUR CODE HERE >> *
             */
        // OK, doesn't have a capture then ...
        int counter;

        for (int r = 0; r < ROWS; r++){
            counter = 0;
            for (int c = 0; c < COLS; c++) {
                if (board[r][c]  == 'P') {
                   counter++;
                   if (counter > 1 )
                    return (true);
                }
            }
        }

       for (int c = 0; c < COLS; c++){
            counter = 0;
            for (int r = 0; r < ROWS; r++) {
                if (board[r][c]  == 'P') {
                   counter++;
                   if (counter > 1 )
                    return (true);
                }
            }
        }
       return (false);

    } // end isValid()

    /*
     * Mainline
     * -- DOES NOT NEED ALTERING
     */

    public static void main(String[] a) {

        char[][] data = getInput();
        displayBoard(data);

        if (hasCapture(data)) {
            System.out.println("There is a capture available.");
        } else {
            System.out.println("There are no possible captures on this board.");
        }

    } // end of main()

} // end of class princesses