//Nrimoni Chowdhury - A00371596
//Methew Guda - A00381751

package com.priom;

import java.util.*;

public class BubbleInsertSort {
    public static int bubbCompCount = 0;
    public static int bubbSwapCount = 0;
    public static int bubbPassCount = 0;

    public static int insrtCompCount = 0;
    public static int insrtSwapCount = 0;

    public static void main(String[] args) {
        //Generate random list
        Random random = new Random();
        int r[] = new int[16];
        int r2[] = new int[16];
        for (int m = 0; m < r.length; m++) {
            r[m] = random.nextInt(500);
            r2[m] = r[m];
        }
//        Print BUBBLE sorted list
        bubbleSort(r);
        System.out.print("BUBBLE Sorted List: ");
        for (int p = 0; p < r.length; p++) {
            System.out.print (r[p] + " ");
        }
        System.out.println();
        System.out.printf("BUBBLE Sort: Comparison: %d, Swaps: %d, Passes: %d.",
                bubbCompCount, bubbSwapCount, bubbPassCount);

//        Print INSERTION sorted list
        insertSort(r2);
        System.out.println();
        System.out.println();
        System.out.print("INSERTION Sorted List: ");
        for (int q = 0; q < r.length; q++) {
            System.out.print (r[q] + " ");
        }
        System.out.println ();
        System.out.printf ("INSERTION Sort: Comparison: %d, Swaps: %d.",
                insrtCompCount, insrtSwapCount);
        System.out.println ();

    }
//    Iterative function for BUBBLE sort
    public static void bubbleSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                bubbCompCount = (a.length * (a.length-1)) / 2;
                if (a[j] > a[j+1]) {
                    bubbSwapCount++;
                    bubbPassCount = a.length - 1;
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    } //end func

    //    Iterative function for INSERTION sort
    public static void insertSort(int b[]) {
        for(int i = 0; i<b.length; i++) {
            int temp = b[i];
            int j;
            for(j = i-1; j >= 0 && temp < b[j]; j--)
            {
                b[j+1] = b[j];
                insrtSwapCount++;
                insrtCompCount++;
            }
            b[j+1] = temp;
            insrtCompCount++;
        }
    } //end func
} //end class

