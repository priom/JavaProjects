/*
 * Assignment 8, July 2013
 * By: Tami Meredith
 */
public class shifter {

    private final int DISTANCE;

    public shifter (int d) {
        DISTANCE = d % 26;
    }

    public char shift (char c) {
        if (Character.isUpperCase(c)) {
            return ((char) (((c-'A'+DISTANCE+26)%26) + 'A'));
        } else if (Character.isLowerCase(c)) {
            return ((char) (((c-'a'+DISTANCE+26)%26) + 'a'));
        } else {
            return (c);
        }
    }

    public char unshift (char c) {
        if (Character.isUpperCase(c)) {
            return ((char) (((c-'A'-DISTANCE+26)%26) + 'A'));
        } else if (Character.isLowerCase(c)) {
            return ((char) (((c-'a'-DISTANCE+26)%26) + 'a'));
        } else {
            return (c);
        }
    }

} // end of class shifter