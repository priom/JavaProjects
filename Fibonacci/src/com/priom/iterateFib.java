package com.priom;
import java.util.*;

public class iterateFib {
    public static int itAdd;
    public static int itSub;
    public static int itMul;

    public static void main (String[] args) {
        Scanner k = new Scanner (System.in);
        System.out.print ("Enter a value of N: ");
        int n = k.nextInt();
        System.out.println ("Fibonacci value of " + n + " is " + fibIterate (n) + ".");
        System.out.printf ("Recursion Addition %d, Subtraction %d, Multiplication %d", itAdd, itSub, itMul);
    }

    public static int fibIterate (int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            itAdd++;
            return 1;
        }

        int f1 = 1, f2 = 1, fN = 0;
        for (int i = 2; i <= n; i++) {
            itAdd++;
            fN = f1 + f2;
            f1 = f2;
            f2 = fN;
        }
        return fN;
    }
}
