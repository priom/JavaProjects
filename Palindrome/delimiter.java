import java.util.Scanner;

public class delimiter
{
    public static void main(String[] args)
    {
        Scanner keyboard1 = new Scanner(System.in);
        keyboard1.useDelimiter(",");

        String s1;

        System.out.println("Enter a sentence: ");
        s1 = keyboard1.next();

        System.out.println("The sentence is \"" + s1 + "\"");
    }
}