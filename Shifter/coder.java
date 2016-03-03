// Nrimoni Chowdhury
// A 00371596

public class coder extends shifter
{
    public coder (int n)
    {
        super(n);
    }

    public String encode (String in)
    {
      String out = " ";
      for (int i = 0; i < in.length(); i++)
      {
        char c = in.charAt(i);
        char d = shift(c);
        out = out + d;
      }
        return (out);
    }

    public String decode (String in)
    {
      String out = " ";
      for (int i = 0; i < in.length(); i++)
      {
        char c = in.charAt(i);
        char d = unshift(c);
        out = out + d;
      }
       return (out);
    }
}