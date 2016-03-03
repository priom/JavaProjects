// Nrimoni Chowdhury

/*
 *@author Tami Meredith, A12345678
 *@purpose Assignment 8 Starting point, CSCI 1226
 *@date May 2013
 */
import java.io.*;
import java.util.*;

public class unique
{
    /* --- PROVIDED CODE TO READ AN ARRAY OF STRINGS FROM A FILE --- */

    // Generic Exception Handler
    // -- Used when an error occurs opening a file
    public static void handleException (Exception e) {
        System.out.println(e.getMessage());
        System.exit(0);
    }

    // Select a file to process
    // -- Used to get a filename from the user
    public static String selectFile () {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("What file contains the data? ");
        return (keyboard.nextLine());
    }

    // Prepare to read input data
    // -- Used to get open a file and apply a Scanner
    public static Scanner openFile (String name) {
        try {
            return (new Scanner(new File (name)));
        } catch (Exception e) {
            handleException(e);
        }
        return null;
    }

    // Count the lines in a file
    // -- Used so that we can create an array of the correct length
    public static int countLines (Scanner file) {
        int lines = 0;
        while (file.hasNextLine()) {
            file.nextLine();
            lines++;
        }
        return (lines);
    }

    // Find the file, open it, and read the input into an array
    // -- Used to get the input
    public static String[] getInput () {
        String   fileName = selectFile();
        Scanner  input    = openFile(fileName);
        int      count    = countLines(input);
        String[] data     = new String[count];

        // Reopen the file to reset to beginning after countLines()
        input.close();
        input = openFile(fileName);

        // Get the data and return it
        while (count > 0) {
            data[--count] = input.next();
        }
        input.close();
        return (data);
    }

    /*
     * ---------------------------------------------------------------
     * Everything above here is used to get the input.
     * Note: Do not modify anything above this comment!
     * ---------------------------------------------------------------
     */

    /*
     * Mainline
     */


    public static void main(String[] args) {

        String[] values   = getInput();
    Arrays.sort(values);
    int i;
    int count=1;
    int repeat=1;
    int times=0;
    for (i=1; i< values.length;i++) {

        if (i<values.length-1)
        {if(values[i-1].equals(values[i]))
        {System.out.print("");
            times++;}
            else
            {System.out.println(count+" "+ values[i-1]+"at frequency "+times);
            count++;
                times=1;}}

                else {times++;
                    System.out.println(count+" "+values[values.length-1]+"at frequency "+times);

                }}

                               System.out.println("the file has " + count+ " number of unique URL'S. ");


                }}
