// Nrimoni Chowdhury
/*
 *@author Yasushi Akiyama
 */

public class average
{
    public static void main(String[] args)
    {
        /*
         * Create integer variables num1 and num2
         * and assign values 25, 75 and 137 respectively
         */
        int num1 = 75;
        int num2 = 137;
        int num3 = 25;

        /* Compute the average of num1, num2 and num3 */
        float average = (num1+num2+num3)/3.0f;

        /* Output the result */
        System.out.println("The average of "+ num1 + " , "
            + num2 + " and "+ num3+" is "+average + ".");

        float sum = (num1+num2+num3);
        System.out.println("The sum of " + num1 + " , " + num2 + " and " + num3 + " is " + sum + " . ");

        float product = (num1*num2*num3);
        System.out.println("The product of " + num1 + " , " + num2 + " and " + num3 + " is " + product + ".");

    } // end main()

} // end class average