// Nrimoni Chowdhury

import java.io.*;
import java.util.*;
import java.util.Arrays;
public class statistics {

	public static void main(String[] args) {

      int number;
      System.out.print("How many values do you have? ");
	  Scanner keyboard = new Scanner(System.in);
      number = keyboard.nextInt();

      int[] values = new int[number];

	  int sum = 0;
	  for (int index = 0; index < number; index++)
	  {
	   values[index] = keyboard.nextInt();
	   sum = sum + values[index];
	   	  }
         Arrays.sort(values);
         int mean = sum / number;
        System.out.println("The mean value is: " + mean);
        System.out.println("The maximum value is " + values[number-1]);
        System.out.println("The minimum value is " + values[0] );

		int median;
		int middle = ((values.length) / 2);
		if(values.length % 2 == 0)
		{
		 int medianA = values[middle];
		 int medianB = values[middle - 1];
		 median = (medianA + medianB) / 2;
		}
			else
		{
		 median = values[middle];
		}
        System.out.println("The median value is: " + median);

	} // end of main()

} // end of class statistics