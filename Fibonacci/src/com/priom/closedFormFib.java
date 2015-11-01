package com.priom;
import java.util.*;

public class closedFormFib {
    public static int cfAdd;
    public static int cfSub;
    public static int cfMul;

    public static void main (String[] args) {
        Scanner k = new Scanner (System.in);
        System.out.print ("Enter a value of N: ");
        int n = k.nextInt();
        if (n < 0) {
            System.out.println ("Error! N Must be positive number.");
        }

        System.out.println ("Fibonacci value of " + n + " is " + fibCloseForm (n) + ".");
        System.out.printf ("Recursion Addition %d, Subtraction %d, Multiplication %d.", cfAdd, cfSub, cfMul);
    }

    public static int fibCloseForm (int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            cfAdd++;
            return 1;
        }
        else {
            cfAdd = n + 2;
            cfSub = n + 1;
            cfMul = 3*n + 1;

            double f = ((Math.pow(1+(Math.pow (5, 0.5)), n)) - (Math.pow(1-(Math.pow (5, 0.5)), n)))/((Math.pow (2, n)) * (Math.pow (5, 0.5)));
            return (int)f;

        }
    }
}
