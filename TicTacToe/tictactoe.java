// Nrimoni Chowdhury


import java.util.*;

public class tictactoe {

    private static final String version = "v1.0.0";

    private static char[][] board = new char[3][3];
    private static Scanner keyboard = new Scanner (System.in);
    private static int moves;

    int initialMove;
    int currentMove;

    private static void initBoard () {
        moves = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
    } // end initBoard()

    private static void displayBoard () {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%c ", board[i][j]);
            }
            System.out.printf("\n");
        }
    } // end displayBoard()


    private static char get (int square) {
        return (board[(square-1)/3][(square-1)%3]);
    } // end get()

    private static void set (int square, char c) {
        board[(square-1)/3][(square-1)%3] = c;
        moves++;
    } // end set()

    private static void unset (int square) {
        board[(square-1)/3][(square-1)%3] = '_';
        moves--;
    } // end unset()

    public static boolean isWinner (char c ){

        if ((board [0] [0]) == c && (board [1] [1]) == c && (board [2] [2]) == c){
            return (true);
        }
        else if  ((board [0] [2]) == c && (board [1] [1]) == c && (board [2] [0]) == c){
            return (true);
        }
        else if  (((board [0] [0]) == c && (board [0] [1]) == c && (board [0] [2]) == c)
              || ((board [1] [0]) == c && (board [1] [1]) == c && (board [1] [2]) == c)
              || ((board [2] [0]) == c && (board [2] [1]) == c && (board [2] [2]) == c)) {
            return (true);
        }
        else if  (((board [0] [0]) == c && (board [1] [0]) == c && (board [2] [0]) == c)
               || ((board [0] [1]) == c && (board [1] [1]) == c && (board [2] [1]) == c)
               || ((board [0] [2]) == c && (board [1] [2]) == c && (board [2] [2]) == c)) {
            return (true);
        }
        else  {
            return (false);
        }
    }

    private static void displayInstructions () {
        System.out.printf("TicTacToe %s\n", version);
        System.out.printf("In this game the squares are numbered 1-9 as follows:\n");
        System.out.printf("row 1:  1 2 3\n");
        System.out.printf("row 2:  4 5 6\n");
        System.out.printf("row 3:  7 8 9\n");
        System.out.printf("\n");
    } // end displayInstructions()

    public static void playerMove () {
        int square, x, y;
        do {
            System.out.printf("which square (1 to 9)? ");
            square = keyboard.nextInt();
            if ((square < 1) || (9 < square)) {
                System.out.printf("Invalid choice. %d not in the range of 1 to 9.\n", square);
                square = 0;
            } else if (get(square) != '_') {
                System.out.printf("Invalid choice. That square is already taken.\n");
                square = 0;
            }
        } while (square == 0);
        set(square,'X');
    } // end playerMove()

    /*
     * Used to finalise the computer's move
     */
    private static void computerSelect (int i) {
        System.out.println("Computer selects " + i);
        if (get(i) != 'O') {
            set (i, 'O');
        }
    }

   /*public static boolean isWinner(char c)
   {
    if (c == 'O')
        return(true);
        else return(false);
   }*/

    private static void computerMove () {

        // On the first turn, take center or corner
        if (moves == 1) {
            if (get(5) == 'X') {
                computerSelect(1);
            } else {
                computerSelect(5);
            }
            return;
        }

        // See if any move would generate a win and take that

        for (int i = 1; i <= 9; i++) {
            if (get(i) == '_') {
                set(i,'O');
                if (isWinner('O')) {
                    computerSelect(i);
                    return;
                } else {
                    unset(i);
                }
            }
        }

        // See if we need to block X and do it if needed
        for (int i = 1; i <= 9; i++) {
            if (get(i) == '_') {
                set(i,'X');
                if (isWinner('X')) {
                    unset(i);
                    computerSelect(i);
                    return;
                } else {
                    unset(i);
                }
            }
        }

        // Second move, need a side if we started with the center
        if (moves == 3) {
            for (int i = 2; i < 9; i+=2) {
                if (get(i) == '_') {
                    computerSelect(i);
                    return;
                }
            }
        }

        // X isn't playing to win, so just fill anything empty
        for (int i = 1; i <=9; i++) {
            if (get(i) == '_') {
                computerSelect(i);
                return;
            }
        }

        // Should never get here
        System.out.println("AI is not so smart. Didn't select a move.");
        System.exit(0);

    } // end computerMove()

    /* Never returns on a win - prints winner and exits  */
    public static void checkWinner () {
        if (isWinner ('X')) {
            System.out.printf("You won. You beat the computer!\n");
            System.exit(0);
        } else if (isWinner ('O')) {
            System.out.printf("Oh dear. The computer won this time.\n");
            System.exit(0);
        } else if (moves == 9) {
            System.out.printf("Nobody won. It was a tie.\n");
            System.exit(0);
        }
    } // end checkWinner()

    /*
     * Mainline
     */
    public static void main (String[] args) {

        initBoard();
        displayInstructions();

        while (true) {

            /*
             * Player is 'X', always goes first
             */
            playerMove();
            displayBoard();
            checkWinner();

            /*
             * Computer is 'O', goes second
             */
            computerMove();
            displayBoard();
            checkWinner();

        } // end while
    } // main()

} // end class ai_ttt