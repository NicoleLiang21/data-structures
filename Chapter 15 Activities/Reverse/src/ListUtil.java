import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> iter = strings.listIterator();
        String name;

        int count = 1;
        while (iter.hasNext())
        {
            name = iter.next();
            iter.remove();
            iter = strings.listIterator(0);
            iter.add(name);
            iter = strings.listIterator(count);
            count++;
        }
    }
}