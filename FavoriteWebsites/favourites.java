/*
 * Assignment 5, July 2013
 * By: Tami Meredith
 */
import java.util.*;
import java.io.*;

public class favourites {

    /*
     * Some basic data to test the application
     * This data is here because there the application
     * cannot load or save data using files
     * *** CAN BE DELETED WHEN SAVE/LOAD WORK ***
     */
    public static String[] urls = {
        "http://www.google.com",
        "http://www.youtube.com",
        "http://www.amazon.com",
        "http://www.facebook.com",
        "http://www.ebay.com",
        "http://cs.smu.ca",
        "http://www.apple.com",
        "http://www.twitter.com",
        "http://www.live.com",
        "http://www.dell.ca",
        "http://www.yahoo.com",
        "http://www.linkedin.com",
        "http://www.blogspot.com",
        "http://www.tumblr.com",
        "http://www.pizzahut.com"
    };

    /*
     * The actual data used by the application
     * -- filled from setup() by using the data in urls[]
     * *** SHOULD BE FILLED USING LOAD() ***
     */
    public static final int MAXSITES = 100;
    public static website[] sites = new website[MAXSITES];
    public static int count = 0;


    // Fill websites[] using the data in urls[]
    // *** CAN BE DELETED WHEN SAVE/LOAD WORK ***
    /*public static void setup () {
        for (int i = 0; i < urls.length; i++) {
            sites[i] = new website(urls[i]);
        }
        count = urls.length;
    } // end setup()*/

    // Find and return the URL for a key or "not found"
    public static String lookup (String key) {
        for (int i = 0; i < count; i++) {
            if (key.equals(sites[i].key())) return (sites[i].url());
        }
        return ("not found");
    } // end lookup()

    // Add a new url to the database
    public static String add (String url) {
        if (count == MAXSITES)
            return ("Error: Database full");
        sites[count++] = new website(url);
        return ("Added " + url + " with key " + sites[count-1].key());
    } // end add()

    /* ----------------- FINISH THESE METHODS -------------------------- */

    // Save sites[] to a file
    public static void save (String filename) {
        FileOutputStream filestream;
        PrintWriter outprocessor;

        try {
        // use false if we want replace not append
            filestream = new FileOutputStream(filename, true);
            outprocessor = new PrintWriter(filestream);

            for (int i = 0; i < urls.length; i++) {
                outprocessor.println(sites[i]);
            }
            System.out.println("URL saved to database.");
            outprocessor.close();
       } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    // Load sites[] from a file
    public static void load (String filename) {
        Scanner input;
        String lineOfText;
        File filestream;

        try {
            filestream = new File(filename);
            input = new Scanner(filestream);
            // while loop for each line
            while (input.hasNext())
            {
                lineOfText = input.nextLine();
                add(lineOfText);
                System.out.println(lineOfText);
            }
            input.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }

    /* ----------------------------------------------------------------- */

    /*
     * Mainline
     */
    public static void main(String[] a) {

        // setup() can be deleted when save/load work correctly
        //setup();

        Scanner keyboard = new Scanner(System.in);
        String key;
        char input;
        do {
            System.out.printf("Command (h for help): ");
            input = keyboard.next().charAt(0);
            switch (input) {
                case 'q':
                    System.out.printf("Goodbye.");
                    break;
                case 's':
                    save("sites.txt");
                    break;
                case 'l':
                    load("sites.txt");
                    break;
                case 'a':
                    System.out.printf("URL to add: ");
                    System.out.printf("%s\n", add (keyboard.next()));
                    break;
                case 'f':
                    System.out.printf("Site key: ");
                    System.out.printf("URL: %s\n", lookup (keyboard.next()));
                    break;
                default:
                    System.out.printf("Commands\n  h: help\n");
                    System.out.printf("  s: save database to disk\n  l: load database from disk\n");
                    System.out.printf("  a: add a URL\n  f: find a URL\n  q: quit\n");
                    break;
            } // end switch
        } while (input != ('q'));

    } // end of main()

} // end of class favourites