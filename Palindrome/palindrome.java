// Nrimoni Chowdhury

import java.util.Scanner;

public class palindrome
{

      public static void main(String args[])
   {

      String getString, reverse="";
      Scanner in = new Scanner(System.in);


      System.out.print("Enter a string: ");
      getString = in.nextLine();

      int length = getString.length();

      for ( int i = length - 1 ; i >= 0 ; i-- )
           reverse = reverse + getString.charAt(i);


      if (getString.equals(reverse))
         System.out.println("The string " + getString + " is a palindrome of length " + length);
      else
         System.out.println("Entered string is not a palindrome.");

    }
}



