//Nrimoni Chowdhury
//A 00371596

import java.io.*;
import java.util.*;
public class copy
{
    public static int count = 0;
    public static String[] data = new String[1000];
    public static FileOutputStream filestream;
    public static PrintWriter outprocessor;

    public static void load (String filename)
    {
        File filestream;
        Scanner input = null;
        try
        {
            filestream = new File(filename);
            input = new Scanner(filestream);
            // while loop for each line
            while (input.hasNext())
            {
                if (count == 1000)
                {
                    System.out.println("DATABASE IS FULL");
                    System.exit(0);
                }

                String line = input.nextLine();
                data[count] = new String(line);
                count++;
            }
        }

        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }

            System.out.println(filename + " read " + count + " no. of lines.");
            input.close();
    } // end load


    public static void main(String[] a)
    {
        Scanner keyboard = new Scanner(System.in);
        int newCount = 0;
        System.out.print("File Name: ");
        String filename = keyboard.next();
        load(filename);
        String copyName = filename + ".cpy";
        try
        {
            outprocessor = new PrintWriter(copyName);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        String [] copyData = new String[count];
        for(int i = 0; i < count; i++)
        {
           copyData[i] = data[i];
           outprocessor.println(copyData[i]);
           newCount++;
        }

        System.out.println(copyName + " wrote " + newCount + " no. of lines.");
        outprocessor.close();

    } // end of main()
}