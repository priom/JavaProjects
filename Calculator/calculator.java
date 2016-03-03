//Nrimoni Chowdhury
//A 00371596

/*
 * Assignment 6, Provided Code
 * By: Tami Meredith
 * Notes: This solution has NO error checking, so malformed expressions
 *        can cause runtime errors.
 */
import java.io.*;
import java.util.*;

public class calculator {

  // Generic Exception Handler
  public static void handleException (Exception e) {
      System.out.println(e.getMessage());
      System.exit(0);
  } // end of handleException()

  // Select a file to process
    public static String selectFile () {
    Scanner keyboard = new Scanner (System.in);
    System.out.print("What file contains the data? ");
    return (keyboard.nextLine());
  } // end of selectFile()

    // Prepare to read input data
  public static Scanner openFile (String name) {
    try {
      return (new Scanner (new File (name)));
    } catch (Exception e) {
      handleException(e);
    }
    return null;
  } // end of openFile()

  private static String[] parse (String expr) {
    return (expr.split("[ ]+"));
  } // end of parse()

  private static double evaluate (String expr) throws Exception {

    String[] tokens = parse(expr);
    stack s = new stack(); // stack only holds doubles
    double num = 0;

    if (tokens.length > 256)
        throw new Exception("Exception: STACK OVERFLOW!!!");

      try
        {
            for (int i = 0; i < tokens.length; i++) {
              if (tokens[i].equals("+")) {
                  s.push(s.pop() + s.pop());
              } else if (tokens[i].equals("*")) {
                  s.push(s.pop() * s.pop());
              } else if (tokens[i].equals("-")) {
                  num = s.pop(); // need to apply - to values in right order
                  s.push(s.pop() - num);
              } else if (tokens[i].equals("/")) {
                  num = s.pop(); // need to apply / to values in right order
                  s.push(s.pop() / num);
                  if (num == 0.0)
                        throw new Exception("Exception: DIVIDE BY ZERO!!!");
              } else {
                  // treat everything else as a number
                  s.push(Double.parseDouble(tokens[i]));
              } // end if-else chain
            } // end for
        }

      catch(Exception e)
       {
             System.out.println("Exception: EXTRA OPERATOR!!!");
             System.exit(0);
       }


      try
      	{
      		if(s.numItems() > 1)
                throw new Exception("Exception: EXTRA VALUE!!!");
        }

       catch(Exception e)
       {
             handleException(e);
       }

    // Should only be one thing on the stack now, the answer
    return (s.pop());

  } // end of evaluate()

  /*
   * Mainline
   */
  public static void main(String[] a) {

    String fileName;
    Scanner input;
    String expression;
    double result;

    try
    {
      fileName = selectFile();
      input = openFile(fileName);
         while (input.hasNextLine()) {
         expression = input.nextLine();
         result = evaluate(expression);
         System.out.printf("%s = %.4f\n", expression, result);
         }
      if ((fileName != "+") || (fileName != "-") || (fileName != "/") || (fileName != "*"))
         throw new Exception("Exception: BAD OPERATOR!!!");
    }

    catch (Exception e)
    {
        System.out.println(e.getMessage());
        System.exit(0);
    }

        //input.close();


  } // end of main()

} // end of class calculator
