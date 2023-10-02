import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
/**
 * Read all words from a file and add them to a map
 * whose keys are the first letters of the words and
 * whose values are sets of words that start with
 * that same letter. Then print out the word sets in
 * alphabetical order. Update the map by modifying
 * Worked Example 15.1.
*/
public class FirstLetterMap
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/FirstLetterMap/FirstLetterMap2/src/test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            // Create your map here
            Map<Character, HashSet> words = new TreeMap<>();

            while (in.hasNext())
            {

                String word = clean(in.next());
                Character c = word.charAt(0);

                // Update the map here
                // Modify Worked Example 15.1
                HashSet<String> current = words.get(c);
                HashSet<String> newSet = new HashSet<>();
                newSet.add(word);

                if (current == null)
                    words.put(c, newSet);
                else
                {
                    current.add(word);
                    words.put(c, current);
                }
            }

            // Print the map here in this form
            // a: [a, able, aardvark]
            Set<Character> wordKeys = words.keySet();
            for (Character letter : wordKeys)
                System.out.println(letter + ": " + words.get(letter));
            

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
