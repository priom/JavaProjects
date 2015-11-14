package com.priom;

import java.util.*;

public class BinaryConv {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int index;
        int result;

        System.out.print ("Type 1 to convert binary to decimal\nType 2 to convert decimal to binary: ");
        int choice = k.nextInt ();

        if (choice == 1) {
            // Taking an input from user
            System.out.print ("Enter a binary number: ");
            String n = k.next ();

            result = 0;

            // Calculating the binary to decimal

            if (n.length () > 31)
                System.out.println ("Invalid input: " + n + " : length greater than 31 characters.");

            else {
                for (index = 0; index <= n.length () - 1; index++) {
                    if (n.charAt (index) == '1') {
                        result = (result * 2) + 1;
                    } else if (n.charAt (index) == '0') {
                        result = (result * 2);
                    } else {
                        System.out.println ("Invalid character: " + n + " : not a binary digit (0 or 1).");
                        return;
                    }
                }
                System.out.println (n + " (base 2) = " + result + " (base 10)");
            }
        }
        else {
            System.out.print ("Enter a decimal number: ");
            int dec = k.nextInt ();
            int d = dec;
            String bin = "";

            if (d == 0) {
                bin = "0";
            }

            else {
                while (d > 0) {
                    int rem = d % 2;
                    bin = rem + bin;
                    d = d / 2;
                }
            }
            System.out.printf ("%d (base 10) = %s (base 2)\n", dec, bin);
        }
    }
}
