/*
 * Assignment 8, July 2013
 * By: Tami Meredith
 */
import java.util.*;

public class secretspy {

    /*
     * Mainline
     * -- DOES NOT NEED ALTERING
     */
    public static void main(String[] a) {

        String msg, coded, decoded;
        Scanner user = new Scanner (System.in);
        System.out.printf("Enter your secret code number: ");
        int shift = user.nextInt();
        msg = user.nextLine();
        coder cdr = new coder(shift);

        do {
            System.out.printf("Enter your secret message (\"quit\" to exit).\n? ");
            msg = user.nextLine();
            coded = cdr.encode(msg);
            decoded = cdr.decode(coded);
            System.out.printf("Encoded: %s\n", coded);
            System.out.printf("Decoded: %s\n\n", decoded);
            if (!(msg.equals(decoded))) {
                System.out.printf("Oh noes! It didn't work!\n");
            }
        } while (!(msg.equals("quit")));

    } // end of main()

} // end of class secretspy