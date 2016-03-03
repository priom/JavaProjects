// Nrimoni Chowdhury


import java.util.Scanner;

public class euclid
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Which is the first number?");
        System.out.print("Enter an integer value: ");
        int number1 = keyboard.nextInt();
        System.out.println("Which is the second number?");
        System.out.print("Enter an integer value: ");
        int number2 = keyboard.nextInt();

        System.out.println("The GCD of " + number1 +" and " + number2 +" is: " + GCD(number1,number2));

        System.out.println("Their LCM is: " + LCM(number1, number2));
    }
    public static int GCD(int number1, int number2)
    {
        if (number2 == 0)
        {
            return number1;
        }
            return GCD(number2, number1%number2);
    }
    public static int LCM(int number1, int number2)
    {
    	return ((number1 * number2) / GCD(number1, number2));
    }
}