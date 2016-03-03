/*
 * Assignment 5, July 2013
 * By: Tami Meredith
 */
import java.io.*;
import java.util.*;

public class website {

    private String u;
    private String k;

    public website (String url) {
        int s, e;
        for (s = 0; ;s++)
          if (url.charAt(s) == '.') break;
        for (e = s+1; ;e++)
          if (url.charAt(e) == '.') break;
        u = url;
        k = url.substring(s+1,e);
    }

    public String url () {
        return (u);
    }
    public String key () {
        return (k);
    }
    public String toString() {
        return (k + ": " + u );
    }

} // end of class website