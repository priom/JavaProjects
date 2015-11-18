//Nrimoni Chowdhury - A00371596
//Methew Guda -

package com.priom;

public class BubbleInsertSort {

    public static int bubbCompCount = 0;
    public static int bubbSwapCount = 0;
    public static int bubbPassCount = 0;

    public static int insrtCompCount = 0;
    public static int insrtSwapCount = 0;

    public static void main(String[] args) {
        int n[] = {16, 10, 2, 5, 6, 4, 3, 7, 9, 8, 11, 15, 13, 12, 14, 1};
        System.out.print("Unsorted List: ");
        for (int x = 0; x < n.length; x++) {
            System.out.print (n[x] + " ");
        }

//        Print BUBBLE sorted list
        System.out.println ();
        bubbleSort (n);
        System.out.print ("BUBBLE Sorted List: ");
        for (int y = 0; y < n.length; y++) {
            System.out.print (n[y] + " ");
        }

//        Print INSERTION sorted list
        System.out.println ();
        insertSort (n);
        System.out.print ("INSERTION Sorted List: ");
        for (int z = 0; z < n.length; z++) {
            System.out.print (n[z] + " ");
        }
        System.out.println ();
        System.out.printf ("Comparison: %d, Swaps: %d.", insrtCompCount, insrtSwapCount);
        System.out.println ();

    }
//    Iterative function for bubble sort
    public static void bubbleSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    } //end func

    //    Iterative function for insertion sort
    public static void insertSort(int b[]) {
        int item;
        int pos;
        int list[] = new int[b.length];
        for (int i = 2; i < b.length; i++) {
            insrtCompCount = insrtCompCount + 2;
            item = list[i];
            pos = i - 1;

            while ((pos >= 1) && (list[pos] > item)) {
                insrtCompCount++;
                insrtSwapCount++;
                list[pos + 1] = list[pos];
                pos = pos - 1;
            }
        }
    } //end func
}
