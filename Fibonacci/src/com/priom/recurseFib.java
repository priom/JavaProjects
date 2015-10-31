package com.priom;
import java.util.*;

public class recurseFib {
    public static int recAdd;
    public static int recSub;
    public static int recMul;

    public static void main(String[] args) {
        Scanner k = new Scanner (System.in);
        System.out.print ("Enter a value of N: ");
        int n = k.nextInt();
        System.out.println ("Fibonacci value of " + n + " is " + fibRecurse (n) + ".");
        System.out.printf ("Recursion Addition %d, Subtraction %d, Multiplication %d", recAdd, recSub, recSub);
    }

    public static int fibRecurse (int n) {
        if (n <= 0) {
            return 0;
        }

        if ((n == 1) || (n == 2)) {
            return 1;
        }

        else {
            recAdd = recAdd + 1;
            recSub = recSub + 2;
            return (fibRecurse (n - 1) + fibRecurse (n - 2));
        }
    }
}
