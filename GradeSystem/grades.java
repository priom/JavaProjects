// Nrimoni Chowdhury
/*
 *@author Tami Meredith
 * Permission given for use in CSCI 1226 Assignments
 */
import java.util.Scanner;

public class grades
{
    public static void main (String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        int mark = 0-100;

        {
                String grade = "F+";

        System.out.print("Enter a mark (0-100): ");
        mark = keyboard.nextInt();

       // System.out.println("The mark of " + mark +
         //                  " earns a grade of " + grade);
        }
        {
            if (mark < 0)
        System.out.println("Error");
        }

        { if (mark > 100)
            System.out.println("Error");
        }

        { if (mark > 90)
            if (mark < 100)
            System.out.println("A+");
        }

        {
               if (mark > 80)
                if (mark < 85)
                System.out.println("A-");
        }

        {
            if (mark > 72)
                if (mark < 77)
                    System.out.println("B");
        }


        {
            if (mark > 50)
                if (mark < 60)
                System.out.println("D");
        }

    } // end main()

} // end class average