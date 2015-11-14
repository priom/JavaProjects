package com.priom;

import java.util.*;

public class BinaryConv {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print ("Type 1 to convert binary to decimal\nType 2 to convert decimal to binary: ");
        int choice = k.nextInt ();

        if (choice == 1) {
            // Taking an input from user
            System.out.print ("Enter a binary number: ");
            String n = k.next ();
            System.out.println (n + " (base 2) = " + bin2dec (n) + " (base 10)");
        }
        else {
            System.out.print ("Enter a decimal number: ");
            int dec = k.nextInt ();

            System.out.printf ("%d (base 10) = %s (base 2)\n", dec, dec2bin (dec));
        }
    }

    public static int bin2dec(String b) {
        int result = 0;

        if (b.length () > 31) {
            System.out.println ("Invalid input: " + b + " : length greater than 31 characters.");
        }
        else {
            for (int index = 0; index <= b.length () - 1; index++) {
                if (b.charAt (index) == '1') {
                    result = (result * 2) + 1;
                } else if (b.charAt (index) == '0') {
                    result = (result * 2);
                } else {
                    result = -1;
                }
            }
        }
        return result;

    }

    public static String dec2bin(int d) {
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
        return bin;
    }
}
