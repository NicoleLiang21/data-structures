import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner in = new Scanner(sentence);
        Stack<String> words = new Stack<>();
        String next, reversed = "";
    	
        // Complete this method. Use a Stack.
        while (in.hasNext())
        {
            next = in.next();

            if (next.charAt(next.length() - 1) != '.')
                words.push(next);
            else
            {
                next = next.substring(0, next.length()-1);
                words.push(next);

                while (words.size() != 0)
                {
                    String firstWord = words.pop();
                    reversed += firstWord.substring(0, 1).toUpperCase() + firstWord.substring(1);

                    while (words.size() != 1)
                        reversed += " " + words.pop();
                    
                    reversed += " " + words.pop().toLowerCase() + ". ";
                }
            }

        }

        return reversed;

    }
}
