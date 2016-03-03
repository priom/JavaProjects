// Nrimoni Chowdhury


import java.util.Scanner;

public class fibonacci
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the fibonacci number you need to find: ");
        int n = keyboard.nextInt();
        int z, result = 1;
        int x = 0;
        int y = 1;

        if (n < 0)
        {
            System.out.println("Error");
        }

        for (z = 1; z < n; z++)
        {
            result = x+ y;
            x = y;
            y = result;
        }
    System.out.println("The fibonacci number is " + result);
    }
}