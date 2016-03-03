// Nrimoni Chowdhury


import java.util.Scanner;

public class lucas
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the lucas number you need to find: ");
        int n = keyboard.nextInt();
        int z, result = 2;
        int x = 2;
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

    System.out.println("The lucas number is " + result);
    }
}