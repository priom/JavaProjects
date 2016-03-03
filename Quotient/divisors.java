// Nrimoni Chowdhury

import java.util.Scanner;
public class divisors
{
public static void main (String[] args)
{
Scanner keyboard = new Scanner(System.in);
int value;
int quotient;
System.out.print("Enter an integer value: ");
value = keyboard.nextInt();
System.out.print(value + " is evenly divisible by: ");
{
    for (quotient = 1; quotient <= value; quotient++)
    {
        int remainder = value % quotient;
        if (remainder == 0)
           System.out.println(quotient);
    }
}
}
} // end main()
 // end class divisors