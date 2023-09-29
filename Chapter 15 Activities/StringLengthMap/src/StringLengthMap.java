import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a
 * map whose keys are word lengths and whose values
 * are comma-separated strings of words of the same length.
 * Then print out those strings, in increasing order by
 * the length of their entries.
 * Modify Worked Example 15.1.
 */
public class StringLengthMap
{
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename = "Chapter 15 Activities/StringLengthMap/src/test1.txt";

        // Create your map here
        Map<Integer, String> words = new TreeMap<>();

        try (Scanner in = new Scanner(new File(filename)))
        {

            while (in.hasNext())
            {
                String word = clean(in.next());
                Integer len = word.length();

                // Update the map here
                // Modify Worked Example 15.1
                String current = words.get(len);

                if (current == "")
                    words.put(len, word);
                else
                    words.put(len, current + ", " + word);

            }

            // Print the strings, in increasing order of their length
            // Use this format: 1: i, a, i
            Set<Integer> wordSet = words.keySet();
            for (Integer i : wordSet)
                // have to cut the strings since "null" is always first element from initialization
                System.out.println(i + ": " + words.get(i).substring(6));


        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }

}
